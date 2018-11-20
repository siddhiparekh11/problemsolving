/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtreecreation;

import java.util.Scanner;
/**
 *
 * @author siddhiparekh11
 */
public class BinarySearchTreeCreation {

    /**
     * @param args the command line arguments
     */
    private static Node root;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int low,high;
        //inserting in the array
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //binary search and insertion
        low=0;
        high=n-1;
        binarySearch(arr,low,high);
        inorder(root);
        root=null;
        
    }
    public static void binarySearch(int[] arr,int low,int high)
    {
        int mid;
        if(low<=high)
        {
            mid=(low+high)/2;
            root=insertNode(root,arr[mid]);
            binarySearch(arr,low,mid-1);
            binarySearch(arr,mid+1,high);
        }
        
            
        
        
    }
    public static Node insertNode(Node root,int data)
    {
        if(root==null)
        {
            Node n=new Node();
            n.data=data;
            n.left=null;
            n.right=null;
            return n;
        }
        if(data<root.data)
            root.left=insertNode(root.left,data);
        else
            root.right=insertNode(root.right,data);
        
        return root;
        
    }
    
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
}
