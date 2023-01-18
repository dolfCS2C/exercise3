 public class Coach {  
    
      private String name;  
      private String team;  
    
      public Coach() {  
          name = "Unassigned";  
          team = "Unassigned";  
      }  
    
      public String getTeam() {  
          return team;  
      }  
    
      public String getName() {  
          return name;  
      }  
    
      public void setTeam(String teamname) {  
          team = teamname;  
      }  
    
      public void setName(String coachName) {  
          name = coachName;  
      }  
  } 
