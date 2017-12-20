  public class ListLastFirst {
      public ListNode move(ListNode list) {
          // replace statement below with code you write
    	  ListNode first = list;
    	  int val=0;	  
    		  
    	  while (first != null){
    	  if(first.next == null){
    		   val = first.info;
    		  first = null; 
    	  }
    	  first = first.next;
    	  }
    	 
    	  list = new ListNode(val, list);
          return list;
      }
  }