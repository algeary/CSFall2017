import java.util.ArrayList;

public class EvenCount {
      public int count (ListNode list){
    	  ListNode first=list;
    	  ListNode last = first;
    	  int counter =0;
    	  ArrayList<Integer> filler = new ArrayList<Integer>();
    	  filler.add(first.info);
          // replace statement below with code you write
    	  while(first.next != null) {
    		  
    		  filler.add(first.next.info);
    		  first=first.next;
    	  }
    	  
    	  while(list != null){
    		  if((list.info%2 ==0 ) && (! filler.contains(list.info))){
    			  counter++;
    		  }
    		  list=list.next;
    	  }
          return counter;
      }
  }