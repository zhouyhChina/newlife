package com.example.demo.suanfa;

import java.util.ArrayList;
import java.util.List;

public class FindNum {
    public static int [] sort(int [] array,int num) {
        int[] target = new int[2];
        for (int i = 0, j = array.length - 1; i < j; ) {
            if ((array[i] + array[j]) == num) {
                target[0] = array[i];
                target[1] = array[j];
            } else if ((array[i] + array[j]) < num){
              i++;
            }else {
                j--;
            }

        }
        return target;
    }
    static String x="1";
    static int y=1;
    public static void main(String[] args) {
       /* List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String str:list
             ) {
            if ("1".equals(str)){
                list.remove(str);
            }
        }
        System.out.println(list);*/
        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }


}
