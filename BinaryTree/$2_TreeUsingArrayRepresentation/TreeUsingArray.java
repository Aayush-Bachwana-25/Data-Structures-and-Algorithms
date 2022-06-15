import java.util.Scanner;

class TreeArray{
    private int[] arr;
    private int size;

    TreeArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no. of nodes::");
        this.size=scanner.nextInt();
        this.arr=new int[1000];
        int nodeCount=0;

        //Inputting node values

        //Root value:
        System.out.println("Enter root value::");
        arr[1]=scanner.nextInt();
        nodeCount+=1;

        for(int i=1;i<Math.pow(2, size)+1;i++){
            if(nodeCount==size){
                break;
            }
            if(arr[i]==-1){
                continue;
            }
            if(arr[(int)Math.floor(i/2)]==-1){
                continue;
            }
            System.out.println("Enter left child of "+arr[i]);
            arr[2*i]=scanner.nextInt(); //Inputting left child:2*i
            if(arr[2*i]!=-1){
                nodeCount++;
            }

            System.out.println("Enter right child of "+arr[i]);
            arr[2*i+1]=scanner.nextInt(); //Inputting right child:(2*i)+1
            if(arr[2*i+1]!=-1){
                nodeCount++;
            }
        }
        scanner.close();
    }

    private void displayTreeDataRecursively(int nodeNo){
        if(nodeNo>=arr.length){
            return;
        }
        if(arr[nodeNo]==-1 || arr[nodeNo]==0){
            displayTreeDataRecursively(nodeNo+1);
            return;
        }
        if(nodeNo<2*size+1){
            System.out.print(arr[nodeNo]+"\t");
            System.out.print(arr[2*nodeNo]+"\t\t");
            System.out.print(arr[2*nodeNo+1]+"\t\t");
            if(nodeNo!=1){
                System.out.print((int)Math.floor(nodeNo/2));
            }
            else{
                System.out.print("No-root");
            }
            System.out.println();
            displayTreeDataRecursively(nodeNo+1);
        }
        return;
    }


    void displayTree(){
        System.out.println("Tree::");
        System.out.println("Node\tLeft-Child\tRight-Child\tParent");
        
        int nodeNo=1;
        displayTreeDataRecursively(nodeNo);
    }

}

public class TreeUsingArray{
    public static void main(String[] args) {
        TreeArray treeArray=new TreeArray();
        treeArray.displayTree();
    }
}