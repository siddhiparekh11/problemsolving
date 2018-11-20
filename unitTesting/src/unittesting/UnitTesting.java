
package unittesting;


public class UnitTesting {
    
    private int a;
    private int b;
    
   
    
    public UnitTesting(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    public int addTwoNumbers()
    {
        return a+b;
    }

   
    public static void main(String[] args) {
        
        UnitTesting a = new UnitTesting(2,3);
        int res = a.addTwoNumbers();
        
        System.out.println(res);
        
    }
    
}
