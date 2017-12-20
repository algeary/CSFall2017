import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class ServiceNames {
	public String[] makeList(String[] services) {
		Map<String,TreeSet<String>> listAns = new TreeMap<>();
		
		
		for(String s : services) {
			String[] current = s.split(" ");
			for(int k=1; k < current.length; k++) {
				if (! listAns.containsKey(current[k])) {
					listAns.put(current[k], new TreeSet<>());}
				listAns.get(current[k]).add(current[0]);}}
		ArrayList<String> Answ = new ArrayList<>();
		for(String s : listAns.keySet()) {
			String partOne = s + " ==> ";
			String partTwo = String.join(", ", listAns.get(s));
			Answ.add(partOne+partTwo);}
		
		return Answ.toArray(new String[0]);
	}
}
