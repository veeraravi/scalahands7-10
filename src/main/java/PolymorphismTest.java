

class Shape{
    public void draw(){
        System.out.println("Drawing from shape");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
    public void myPrint(){
        System.out.println("Printing circle stuff");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
}

class Tringle extends Shape{
    public void draw(){
        System.out.println("Drawing Tringle");
    }
}


public class PolymorphismTest {
    public static void main(String[] args) {
       Circle c = new Circle();
        c.draw();
        c.myPrint();
        //  c = new Shape()

       Square s = new Square();
        s.draw();

        Tringle t = new Tringle();
        t.draw();
        System.out.println("=========================");

        Shape sh = new Shape();
        sh.draw();

        Shape sh2 = new Circle();
        sh2.draw();
       // sh2.myPrint();



    }
}
