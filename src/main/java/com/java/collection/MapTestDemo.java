package com.java.collection;

import java.util.*;
import java.util.stream.Collectors;

public class MapTestDemo {
    public static void main(String[] args) {
Set<Object> ani = new TreeSet<Object>();
        List<String> list = new ArrayList();
        list.add("dog");
                list.add("cat");
                list.add("tiger");
                list.add("lion");
                list.add("rabit");
                list.add("fox");
                list.add("fish");
                list.add("dragan");
                list.add("wolf");
                list.add("cub");
//ani = list.stream().collect(Collectors.toSet());

        Map<Integer,String> map=new HashMap<Integer,String>();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        map.put(6,"VEERA");

        System.out.println("Map before Remove "+map);
        map.remove(7);
        System.out.println("Map before Remove "+map);
    }
}
