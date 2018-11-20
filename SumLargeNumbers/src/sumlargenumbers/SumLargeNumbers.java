
package sumlargenumbers;


public class SumLargeNumbers {

    
    public static void main(String[] args) {
      
        String no1,no2;
        no1="0";
        no2="0";
        String large,small;
        if(no1.length()>no2.length())
        {
            large=no1;
            small=no2;
        }
        else
        {
            small=no1;
            large=no2;
        }
        String start, end;
        
        start=large.substring(0, large.length()-small.length());
        end=large.substring((large.length()-small.length()),large.length());
        
       
        
        int sum=0;
        char[] res=new char[small.length()];
        
        
        for(int i=small.length()-1;i>=0;i--)
        {
            sum=sum+Integer.valueOf(String.valueOf(end.charAt(i)))+Integer.valueOf(String.valueOf(small.charAt(i)));
            
            if(sum>9)
            {
                res[i]=String.valueOf(sum%10).charAt(0);
                sum=sum/10;  
            }
            else
            {
                res[i]=String.valueOf(sum).charAt(0);
                sum=0;
            }
            
        }
       
       if(sum>0 && start.length()!=0)
       {
          // System.out.println(start);
           sum=sum + Integer.valueOf(start);
          // System.out.println(sum);
           
       }
      
       if(sum!=0)
        System.out.println(String.valueOf(sum) + String.valueOf(res));
       else
         System.out.println(String.valueOf(res));  
        /*char[] res1=new char[start.length()];
        int k=start.length()-1;
        while(k>=0)
        {
            sum=sum+Integer.valueOf(String.valueOf(start.charAt(k)));
            if(sum<=9)
            {
                res1[k]=String.valueOf(sum).charAt(0);
                sum=0;
            }
            else
            {
                res1[k]=String.valueOf(sum%10).charAt(0);
                sum=sum/10;
            }
            k--;
        }
        
        if(sum>0)
        System.out.println(String.valueOf(sum)+String.valueOf(res1)+String.valueOf(res));
        else
        System.out.println(String.valueOf(res1)+String.valueOf(res)); */   
    }
    
}
