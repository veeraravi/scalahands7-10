
class SuperClass{
    SuperClass(int i,int j){
        System.out.println("I am from super");
    }
    protected void disp(){

    }
}

class Sub extends SuperClass{
    Sub(){
        super(10,20);
    }

    @Override
    public void disp(){

    }
    public void prints(){

    }
}



public class Employee {
    String name;
    int age;
    double sal;

   // System.out.println(" ");





    Employee(String name,int age,double sal){
      this.name = name ;
      this.age = age;
      this.sal = sal;
        System.out.println("JAVA SWSSION");
       // System.out.println("I am in sinde class");
    }

    Employee(String name,int age){
        this(name,age,100.00);
        this.name = name ;
        this.age = age;
        this.sal = sal;
        System.out.println("JAVA SWSSION");
    }

public static void main(String[] args){

    String name = "scala";
    String course="scala";
    String s = new String("scala");
    String s1 = new String("scala");
    //System.out.println("I am in sinde class");
    System.out.println("HashCode of name "+name.hashCode());
    System.out.println("HashCode of course "+course.hashCode());
    System.out.println("HashCode of s "+s.hashCode());
    System.out.println("HashCode of s1 "+s1.hashCode());


    SuperClass sc = new Sub();
    sc.disp();



    if(name == course){
        System.out.println("name and course are equal");
    }else{
        System.out.println("name and course are not equal");
    }

    if(name == s){
        System.out.println("name and s are equal");
    }else{
        System.out.println("name and s are not equal");
    }

    if(name.equals(s)){
        System.out.println("content of name and s are equal");
    }else{
        System.out.println("name and s are not equal");
    }

    if(s1 == s){
        System.out.println("s1 and s are equal");
    }else{
        System.out.println("s1 and s are not equal");
    }
}

}
