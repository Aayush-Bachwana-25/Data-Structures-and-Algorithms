 package SortingAlgorithms;

public class QuickSort {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int[] arr,int low,int high){
        int pivot = arr[low];

        int i=low+1;
        int j= high;
//        int i=low;
//        int j=high+1;

        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
//            do{
//                i++;
//            }while(arr[i]<pivot);

            while(arr[j]>pivot){
                j--;
            }
//            do{
//                j--;
//            }while(arr[j]>pivot);

            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);

            quickSort(arr,low,pivot);
            quickSort(arr,pivot+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr={10,5,8,12,15,6,3,9,16};
////
////        int[] arr={5,2,3,7};
//
//        int[] arr={1,2,3,4,5};


        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
//        partition(arr,0,arr.length-1);
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
