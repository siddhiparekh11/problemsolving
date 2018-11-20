/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.HashMap;
import java.util.*;

/**
 *
 * @author siddhiparekh11
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       HashMap<String,String> emp=new HashMap<String,String>();
       
       emp.put("A", "C");
       emp.put("B", "C");
       emp.put("C", "F");
       emp.put("D","E");
       emp.put("E","F");
       emp.put("F","F");
       
       HashMap<String,List<String>> mngr=new HashMap<String,List<String>>();
       
       for(HashMap.Entry<String,String> entry: emp.entrySet())
       {
           String e1=entry.getKey();
           String m1=entry.getValue();
           if(!entry.getValue().equals(e1))
           {
               List<String> dirEmp=mngr.get(m1);
               if(dirEmp==null)
                  dirEmp=new ArrayList<String>(); 
                   
                 dirEmp.add(e1);
                 mngr.put(m1, dirEmp);
               
               
           }
       }
       
       HashMap<String,Integer> noReportingEmp=new HashMap<String,Integer>();
       
       for(HashMap.Entry<String,List<String>> entry: mngr.entrySet())
       {
           List<String> temp=entry.getValue();
           System.out.println("Employees under " + entry.getKey() + ":");
           for(String s: temp)
           {
               System.out.print(s + " ");
               if(mngr.containsKey(s))
                   noReportingEmp.put(s, mngr.get(s).size());
               else
                   noReportingEmp.put(s, 0);
           }
           System.out.println();
       }
       
     /* for(HashMap.Entry<String,Integer> e: noReportingEmp.entrySet())
      {
          System.out.println("Number of employees under " + e.getKey() + " are " + e.getValue());
      }*/
     
      HashMap<String,Integer> finale=new HashMap<String,Integer>();
      int count;
      for(HashMap.Entry<String,List<String>> entry: mngr.entrySet())
       {
           List<String> temp=entry.getValue();
           count=0;
           for(String s:temp)
           {
               count=count+ noReportingEmp.get(s);
           }
           count=count+ temp.size();
           finale.put(entry.getKey(),count);
       }
      
       
      /* for(HashMap.Entry<String,Integer> e: finale.entrySet())
      {
          System.out.println("Number of employees under " + e.getKey() + " are " + e.getValue());
      }*/
       for(HashMap.Entry<String,Integer> e: noReportingEmp.entrySet())
      {
          if(!finale.containsKey(e.getKey()))
              finale.put(e.getKey(),e.getValue());
      }
       
        for(HashMap.Entry<String,Integer> e: finale.entrySet())
      {
          System.out.println("Number of employees under " + e.getKey() + " are " + e.getValue());
      }
       
    }
    
}
