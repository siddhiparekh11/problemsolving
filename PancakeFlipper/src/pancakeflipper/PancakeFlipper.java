
package pancakeflipper;

import java.util.Scanner;

 
public class PancakeFlipper {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        int flips = pancakeFlipper(str,k);
        if(flips!=-1)
            System.out.println(flips);
        else if(flips==-1)
            System.out.println("Impossible");
        
       
       
    }
    
    public static int pancakeFlipper(String str,int k)
    {
        int n = str.length();
        int mFlips=0;
        char[] arr=new char[n];
        arr=str.toCharArray();
        
        for(int i=0;i+k-1<n;i++)
        {
            if(arr[i] == '-') {
                for(int j=0;j<k;j++)
                {
                    if(arr[i+j] == '-')
                        arr[i+j] = '+';
                    else if(arr[i+j] == '+')
                        arr[i+j] = '-';
                }
                mFlips++;
            }
                
        }
        System.out.println(String.valueOf(arr));
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='-'){
                mFlips = -1;
                break;
            }
                
        }
        
        return mFlips;
        
    }
    
}
