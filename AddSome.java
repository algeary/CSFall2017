public class AddSome {
      public ListNode splice(ListNode list, int size){

    	  
    	  
    	 if (list ==null){return null;}  
       ListNode first = list;
       ListNode last=list;//new ListNode(first.info);
        ListNode splice=list;//new ListNode(first.info);
        
        for (int i =0; i<size; i++){
        	first=first.next;
        	splice.next=new ListNode(first.info, first.next);
        	//last.next=first;//new ListNode(first.next.info);
        	
	
        }
        while(list.next != null){
        	
        splice.next=new ListNode(list.info, list.next);
        list=list.next;}
        
     /*   while(splice.next != null){
        	
        	last.next=splice;//new ListNode(splice.next.info);
        	splice=splice.next;
        	
        }
       last.next=first;
        while(first.next !=null){
        	first=first.next;
        	last.next=first;//new ListNode(first.next.info);
        	
        }
*/
          return splice;
      }
  }