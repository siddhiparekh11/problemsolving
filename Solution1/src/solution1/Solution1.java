/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author siddhiparekh11
 */
public class Solution1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Set<String> result = permute("1920",0,3);
        SortedSet<LocalTime> times = new TreeSet<LocalTime>();
        
        LocalTime before,min,after;
        DateFormat format = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        Iterator i = result.iterator();
        System.out.println(result.size());
        before=LocalTime.parse(new StringBuilder("1920").insert(2, ":").toString());
        min=before;
        boolean flag = false;
        long elapsedMinutes=0;
       // System.out.println(min);
        while(i.hasNext())
        {
            Object o = i.next();
            String str = o.toString();
            //System.out.println(o);
            if(isValidTime(str))
            {
                
                String temp = new StringBuilder(str).insert(2, ":").toString();
                
                
                after=LocalTime.parse(temp);
                times.add(after);
              //  System.out.println(after);
                
                
               
               
               
                
            }
                
                
        }
        System.out.println(times);
        if(times.last().equals(before))
            System.out.println(times.first());
        else
        {
            Iterator ite = times.iterator();
            while(ite.hasNext())
            {
               Object p = ite.next();
                if(p.equals(before))
                {
                    
                    flag=true;
                }
                else if(flag)
                {
                    System.out.println(p);
                    break;
                }
            }
        }
       // System.out.println(min);
        /*i = times.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }*/
        
    }
    public static Set<String> permute(String str,int sind,int eind){
        Set<String> set = new HashSet<String>();
        if(sind==eind)
        {
            set.add(str);
            return set;
        }
        for(int i=sind;i<=eind;i++)
        {
            String s=swap(str,sind,i);
            Set<String> temp=permute(s,sind+1,eind);
            set.addAll(temp);
            
        }
        return set;
    }
    
    public static String swap(String str,int ind1,int ind2){
        char[] tempArr = str.toCharArray();
        char temp = tempArr[ind1];
        tempArr[ind1] = tempArr[ind2];
        tempArr[ind2] = temp;
        
        return String.valueOf(tempArr);
        
    }
    
    public static boolean isValidTime(String time){
        Pattern pattern;
        Matcher matcher;
        
        String reg="([01]?[0-9]|2[0-3])[0-5][0-9]";
        pattern = Pattern.compile(reg);
        matcher = pattern.matcher(time);
        
        return matcher.matches();
    }
}
