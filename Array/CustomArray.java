package Array;

import java.util.Scanner;

public class CustomArray {
    int[] arr;
    int capacity;       //Total Capacity
    int size;           //No. of elements

    //Junk variables
    static int temp;

    CustomArray(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter capacity of array::");
        capacity=sc.nextInt();
        arr=new int[capacity];

        System.out.println("Enter no. of elements to insert::");
        size=sc.nextInt();

        if(size<=capacity) {
            System.out.println("Enter values::");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        }
        else{
            System.out.println("Unexpected Input::No. of elements can't be greater than capacity");
        }
    }

    void display(){
        System.out.print("Array is::");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    boolean append(int value){
        if(size<capacity){
            arr[++size-1]=value;
            return true;
        }
        return false;
    }

    void addElements(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("No. of elements to insert::");
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            int value=scanner.nextInt();
            append(value);
        }
    }

    boolean insert(int index,int value){
        int i;
        if(size<capacity){
            for(i=size-1;i>=index;i--){
                arr[i+1]=arr[i];
            }
            arr[i+1]=value;
            size++;
            return true;
        }
        return false;
    }

    boolean pop(int position){
        int index=position-1;
        if(index >=0 && index<size) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            return true;
        }
        return false;
    }

    boolean update(int pos,int value){
        if(pos>0 && pos<=size){
            arr[pos-1]=value;
            return true;
        }
        return false;
    }

    int linearSearch(int value){
        for(int i=0;i<size;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }

    int get(int index){
        if(index>=0 && index<size){
            return arr[index];
        }
        return -1;
    }

    int getMaximum(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    int getMinimum(){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    void reverse(){
        int i, j;

        for(i=0,j=size-1;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    void reverseSection(int i,int j){
        for(;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    int binarySearchRecursive(int value,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low + high)/2;

        if(arr[mid]==value){
            return mid;
        }
        else if(arr[mid]>value){
            return binarySearchRecursive(value,low,mid-1);
        }
        else{
            return binarySearchRecursive(value,mid+1,high);
        }
    }

    int binarySearchIterative(int value,int low,int high){
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==value){
                return mid;
            }
            else if(arr[mid]>value){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    void rotateWithoutauxiliaryArrayRecursion(int index,int times,int count){
        count++;

        if(count==size){
            temp=arr[index];
            return;
        }

        rotateWithoutauxiliaryArrayRecursion((index+times)%size,times,count);
        arr[(index+times)%size]=arr[index];

        if(index==0){
            arr[0]=temp;
        }
    }

    void rotateWithoutauxiliaryArrayWithoutRecursion(int times){
        reverseSection(size-times,size-1);
        reverseSection(0,size-times-1);
        reverse();
    }

    void rotate(int times){
        //Method 1 --> O(n2)
//        for(int i=0;i<times;i++){
//            int temp=arr[0];
//
//            for(int j=0;j<size-1;j++){
//                arr[j]=arr[j+1];
//            }
//            arr[size-1]=temp;
//        }

        //Method 2 -->
        // O(n) with auxiliary space
//        int[] temp=new int[size-times];
//
//        int p=0;
//        for(int i=times;i<size;i++){
//            temp[p++]=arr[i];
//        }
//        for(int i=0;i<size;i++){
//            arr[(i+times+1)%size]=arr[i];
//        }
//
//        for(int i=0;i<temp.length;i++){
//            arr[i]=temp[i];
//        }

        //Method 3 -->
        //Reverse without using any auxiliary space using Recursion     // O(n) without auxiliary space
//        rotateWithoutauxiliaryArrayRecusrion(0,times,0);

        //Method --> 4
        //Reversing using Algorithm         // O(n) without auxiliary space
        rotateWithoutauxiliaryArrayWithoutRecursion(times);


    }

    boolean insertAtSortedPosition(int value){
        if(size< capacity-1) {
            System.out.println("Array should be sorted");

            for (int i = 0; i < size; i++) {
                if (value < arr[i]) {
                    insert(i, value);
                    return true;
                }
            }
            insert(size, value);
            return true;
        }
        return false;
    }

    boolean checkSort(){
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter your choice::");
        System.out.println("1. Create Array");
        System.out.println("2. Add Elements");
        System.out.println("3. Append(int value)");
        System.out.println("4. Insert(int index,int value)");
        System.out.println("5. Pop(int index)");
        System.out.println("6. LinearSearch(int value)");
        System.out.println("7. BinarySearchIterative(int value,int low,int high)");
        System.out.println("8. BinarySearchRecursive(int value,int low,int high)");
        System.out.println("9. DisplayArray");
        System.out.println("10. Get(int index)");
        System.out.println("11. Update(int position,int value)");
        System.out.println("12. Maximum element");
        System.out.println("13. Minimum element");
        System.out.println("14. Reverse");
        System.out.println("15. Rotate Section of Array");
        System.out.println("16. Rotate array n times");
        System.out.println("17. Enter element in sorted Array at sorted position");
        System.out.println("18. Checking if an Array is Sorted or not?");
        System.out.println("19. Exit");

        Scanner scanner=new Scanner(System.in);

        CustomArray cArray=new CustomArray();

        while(true) {
            System.out.println("Enter choice::");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    break;

                case 2:
                    cArray.addElements();
                    break;

                case 3:
                    System.out.println("Enter value to append::");
                    int value = scanner.nextInt();
                    cArray.append(value);
                    break;

                case 4:
                    System.out.println("Enter the index for insertion::");
                    int pos = scanner.nextInt();
                    System.out.println("Enter the value to insert::");
                    value = scanner.nextInt();

                    cArray.insert(pos, value);
                    break;

                case 5:
                    System.out.println("Enter index::");
                    pos = scanner.nextInt();
                    cArray.pop(pos);
                    break;

                case 6:
                    System.out.println("Enter value to search::");
                    int key = scanner.nextInt();
                    System.out.println(cArray.linearSearch(key));
                    break;

                case 7:
                    System.out.println("Enter value to search::");
                    key = scanner.nextInt();
                    System.out.println(cArray.binarySearchRecursive(key, 0, cArray.size - 1));
                    break;

                case 8:
                    System.out.println("Enter value to search::");
                    key = scanner.nextInt();
                    System.out.println(cArray.binarySearchIterative(key, 0, cArray.size - 1));
                    break;

                case 9:
                    cArray.display();
                    break;

                case 10:
                    int index = scanner.nextInt();
                    System.out.println("Value::" + cArray.get(index));
                    break;

                case 11:
                    System.out.println("Enter position::");
                    pos = scanner.nextInt();
                    System.out.println("Enter value::");
                    value = scanner.nextInt();
                    cArray.update(pos, value);
                    break;

                case 12:
                    System.out.println("Maximum::" + cArray.getMaximum());
                    break;

                case 13:
                    System.out.println("Minimum::" + cArray.getMinimum());
                    break;

                case 14:
                    cArray.reverse();
                    break;

                case 15:
                    int i, j;

                    System.out.println("Enter the range of index for Rotation::");
                    i = scanner.nextInt();
                    j = scanner.nextInt();
                    cArray.reverseSection(i, j);
                    break;


                case 16:
                    System.out.println("Enter the times for rotation::");
                    int times = scanner.nextInt();
                    cArray.rotate(times);
                    break;

                case 17:
                    System.out.println("Enter value for insertion");
                    value=scanner.nextInt();
                    cArray.insertAtSortedPosition(value);
                    break;

                case 18:
                    if(cArray.checkSort()){
                        System.out.println("Array is Sorted");
                    }
                    else{
                        System.out.println("Array is not Sorted");
                    }
                    break;

                case 19:
                    System.exit(-1);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("-------------------------------------------------------------------------------------------");
        }

    }
}


