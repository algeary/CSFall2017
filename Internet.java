import java.util.*;

public class Internet {
	TreeMap<Integer,Set<Integer>> myMap;
	
	
	// return where we can reach starting at start
	// and not going through forbidden 
	
	private Set<Integer> reachable(int start, int forbidden) {
		TreeSet<Integer> seen = new TreeSet<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		seen.add(start);
		while (stack.size() > 0) {
			int current = stack.pop();
			for(int to : myMap.get(current)) {
				if (to != forbidden && ! seen.contains(to)) {
					seen.add(to);
					stack.push(to);
				}
			}
		}
		return seen;
	}
	
	public int articulationPoints(String[] routers) {
		
		// make myMap.get(k) be a set of what's connected to k
		
		myMap = new TreeMap<>();
		for(int k=0; k < routers.length; k++) {
			myMap.put(k, new TreeSet<>());
		}
		
		// for each k, what is it directly connected to?
		
		for(int k=0; k < routers.length; k++) {
			String[] connects = routers[k].split(" ");
			for(String s : connects) {
				int toDex = Integer.parseInt(s);
				myMap.get(k).add(toDex);
				myMap.get(toDex).add(k);
			}
		}
		
		// for each k, if we remove it, can we get everywhere ?
		int badCount = 0;
		for(int k=0; k < routers.length; k++) {
			
			// avoid k, but start somewhere, so start at k+1
			// if we reach everywhere but k? not articulation
			
			Set<Integer> reached = reachable((k+1) % routers.length,k);
			if (reached.size() != routers.length-1) {
				badCount += 1;
			}
		}
		return badCount;
	}
	
	public static void main(String[] args) {
		String[] data = {"2","2 3","0 1 3 4",
				         "1 2","2 5 6","4 6","4 5"};
		Internet net = new Internet();
		System.out.println(net.articulationPoints(data));
	}
}
