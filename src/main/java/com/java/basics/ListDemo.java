package com.java.basics;

import java.util.ArrayList;
import java.util.Iterator;

class Employees{
    String name;
    int age;
    String DOB;
    double sal;

    public Employees(String name, int age, String DOB, double sal) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;

        Employees employees = (Employees) o;

        if (age != employees.age) return false;
        if (Double.compare(employees.sal, sal) != 0) return false;
        if (name != null ? !name.equals(employees.name) : employees.name != null) return false;
        return DOB != null ? DOB.equals(employees.DOB) : employees.DOB == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (DOB != null ? DOB.hashCode() : 0);
        temp = Double.doubleToLongBits(sal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
public class ListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("RAVI");
        al.add("RAM");
        al.add("VEERA");
        al.add("SWETHA");
        al.add("VASAVI");
        al.add("VENKAT");
        al.add("SUMIT");
        al.add("RAVI");
        al.add(null);
        al.add(100);
        al.add(100.00);
        al.add('C');
        al.add(true);

        System.out.println("ArrayList "+al);
        Iterator itr=al.iterator();
       /* while(itr.hasNext()){

            System.out.println(itr.next());
        }*/
        /*for(Object o : al){
            System.out.println(o.toString());
        }*/
        System.out.println(al.indexOf(100));
        //System.out.println(al.);

Employees ravi = new Employees("RAVI",34,"21-10-1984",1000.00);
Employees srini = new Employees("SINIVAS",30,"21-10-1984",100000.00);
Employees sumit = new Employees("SUMIT",28,"21-10-1988",1000000.00);
Employees veera = new Employees("RAVI",34,"21-10-1984",1000.00);
Employees swetha = new Employees("SWETHA",28,"21-10-1990",1000000.00);

ArrayList<Employees> emps = new ArrayList<Employees>();
emps.add(ravi);
emps.add(srini);
emps.add(sumit);
emps.add(veera);
emps.add(swetha);

        System.out.println("EMPLOYESS "+emps);

    }
}
