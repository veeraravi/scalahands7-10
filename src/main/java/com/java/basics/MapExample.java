package com.java.basics;

import java.util.*;

class Book1 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book1(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book1)) return false;

        Book1 book1 = (Book1) o;

        if (id != book1.id) return false;
        if (quantity != book1.quantity) return false;
        if (name != null ? !name.equals(book1.name) : book1.name != null) return false;
        if (author != null ? !author.equals(book1.author) : book1.author != null) return false;
        return publisher != null ? publisher.equals(book1.publisher) : book1.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + quantity;
        return result;
    }
}

public class MapExample {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<Integer,String>();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        map.put(6,"VEERA");
        //Traversing Map
        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("=============================================");

        //Creating map of Books
        Map<Integer,Book1> map1=new HashMap<Integer,Book1>();
        //Creating Books
        Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
        Book1 b4=new Book1(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map1.put(1,b1);
        map1.put(2,b2);
        map1.put(3,b3);
        map1.put(4,b3);

        //Traversing map
        for(Map.Entry<Integer, Book1> entry:map1.entrySet()){
            int key=entry.getKey();
            Book1 b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

        Map<Book1,String> map2=new HashMap<Book1,String>();
        map2.put(b1,"LET US C");
        map2.put(b2,"Data Communications & Networking");
        map2.put(b3,"Operating System");
        map2.put(b4,"Operating System111111");


        System.out.println("*******************************************************");

        //Traversing map
        for(Map.Entry<Book1,String> entry:map2.entrySet()){
            Book1 b=entry.getKey();
            String value=entry.getValue();
            System.out.println(value+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

     // Iterator
    }
}
