package com.example.demo.suanfa;

public class QuickSort {
    public static void sort(int [] array,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp=array[low];//基准点
        while(i<j){
            while(temp<=array[j]&&i<j){//看右边的哨兵
                j--;
            }
            while(temp>=array[i]&&i<j){//看左边的哨兵
                i++;
            }
            if (i<j){
                t=array[j];
                array[j]=array[i];
                array[i]=t;
            }
        }
        array[low]=array[i];
        array[i]=temp;
        sort(array,low,j-1);
        sort(array,j+11,high);
    }

    public static void main(String[] args) {
        int [] array={5,4,6,7,3,4,3,1};
        sort(array,0,array.length-1);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
