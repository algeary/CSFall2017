import java.util.Arrays;
import java.util.Comparator;

public class StringSort implements Comparator<String>{
	
    public  String[] sort(String[] words) {
    	Arrays.sort(words);
       Arrays.sort(words, new StringSort());

        return words;
    }

	@Override
	public int compare(java.lang.String a, java.lang.String b) {
    	if(a.length() < b.length()){
    		return 1;}
    	if(a.length() > b.length()){
    		return -1;
    	}
    	return 0;
    	
		
	}
	}
