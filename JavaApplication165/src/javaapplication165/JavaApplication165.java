/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication165;

/**
 *
 * @author siddhiparekh11
 */
public class JavaApplication165 {
  
      public static void main(String[] args) {
        
        System.out.println(isIPInRange("10.10.0.0" ,"10.11.0.0"));
      }
  
   public static boolean isIPInRange(String ipRange, String ipAddress) {
        
        String[] ipr = ipRange.split("[.]");
        String[] ipa = ipAddress.split(".");
        if(ipr.length>4 || ipa.length>4)
            return false;
        int i = 0;
        while(i<ipa.length){
            if(ipr[i].equals("0")){
                System.out.println(ipr[i] + " " +ipa[i]);
                int val = Integer.valueOf(ipa[i]);
                if(val >=0 && val <=255){
                    
                }else 
                    return false;
            }else {
               // System.out.println(ipr[i] + " " +ipa[i]);
                if(ipr[i].equals(ipa[i])){
                    
                }else
                    return false;
            }
            i++;
        }
        
        return true;

    }


}
