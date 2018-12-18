
package javaapplication193;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class SequenceReconstruction {


  public static void main(String[] args) {
    
    List<String> seqs = new ArrayList<>();
    
    /*seqs.add("12");
    seqs.add("13");
    seqs.add("23");*/
   
   /*seqs.add("12");
   seqs.add("13");*/
   
  seqs.add("5263");
   seqs.add("4152");
    
    
    
  HashMap<String,Integer> indegree = new HashMap<>();  
  HashMap<String,HashMap<String,Integer>> predecessors = new HashMap<>();
    
    for(int i=0;i<seqs.size();i++){
      String s = seqs.get(i);
      for(int j=0;j<s.length();j++){
        String chr = String.valueOf(s.charAt(j));
          if(j==0){
            if(!indegree.containsKey(chr))
              indegree.put(chr,0);
          }else{
          if(predecessors.get(chr)==null)
            predecessors.put(chr, new HashMap<>());
          int c = predecessors.get(chr).getOrDefault(String.valueOf(s.charAt(j-1)),0);
          predecessors.get(chr).put(String.valueOf(s.charAt(j-1)),c+1);
          if(predecessors.get(chr).get(String.valueOf(s.charAt(j-1)))<=1)
            indegree.put(chr, indegree.getOrDefault(chr,0) + 1);
      }
      }
    }
    
    System.out.println("Indegrees");
    String start = "";
    for(Map.Entry<String,Integer> e:indegree.entrySet()){
      System.out.println(e.getKey()+" "+e.getValue());
      if(e.getValue()==0)
        start = e.getKey();
    }
    System.out.println("---------------------------");
    Comparator<String> InDegreeComparator = new Comparator<String>(){
      @Override
      public int compare(String o1, String o2) {
        if(indegree.get(o1)>indegree.get(o2))
      return 1;
    return -1;
      }
     };
    
    
    HashMap<String,Set<String>> graph = new HashMap<>();
    
    for(int i=0;i<seqs.size();i++){
      String s = seqs.get(i);
      for(int j=0;j<s.length();j++){
        String chr = String.valueOf(s.charAt(j));
        if(!graph.containsKey(chr))
          graph.put(chr, new HashSet<>());
        if(j!=s.length()-1)
          graph.get(chr).add(String.valueOf(s.charAt(j+1)));    
      }
    }
    
    HashMap<String,List<String>> sorted = new HashMap<>();
    System.out.println("Graph unsorted with neighbors");
    for(Map.Entry<String,Set<String>> e:graph.entrySet()){
      List<String> list = new ArrayList<>(e.getValue());
      Collections.sort(list,InDegreeComparator);
      sorted.put(e.getKey(),list);
      System.out.println(e.getKey() + " " + e.getValue());
    }
    System.out.println("---------------------------");
    System.out.println("Graph sorted via indegrees :)");
    for(Map.Entry<String,List<String>> e: sorted.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
    
    System.out.println("Topological sort");
    Stack<String> stack = new Stack<>();
    Set<String> visited = new HashSet<>();
    dfs(sorted,stack,start,visited);
    
    
    while(!stack.isEmpty())
      System.out.print(stack.pop()+ " ");
    
    System.out.println();
    
  }
  
  public static void dfs(HashMap<String,List<String>> map,Stack<String> stack,String start,Set<String> visited){
    
    if(visited.contains(start))
      return;
    visited.add(start);
    for(int i=0;i<map.get(start).size();i++){
      dfs(map,stack,map.get(start).get(i),visited);
    }
    stack.add(start);
    
  }
  
  
  
}


