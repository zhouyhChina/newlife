package com.example.demo.suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class StockFind {
    public static void main(String[] args) throws IOException {
        Map m= new HashMap<>();
        List list=new ArrayList();
        System.out.println(list.size());
        Map ch=new ConcurrentHashMap();
       /* BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=br.readLine())!=null) {
            String[] chArr = str.split(" ");

            int[] intArr = new int[chArr.length];
            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = Integer.parseInt(chArr[i]);
            }
            System.out.println(MaxDiff(intArr));
        }*/
    }
    public static int MaxDiff(int[] arr) {
        if(arr==null || arr.length<2)
            return -1;  //error
        int min=arr[0];

        //最大利润可以是负数，只要亏损最小就行
        int maxDiff=arr[1]-min;
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1]<min)     //保存“之前”最小数字
                min=arr[i-1];
            if(arr[i]-min>maxDiff)
                maxDiff=arr[i]-min;
        }

        //默认不能亏本，代码简单，上面复杂的代码注意细节
//      int maxDiff=0;
//      for(int i=1;i<arr.length;i++) {
//          if(arr[i]<min)
//              min=arr[i];
//          else if(arr[i]-min>maxDiff)
//              maxDiff=arr[i]-min;
//      }
        return maxDiff;
    }
}
