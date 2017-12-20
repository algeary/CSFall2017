  public class SnowyWinter {
      public int snowyHighwayLength(int[] startPoints, 
                                    int[] endPoints) {
    	  int sum =0;
    	  for(int i=0; i<startPoints.length; i++){
    		  sum = sum + endPoints[i]-startPoints[i];
    	  }
    	  
    	  for(int j=0; j<startPoints.length; j++){
    		  int current=startPoints[j];
    		  int currentEnd = endPoints[j];
    		  for(int k=0; k<startPoints.length; k++){
    			  if((current >startPoints[k] && current<endPoints[k])){
    				  sum= sum - (current-startPoints[k]);
    			  }
    			  if((currentEnd >startPoints[k] && currentEnd<endPoints[k])){
    				  sum= sum - (endPoints[k]-currentEnd);
    			  }
    		  }
    	  }
return sum;
          // fill in code here
      }
  }