
package twitter2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Twitter2 {

 
  public static void main(String[] args) {
  List<String> sentences = new ArrayList<String>();
  List<String> queries = new ArrayList<String>();
    
    sentences.add("how it was done");
    sentences.add("are you how");
    sentences.add("it goes to");
    sentences.add("goes done are it");
    
    queries.add("done it");
    queries.add("siddhi");
    
    textQueries(sentences,queries);
    
   
  }
  static  void textQueries(List<String> sentences, List<String> queries) {
        Twitter2 s = new Twitter2();
        Twitter2.Trie trie =s.new Trie();
        
        
        for(int i=0;i<sentences.size();i++){
             String st = sentences.get(i);
             String[] str = st.split(" ");
             for(int j=0;j<str.length;j++)
                  trie.addWord(str[j]);
        }
        
        
      
        
      
        
    }

   class Trie{
       Trie[] children = new Trie[52];
       int[] charCount = new int[52];
       boolean isleaf;
       Trie(){
           isleaf=false;
           for(int i=0;i<52;i++){
               children[i]=null;
               charCount[i]=0;
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
                   node.charCount[ind] = 1;
               }else{
                   node.charCount[ind]+=1;
               node = node.children[ind];
               }  
           node.isleaf=true;
          }
       }
       boolean searchWord(String s){
           int ind=0;
           Trie node = this;
           for(int l=0;l<s.length();l++){
               char c = s.charAt(l);
               ind= Character.isUpperCase(c)?(Character.toLowerCase(c) - 'a' + 26):(c - 'a');
               if(node.children[ind]!=null && node.charCount[ind]>0){
                  node = node.children[ind];
                  node.charCount[ind]-=1;
               }
               else
                    return false;
         }
           return (node!=null && node.isleaf);
       }
       
}
  
}
