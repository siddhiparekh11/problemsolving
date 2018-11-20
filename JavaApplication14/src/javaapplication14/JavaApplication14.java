/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.io.*;
import java.util.*;

/**
 *
 * @author siddhiparekh11
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
     
       
        String line;
        String[] tempArr=new String[3];
        ArrayList<Item> items=new ArrayList<Item>();
        int sum,count;
        double avg;
         
       //storing the input values
        while(true)
        {
            
            line=reader.readLine();
             if(line.equals(""))
                 break;
             
             tempArr=line.split(",");
             
             Item i=new Item();
             i.date=tempArr[0];
             i.noOfItems=tempArr[1];
             i.itemName=tempArr[2];
             
             items.add(i);
             
        }
        //check whether the items are getting stored
        /*for(Item i:items)
        {
            System.out.println(i.date + " " + i.noOfItems + " " + i.itemName);
        }*/
        //actual calculation
        for(int j=0;j<items.size();j++)
        {
           if(items.get(j).flag!=true)
           {
            sum=Integer.valueOf(items.get(j).noOfItems);
            count=1;
            avg=0.0;
            for(int k=j+1;k<items.size();k++)
            {
                if((items.get(j).date.equals(items.get(k).date)) && (items.get(j).itemName.equals(items.get(k).itemName)) && (items.get(k).flag!=true))
                {
                    sum= sum + Integer.valueOf(items.get(k).noOfItems);
                    count++;
                    items.get(k).flag=true;              
                }
            }
            //average calculation is here
            avg=(double)sum/count;
            System.out.println();
            System.out.print(items.get(j).date + " ");
            System.out.print(Integer.toString(sum) + " ");
            System.out.print(Double.toString(avg) + " ");
            System.out.print(items.get(j).itemName);
            
           }
        }
         
        
        
    }
    
    
}
