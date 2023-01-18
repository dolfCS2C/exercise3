lass BasketballTeam {  
       
      private Coach handler;  
      private int wins;  
    
      public BasketballTeam() {  
          handler = null;  
          wins = 0;  
      }  
    
      public void activeplayer(int numOfPlayers) {  
          wins = wins + numOfPlayers;  
      }  
    
      public int getNumberOfPlayers() {  
          return wins;  
      }  
    
      public String getHandlerName() {  
          return handler.getName();  
      }  
    
      public void setHandler(Coach coach) {  
          handler = coach;  
      }  
    
      @Override  
      public String toString() {  
          return "Team's Name: " + handler.getTeam() + "\"  
                          + " Coach's Name: " + handler.getName() + "\"  
                          + " Regular Season Wins: " + wins;  
      }  
  } 
