
package javaexampra;

import java.util.ArrayList;
import java.util.List;

public class Javaexampra {
    
    int aa;
    
    public Javaexampra()
    {
        this.aa=0;
    }
    
    public Javaexampra(int val)
    {
        this.aa = val;
    }
    
    public void incrementA(int val)
    {
        aa = aa + val;
    }
    
    
    
    
    public void printaa()
    {
        System.out.println(aa);
    }
    
    
    
    public static void main(String[] args) {
        
        Javaexampra  obj = new Javaexampra(2);
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        System.out.println(list.get(0));
        obj.printaa();
        checkPassbyVal(obj);
        obj.printaa();
        
        
        String[] values ={"ABC","DEF","GHI"};
        printValues(values);
    }
    
    public static void printValues(String... values)
    {
        for(int i=0;i<values.length;i++)
            System.out.println(values[i]);
    }
    
    public static void checkPassbyVal(Javaexampra obj)
    {
        obj.incrementA(3);
        obj = new Javaexampra();
    }
    
}
