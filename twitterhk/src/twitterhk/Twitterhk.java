
package twitterhk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Twitterhk {

  
  public static void main(String[] args) {
    
    List<String> sentences = new ArrayList<String>();
    List<String> queries = new ArrayList<String>();
    
    sentences.add("how it was done it done");
    sentences.add("are you how");
    sentences.add("it goes to");
    sentences.add("goes done are it");
    
    queries.add("done it");
    queries.add("siddhi");
    
    textQueries(sentences,queries);
    
   
  }
  static  void textQueries(List<String> sentences, List<String> queries) {
        Twitterhk s = new Twitterhk();
        Twitterhk.Trie[] roots=new Twitterhk.Trie[sentences.size()];
        for(int i=0;i<sentences.size();i++){
            roots[i] = s.new Trie();
            String[] str = sentences.get(i).split(" ");
            for(int j=0;j<str.length;j++){
                roots[i].addWord(str[j]);
            }
        }
        
       // System.out.println(roots[0].searchWord("like",roots[0],0));
        
        for(int  i=0;i<queries.size();i++){
            String[] str = queries.get(i).split(" ");
            int j=0;
            int k=0;
            boolean flag=true;
            boolean flag1=false;
            while(j<str.length && k<roots.length){
             // int[] backup = roots[k].childcount.clone();  
              if(!roots[k].searchWord(str[j],roots[k],0))
                    flag=false;
                 j++;
                if(j==str.length||(!flag)){
                    if(flag){
                        System.out.print(k + " ");
                        flag1=true;
                    }
                    //else
                        //System.out.print("-1 ");
                    j=0;
                    //roots[k].childcount=backup;
                    k++;
                    flag=true;
                    
                    
                }
                
                    
            }
            if(!flag1)
                  System.out.print("-1");
            System.out.println();
        }
        
        
        
    }

   class Trie{
       Trie[] children = new Trie[52];
       int[] childcount = new int[52];
       boolean isleaf;
       Trie(){
           isleaf=false;
           for(int i=0;i<52;i++){
               children[i]=null;
               childcount[i]=0;
           }
       }
       void addWord(String s){
           int ind=0;
           Trie node = this;
           for(int l=0;l<s.length();l++){
               char c = s.charAt(l);
               ind= Character.isUpperCase(c)?(Character.toLowerCase(c) - 'a' + 26):(c - 'a');
               if(node.children[ind]==null){
                   node.children[ind] = new Trie();
                   node.childcount[ind] = 1;
               }else{
                   node.childcount[ind]+=1;
               }
               node = node.children[ind];
         }
           node.isleaf=true;
       }
       boolean searchWord(String s,Trie node,int i){
           if(node.isleaf==true && i==s.length())
               return true;
           else if(node.isleaf==false && i==s.length())
               return false;
           boolean result=false;
           char c = s.charAt(i);
           int ind= Character.isUpperCase(c)?(Character.toLowerCase(c) - 'a' + 26):(c - 'a');
           if(node.children[ind]!=null ){
               result=searchWord(s,node.children[ind],i+1);
               if(result)
                node.childcount[ind]-=1;
           }
           return  result;
       }
       
}
}
