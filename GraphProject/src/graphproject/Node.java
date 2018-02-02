/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphproject;

import java.util.ArrayList;

/**
 *
 * @author siddhiparekh11
 */
public class Node {
    
    int data;
    int visited;
    ArrayList<Node> incoming;
    ArrayList<Node> outgoing;
    
    void outini()
    {
        
        
        outgoing=new ArrayList<Node>();
       
    }
    void incini()
    {
        incoming=new ArrayList<Node>();
    }
    
}
