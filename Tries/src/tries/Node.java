
package tries;

import java.util.LinkedList;


public class Node {
    
   Node[] children=new Node[26];
   boolean isLeaf;
   
   Node()
   {
       isLeaf=false;
       for(int i=0;i<26;i++)
           children[i]=null;
   }
    
    
}
