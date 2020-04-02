package com.example.demo.suanfa;

public class BubbleSort {
    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j+1]<array[j]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array={1,3,2,6,4,3};
        sort(array);
        for (int k=0;k<array.length;k++) {
            System.out.print(array[k]+"\t");
        }
    }
}
