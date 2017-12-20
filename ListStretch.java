 public class ListStretch {
      public ListNode stretch (ListNode list, int amount){
          // replace statement below with code you write
    	  ListNode first=new ListNode(list.info);
    	  ListNode last=first;
    //	  while (list != null) {
    		  for (int i = 1; i<=amount; i++){
    			  last.next = new ListNode(list.info);
    			  last=last.next;
    		//  }
    	  }
          return first;
      }
  }