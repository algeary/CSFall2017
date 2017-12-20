
public class CounterAttack {
	 public int[] analyze(String str, String[] words) {

int[] result = new int[words.length];
String[] newvals = str.split("\\s");
for (int i=0; i<words.length; i++) {
	int count=0; 
	for (int j=0; j<newvals.length; j++) {
		
		if (words[i].equals(newvals[j])) {
			count++;
		}
	}
	result[i] = count;
}
return result;} }
