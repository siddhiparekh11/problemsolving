/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemptyslot1;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author siddhiparekh11
 */
public class Kemptyslot1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,5,3,4,2};
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        Iterator i = set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
    }
    
}
