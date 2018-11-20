/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication82;

/**
 *
 * @author siddhiparekh11
 */
public class JavaApplication82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String str=solution("11:00");
    }
   
    public static String solution(String S) {
        // write your code in Java SE 8
        
        String s=S.replace(":","");
        String ans="";
        permute(s,0,s.length(),ans);
        String result=ans.substring(0,2) + ":" + ans.substring(2,ans.length());
        return result;
        
    }
    
    static String  permute(String S,int sind,int eind,String ans)
    {
        int min=0;
        int res=0;
        String str="";
        ans="";
        if(sind==eind-1)
            return "";
        for(int i=sind;i<eind;i++)
        {
            str=permute(S,sind+1,eind,ans);
            
            str=swap(str,sind,i);
            res=Integer.valueOf(str);
            if(res >= 0 && res<=2359)
                {
                    if(isValidTime(res))
                    {
                        if(min<=res)
                            min=res;
                    }
                }
        }
        ans=String.valueOf(res);
        return str;

              
    }
    
    
    
    static String  swap(String S,int sind,int eind)
    {
        char[] arr=S.toCharArray();
        char temp;
        temp=arr[sind];
        arr[sind]=arr[eind];
        arr[eind]=temp;
        
        return arr.toString();
        
        
    }
    
    static boolean  isValidTime(int res)
    {
       boolean flag=false;
       if(res%10<=9)
       {
           res=res/10;
           if(res%10<=5)
           {
               flag=true;
           }
       }
       
       return flag;
    }
}
    

