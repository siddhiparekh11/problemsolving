
package covariantreturntype;


public class CovariantReturnType {

    
    public static void main(String[] args) {
        
        
        Subclass res = (Subclass) check();
        
        System.out.println(res.geta());
        System.out.println(res.getb());
        
    }
    
    public static Superclass check() //instance of subclass is returned but the signature type is the superclass
    {
        Subclass obj = new Subclass();
        obj.setb(10);
        return obj;
    }
    
}
