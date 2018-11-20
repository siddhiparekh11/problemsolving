
package printbinary;


public class PrintBinary {

    
    public static void main(String[] args) {
        
        int n=4;
        String prefix="";
        printBinary(n,prefix);
        
    }
    
    static void printBinary(int n, String prefix)
    {
        if(n==0)
        {
            System.out.println(prefix);
        }
        else
        {
            printBinary(n-1,prefix + "0");
            printBinary(n-1,prefix + "1");
        }
    }
    
}
