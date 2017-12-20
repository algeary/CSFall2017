import java.util.ArrayList;
import java.util.List;

public class SimpleWordGame {
      public int points(String[] player, 
                        String[] dictionary) {
          int score = 0;
          List<String> correctAns = new ArrayList<String>();
          for (int i=0; i < dictionary.length; i++) {
        	  for (int j =0; j< player.length; j++) {
        		  if (dictionary[i].equals(player[j]) ) {
        			  if (! correctAns.contains(player[j])){
        			  correctAns.add(player[j]);
        			  score = score + (player[j].length() * player[j].length());}
        		  }
        	  }
          }
          return score; 
      }
      
  }