public class LevelSum {
	int sum=0;
	int left =0;
	int right =0;
        public int sum(TreeNode tree) {
        	int lvlcountl =1;
        	int lvlcountr =1;
        	
        	//int rsum =0;
            //suggested,not required
            return sumHelper(tree,lvlcountl, lvlcountr);
        }

       
        // suggested, not required
        private int sumHelper(TreeNode tree, int lvlcountl, int lvlcountr){
        	if(tree==null){return 0;}
        	if (tree.left ==null && tree.right ==null){
        		
        		sum= sum+lvlcountr;
        		lvlcountl=lvlcountl-1;
        		lvlcountr=lvlcountr-1;
        	}
        
        	
        	if(tree.left !=null){
        		sum=sum+lvlcountl;}
        	if(tree.right != null){
        		sum=sum+ lvlcountr;
        	} 
        	
            // replace with working code
            return sum+ sumHelper(tree.left, lvlcountl++, lvlcountr)+sumHelper(tree.right, lvlcountl, lvlcountr++);
        }
    }