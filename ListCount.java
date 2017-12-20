 public class ListCount {
      public int count (ListNode list) {
          if(list == null){return 0;}
          
          int counter = 1;
          while (list.next != null) {
        	  counter++;
        	  list.next = list.next.next;
          }
	  return counter;
      }
  }
