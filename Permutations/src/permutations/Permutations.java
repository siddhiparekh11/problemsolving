
package permutations;


import java.util.*;


public class Permutations {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string you want to permute");
        String perStr=sc.next();
        Permutations p=new Permutations();
        p.permute(perStr,0,perStr.length()-1);
    
    }
    
    public void permute(String str,int start,int end)
    {
        if(start==end)
            System.out.println(str);
        else
        {
            for(int i=start;i<=end;i++)
            {
                str=swap(str,start,i);
                permute(str,start+1,end);
            }
        }
    }
    public String swap(String str,int i,int j)
    {
        char[] arr=str.toCharArray();
        char c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
        
        return String.valueOf(arr);
    }
}