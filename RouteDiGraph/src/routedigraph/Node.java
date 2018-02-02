/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routedigraph;

import java.util.*;

/**
 *
 * @author siddhiparekh11
 */
public class Node {
    
    int data;
    int visited;
    ArrayList<Node> connections;
    
    void initialize()
    {
        connections=new ArrayList<Node>();
       
    }
    
}
