package com.example.demo.suanfa;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRU <K,V> extends LinkedHashMap<K,V> {
    private int maxSize;
    public LRU(int size){
        super(16, (float) 0.75,true);
        this.maxSize=size;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        //当LinkHashMap的容量大于等于5的时候,再插入就移除旧的元素
        return this.size() >maxSize;
    }

    public static void main(String[] args) {
        int [] array={1,3,4,3,32,1,3,4,56,6};
        LRU<Integer,Integer> map=new LRU(4);
        map.put(9,3);
        map.put(7,4);
        map.put(5,9);
        map.put(3,4);
        map.put(6,6);
        map.put(7,6);
        map.put(9,6);
        //总共put了5个元素，超过了指定的缓存最大容量
        //遍历结果
        for(Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator(); it.hasNext();){
            System.out.println(it.next().getKey());
        }
    }



}
