package com.example.demo.suanfa;

public class Sqrt {
    public static double sqrt(int i){
        double low=i/2;
        double high=i;
        while(high-low>0.0000001){
            double mid=(low+high)/2;
            if(mid*mid==i){
                return mid;
            }else if (mid*mid<i){
                low= mid;
            }else{
                high= mid;
            }
        }
        System.out.println(low);
        return high;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(5));

    }
}
