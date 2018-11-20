
package tries;


public class Tries {

    private static Node root;
    public static void main(String[] args) {
       
        String[] keys ={"there", "their", "a", "the", "any", "answer", "by", "bye"};
        
        root=new Node();
        for(int i=0;i<keys.length;i++)
        {
            insert(keys[i]);
        }
        
        System.out.println(search("the"));
        System.out.println(search("their"));
        System.out.println(search("by"));
        System.out.println(search("b"));
        
    }
    
    public static void insert(String key)
    {
        int ind;
        int level;
        int length=key.length();
        
        Node pCrawl=root;
        for(level=0;level<length;level++)
        {
           ind= key.charAt(level) - 'a';
           if(pCrawl.children[ind]==null)
               pCrawl.children[ind]=new Node();
           
           pCrawl=pCrawl.children[ind];
        }
        
        pCrawl.isLeaf=true;
        
    }
    public static boolean search(String key)
    {
        int ind;
        int level;
        int length=key.length();
        
        Node pCrawl=root;
        for(level=0;level<length;level++)
        {
            ind=key.charAt(level) - 'a';
            if(pCrawl.children[ind]!=null)
                pCrawl=pCrawl.children[ind];
            else
                return false;
        }
        
        
        return (pCrawl!=null && pCrawl.isLeaf);
    }
}
