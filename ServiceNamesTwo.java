import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceNames {
       public String[] makeList(String[] services) {
    	   List<String> listAns = new ArrayList<String>();
    	   for (int i=0; i<services.length; i++) {
    		   String[] current = services[i].split(" ");
    		   String input = current[i];
    		   Arrays.sort(current);
    		   String newAns = input + " ==> " + current[1];
    		   for (int j = 0; j<current.length; j++) {
    			   if (! current[j].equals(input)){
    				newAns = newAns + ", " + current[i];
    		   		
    	   }} listAns.add(newAns);}
    	   
    	   String[] kindsOfOutput = new String[listAns.size()];
      	 kindsOfOutput = listAns.toArray(kindsOfOutput);
      	 return kindsOfOutput;
       
       
    }}