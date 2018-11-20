
package javaexampra1;


public class Javaexampra1 {
    
    public static int x =7;
    public int y = 3;

   
    public static void main(String[] args) {
        
        Javaexampra1 obj1 = new Javaexampra1();
        Javaexampra1 obj2 = new Javaexampra1();
        
        obj1.y=5;
        obj2.y=6;
        obj1.x=1;
        obj2.x=2;
        
        System.out.println(obj1.y);
        System.out.println(obj2.y);
        System.out.println(obj1.x);
        System.out.println(obj2.x);

       System.out.println(Javaexampra1.x);
    }
    
}
