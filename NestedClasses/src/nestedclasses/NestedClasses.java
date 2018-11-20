
package nestedclasses;


public class NestedClasses {
    
    private int a;
    private int b;
    public int c;
    
    NestedClasses(int a,int b)
    {
        this.a = a;
        this.b = b;
        this.c=10;
    }
    
    void printAB()
    {
        System.out.println(a);
        System.out.println(b);
    }
    
    class InnerClass
    {
        private int c=5;
        int addAB()
        {
            return a+b;
        }
        
        void shadowTest(int c)
        {
            System.out.println("Parameter c " + c);
            System.out.println("Outer class c " + NestedClasses.this.c);
            System.out.println("Inner class c " + this.c);
            
        }
    }
    
    static class StaticInnerClass
    {
        void printAB()
        {
            NestedClasses obj = new NestedClasses(3,4);
            obj.printAB();
            
        }
    }

    
    public static void main(String[] args) {
        
        NestedClasses outerobj = new NestedClasses(2,3);
        NestedClasses.InnerClass innerobj = outerobj.new InnerClass();
        
       StaticInnerClass staticobj = new StaticInnerClass();
       staticobj.printAB();
        
        int res = innerobj.addAB();
        System.out.println(res);
        
        innerobj.shadowTest(15);
       
    }
    
}
