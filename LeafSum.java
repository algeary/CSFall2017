import java.util.ArrayList;

public class LeafSum {
	 int sum;
        public int sum(TreeNode t) {
        	ArrayList<Integer> dummy = new ArrayList<Integer>();
        	
        	dummy.add(preOrder(t.left));
        	dummy.add(preOrder(t.right));
        	
        	for (int i=0; i<dummy.size(); i++) {
        		if (dummy.get(i+1) == 'x') {
        			 sum = sum +dummy.get(i);
        		}
        	}
        	
        	
  /*          if (t.left == null) {
            	sum=sum+t.left.info;
            }
            if (t.right == null) {
            	sum=sum+t.right.info;
            } */
            return sum(t.left) + sum(t.right);
        }
    }