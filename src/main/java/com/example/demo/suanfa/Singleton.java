package com.example.demo.suanfa;

public class Singleton {
    private volatile static Singleton s;
    public static Singleton getInstance(){
        if(null==s){
            synchronized(Singleton.class){
                if(null==s){
                    s=new Singleton();
                }
            }
        }
        return  s;
    }

    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader();
        System.out.println();
        Singleton s1=getInstance();
        Singleton s2=getInstance();
        System.out.println(s1==s2);
    }
}
