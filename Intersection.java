import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intersection {
     public String matches(String[] entries) {
    	 List<String> result = new ArrayList<String>(); 
    	 String[] indivog = entries[0].split("\\s");
    	 String[] indiv = entries[1].split("\\s");
    	 for (int j=0; j<indivog.length; j++) {
			 for (int k=0; k<indiv.length; k++) {
				 if (indivog[j].equals(indiv[k])) {
					 if (! result.contains(indiv[k])){
					 result.add(indiv[k]);}
				 }
    	 
    	 for (int i=1; i<entries.length; i++){
    		 String[] indivnew = entries[i].split("\\s");
    		 for (int m=0; m<result.size(); m++) {
    			 int torf =0;
    		 
    			for (int n=0; n<indivnew.length ; n++){
    				if(indivnew[n].equals(result.get(m))){
    					torf=1;
    				}} 
    			if (torf ==0) {
    				result.remove(result.get(m));
    			}
    			}
    			 }
    	 }
    	



}
     Collections.sort(result);
     result.toArray();
     String ans = "";
     if (result.size()>0){
      ans = result.get(0);}
     for (int l=1; l<result.size(); l++){
    	 ans = ans + " " + result.get(l);
     }
     
     return ans;}}


