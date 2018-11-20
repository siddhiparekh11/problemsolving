/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueimp;

import java.util.*;
/**
 *
 * @author siddhiparekh11
 */
public class Queueimp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(1);
        int j=q.remove();
        System.out.println(j);
        
    }
    
}
