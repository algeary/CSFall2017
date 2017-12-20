import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberCheck {
      public String[] whosDishonest(String[] club1, 
                                    String[] club2, 
                                    String[] club3) {
             // TODO: fill in code here
    	  List<String> cheaters = new ArrayList<String>();
    	//  String[] daCheaters = new String[(club1.length + club2.length + club3.length)];
    	  
    	  
    	  for (int i =0; i<club1.length; i++) {
    		  String currentCheck = club1[i];
    		  for (int j = 0; j< club2.length; j++) {
    			  if (currentCheck.equals(club2[j])) {
    				  if (! cheaters.contains(currentCheck)) {
    				  cheaters.add(currentCheck);}
    			  }
    		  }
    	  }
    	  
    	  
    	  for (int i =0; i<club1.length; i++) {
    		  String currentCheck = club1[i];
    		  for (int j = 0; j< club3.length; j++) {
    			  if (currentCheck.equals(club3[j])) {
    				  if (! cheaters.contains(currentCheck)) {
        				  cheaters.add(currentCheck);}
    			  }
    		  }
    	  }
    	  
    	  
    	  for (int i =0; i<club2.length; i++) {
    		  String currentCheck = club2[i];
    		  for (int j = 0; j< club3.length; j++) {
    			  if (currentCheck.equals(club3[j])) {
    				  if (! cheaters.contains(currentCheck)) {
        				  cheaters.add(currentCheck);}
    			  }
    		  }
    	  }
    	  
    /*	 for (int k =0; k < cheaters.size(); k++) {
    		 for (int l =0; l < cheaters.size(); l++) {
    			 if (cheaters.get(k) == (cheaters.get(l))) {
    				 cheaters.remove(cheaters.get(l));
    			 }
    		 } 
    	 } */
    	 String[] secCheaters = new String[cheaters.size()];
    	 secCheaters = cheaters.toArray(secCheaters);
    	  Arrays.sort(secCheaters);
    	 return secCheaters;
      }
      
   }