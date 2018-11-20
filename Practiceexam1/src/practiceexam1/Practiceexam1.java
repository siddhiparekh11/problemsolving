/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexam1;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @author siddhiparekh11
 */
public class Practiceexam1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    System.out.println("Siddhi".substring(0,0));
    System.out.println(Integer.parseInt("230",5));
    System.out.println(Double.isNaN(0.0/0.0));
  //  System.out.format("%.2f %d %s",0.087,43,"siddhi");
  byte largestByte = Byte.MIN_VALUE;
        short largestShort = Short.MIN_VALUE;
        int largestInteger = Integer.MIN_VALUE;
        long largestLong = Long.MIN_VALUE;
 
        //real numbers
        float largestFloat = Float.MIN_VALUE;
        double largestDouble = Double.MIN_VALUE;
 
        //other primitive types
        char aChar = 'S';
        boolean aBoolean = true;
 
        //Display them all.
        System.out.println("The largest byte value is "
                           + largestByte + ".");
        System.out.println("The largest short value is "
                           + largestShort + ".");
        System.out.println("The largest integer value is "
                           + largestInteger + ".");
        System.out.println("The largest long value is "
                           + largestLong + ".");
 
        System.out.println("The largest float value is "
                           + largestFloat + ".");
        System.out.println("The largest double value is "
                           + largestDouble + ".");
        
        DecimalFormat format1 = new DecimalFormat("####.##");
        System.out.print(format1.format(5658.8086));
        
        System.out.println("She said \"Hello!\" to me.");
        System.out.println("siddhi".indexOf('i'));
        System.out.println("siddhi".lastIndexOf('i'));
        System.out.println("siddhi".substring(2, 6));
        System.out.println("siddhi".replace("id","di"));
        System.out.println("siddhi23874ddfkdfjkdl".replaceAll("[0-9]", "ll"));
        System.out.println("siddhi".substring(6));
    
  }
  
}
