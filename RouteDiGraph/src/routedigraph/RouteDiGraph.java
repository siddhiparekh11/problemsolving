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
public class RouteDiGraph {

    /**
     * @param args the command line arguments
     */
   
    private static Graph g;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        g=new Graph();
        Scanner sc=new Scanner(System.in);
        int choice;
        boolean flag=false;
        
        while(true)
        {
            System.out.println("Select an operation");
            System.out.println("Type 1 to add a vertice");
            System.out.println("Type 2 to add an edge");
            System.out.println("Type 3 to print");
            System.out.println("Type 4 to find out if the route exists");
            System.out.println("-1 to terminate");
            choice=sc.nextInt();
            switch(choice)
            {
                case -1:
                    flag=true;
                    break;
                    
                case 1:
                    System.out.println("Enter vertice value:");
                    addVertice(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the nodes between which you want to add an edge");
                    addEdge(sc.nextInt(),sc.nextInt());
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    System.out.println("Enter the nodes between which you want to find a route");
                    routeExist(sc.nextInt(),sc.nextInt());
                    break;
                    
                    
            }
            
            if(flag)
                break;
            
        }
        
        
    }
    
    public static void addVertice(int val)
    {
        boolean flag=false;
        flag=g.addNode(val);
        if(flag)
            System.out.println("Node successfully added");
        else
            System.out.println("Failed to add the node");
        
    }
    
    public static void addEdge(int node1,int node2)
    {
        boolean flag=false;
        flag=g.addEdge(node1, node2);
        if(flag)
            System.out.println("Edge successfully added");
        else
            System.out.println("Failed to add the edge");
    }
    
    public static void print()
    {
        g.printGraph();
    }
    
    public static void routeExist(int node1,int node2)
    {
        boolean flag=false;
        flag=g.routeBfs(node1, node2);
        
        if(flag)
            System.out.println("Route exist.");
        else
            System.out.println("Route doesn't exist");
        
        
    }
    
    
    
}
