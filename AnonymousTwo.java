public class Anonymous {
      public int howMany(String[] headlines, String[] messages) {
            int count = 0;
            int headCount =0;
            for (int i=0; i<headlines.length; i++) {
            	headCount = headCount + headlines[i].length();
            }
            char[] fillHead = new char[headCount];
            for(int i =0;i<fillHead.length;i++){
            	headlines[i] = headlines[i].toUpperCase();
            	 fillHead =headlines[i].toCharArray();
                
                		
             
            }
            
            
        /*    int messCount =0;
            for (int i=0; i<messages.length; i++) {
            	messCount = messCount + messages[i].length();
            }
            char[][] fillMess = new char[messCount][];
            for(int i =0;i<fillMess.length;i++){
                fillMess[i]=messages[i].toCharArray();
            }  */
            
            
            boolean containsAll = true;
            for (int l=0; l<messages.length; l++) {
            	char[] fillMess = new char[messages[l].length()];
            	messages[l] = messages[l].toUpperCase();
            	fillMess=messages[l].toCharArray();
            		for(int j=0; j< fillMess.length; j++) {
            			for (int k=0; k< fillHead.length; k++) {
            			if (fillHead[k] == fillMess[j]) {
                			containsAll = true;}
                		else {containsAll = false; }
            		}}
            		
            	if (containsAll == true) { count++;}
            }
            return count;
      }
   }