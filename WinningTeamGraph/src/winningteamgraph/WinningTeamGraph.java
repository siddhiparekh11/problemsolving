
package winningteamgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WinningTeamGraph {

  public static void main(String[] args) {
    
    List<MatchResult> results = new ArrayList<>();
    results.add(new MatchResult("B","A"));
    results.add(new MatchResult("C","D"));
    results.add(new MatchResult("E","F"));
    results.add(new MatchResult("H","G"));
    results.add(new MatchResult("C","B"));
    results.add(new MatchResult("H","E"));
    results.add(new MatchResult("C","H"));
    
    
    System.out.println(canTeamABeatTeamB(results,"C","E"));
    
    
    
    
  }
  
  public static class MatchResult {
    public String winningTeam;
    public String losingTeam;
    
    public MatchResult(String winningTeam,String losingTeam){
      this.winningTeam = winningTeam;
      this.losingTeam = losingTeam;
    }
  }
  
  
  public static Map<String,Set<String>> buildGraph(List<MatchResult> matches){
    
    Map<String,Set<String>> graph = new HashMap<>();
    
    for(MatchResult m:matches){
      graph.putIfAbsent(m.winningTeam, new HashSet<>()); 
      graph.get(m.winningTeam).add(m.losingTeam);
    }
    
    return graph;
    
    
  }
  
  public static boolean isReachable(Map<String,Set<String>> graph, String teamA, String teamB,HashSet<String> visited){
    
    if(teamA.equals(teamB)) // if source and destination are same
      return true;
    
    if((graph.get(teamA)==null)||visited.contains(teamA))
      return false;
    visited.add(teamA);
    Iterator i = graph.get(teamA).iterator();
    while(i.hasNext()){
      if(isReachable(graph,i.next().toString(),teamB,visited))
        return true;
    }
    
    
    return false;
  }
  
  public static boolean canTeamABeatTeamB(List<MatchResult> matches,String teamA,String teamB){
    return isReachable(buildGraph(matches),teamA,teamB,new HashSet<>());
  }
  
}




