 public class ListParity {
	
      public int count (ListNode list){
    	  if (list == null){return 0;}
    	  int sum=0;
    		 int loc =0;
          while(list != null){
        	  loc++;
        	  if(loc%2!=0){
        	  sum=sum+list.info;}
        	  list=list.next;
          }
     
      return sum;}
      
  }