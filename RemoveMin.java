public class RemoveMin {
      public ListNode remove (ListNode list) {
          // replace statement below with code you write
    	  
    	  int curmin = 1000000000;
    	  int counter =1;
    	  int countert =1;
    	  int countmin =0;
    	  ListNode first = list;
    	  ListNode sec = list;
    	  while (first.next != null) {
    		  counter++;
    		  if(first.next.info<curmin) {
    			  curmin=first.next.info;
    			  countmin=counter;
    		  }
    		  first.next=first.next.next;
    	  }
    	  
    	  while (sec.next != null) {
    		  if(countert+1 == countmin){
    			  sec.next=sec.next.next;
    		  }
    	  }
	  return list;
      }
  }