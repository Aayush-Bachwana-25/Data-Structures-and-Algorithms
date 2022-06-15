package SortingAlgorithms;

public class MergeSort {
    static int k=0;
    static int[] temp;

    static int[] mergeSort(int[] arr,int[]temp,int low,int high){



        if(low<high){
            int mid=(low+high)/2;

            mergeSort(arr,temp,low,mid);
            mergeSort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);
        }

        return temp;
    }

    static void merge(int []arr,int[] temp,int low,int mid,int high){
        int i=low;
        int j=mid+1;

        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
    }
    public static void main(String[] args) {
//        int[] arr={2,1,6,8,4,6,2,3};
        int[] arr={9,3,7,5,6,4,8,2};
        temp=new int[arr.length];
        arr=mergeSort(arr,temp,0, arr.length-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
