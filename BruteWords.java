import java.util.Arrays;
import java.util.List;

public class BruteWords {
       public int getScore(String str){
    	   
    	   
    	  
    	/*   String[] newvals = str.split("");
    	   int[] result = new int[Arrays.asList(newvals).size()];
    	   List<String> newvalsrepl = Arrays.asList(newvals);
    	   for (int i=0; i<newvalsrepl.size(); i++) {
    	   	int count=0; 
    	   	for (int j=0; j<newvals.length; j++) {
    	   		
    	   		if (newvalsrepl.get(i).equals(newvals[j])) {
    	   			count++;
    	   		}
    	   	}
    	   	result[i] = count;
          
       }
    	  double score = 0;
    	  double highCount = 0;
    	  for (int k=0; k<result.length; k++) {
    		  score = score + Math.pow(result[k], 2);
    		  if (Math.pow(result[k], 2) > highCount) {
    			  highCount = Math.pow(result[k], 2);
    		  }
    	  }
    	  
    	  
    	  
    	  int newscore = score.intValue();
    	  score = score - highCount + newhighCount;
    	  
    	  
    	  
    	   return score; } } */
    	   
    	   
    	   String[] newvals = str.split("");
    	   int[] result = new int[Arrays.asList(newvals).size()];
    	   
    	   for (int i=0; i<str.length(); i++) {
    		   int count=0;
       	   	for (int j=0; j<newvals.length-1; j++) {
       	   		if (newvals[j].equals(newvals[j+1])) {
       	   			count++;
       	   		}
       	   		result[i] = count;
       	   	}
       	   	int score =0;
       	   	for (int k=0; k<result.length; k++){ 
       	   		score =score + result[k]*result[k];
       	   	}
    	   
    	   int bigScore =score;}
    	   int BigScore = 1;
    	   int[] result2 = new int[Arrays.asList(newvals).size()];
    	  // int[] result = new int[Arrays.asList(newvals).size()];
    	  // List<String> newvalsrepl = Arrays.asList(newvals);
    	   for (int l=0; l<str.length()-1; l++) {
    	   str.replace(newvals[l], newvals[l+1]);
    	   for (int m=0; m<str.length(); m++) {
    		   int count2=0;
       	   	for (int n=0; n<newvals.length-1; n++) {
       	   		if (newvals[n].equals(newvals[n+1])) {
       	   			count2++;
       	   		}
       	   		result2[m] = count2;
       	   	}}
       	   	int score2 =0;
       	   	for (int k=0; k<result.length; k++){ 
       	   		score2 =score2 + result2[k]*result2[k];
       	   	}
       	  /* 	if (score2>score){
       	   		score=score2;
       	   		bigScore=score2;}*/
       	   	}
    	     
    	   
     
    	   return BigScore;
       
       }}
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   