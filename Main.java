import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

//your code goes here
class Square extends Shape{
    
    Square(int x){
       width = x;
    }
    
    public void area(){
            System.out.println("the Area of Square is " + width*width);
        }
    
    
}
class Circle extends Shape{
    
     Circle(int y){
       width = y;
       
    }
    
    public void area(){
            System.out.println( "area of Circle is " + width*width*Math.PI);
        }
    
    
}

public class Main {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle");        
        int y = sc.nextInt();
        System.out.print("Enter radius of Square");  
        int x = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);        
        b.area();
        a.area();
    }
}
