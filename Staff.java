public class Staff {  
    
      public static void main(String[] args) {  
          Coach coach1, coach2;  
          BasketballTeam before, after;  
    
          coach1 = new Coach();  
          coach1.setName("Steve Kerr");  
          coach1.setTeam("Golden State Warriors");  
                    
                  coach2 = new Coach();  
          coach2.setName("Mark Jackson");  
          coach2.setTeam("Golden State Warriors");  
    
          before = new BasketballTeam();  
          before.setHandler((coach1));  
          before.activeplayer((434));  
    
          after = new BasketballTeam();  
          after.setHandler((coach2));  
                  after.activeplayer((121));  
                    
                  System.out.println(before.toString());  
                  System.out.println(" Year: 2015-2023:");  
                  System.out.println(" Star Players: Curry, Thompson, Green" + "\");  
                    
          System.out.println(after.toString());  
          System.out.println(" Year: 2012-2014:");  
                  System.out.println(" Stars: Lee, Curry" + "\");  
                    
      }  
  }
