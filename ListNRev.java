public class ListNRev {
	
	public ListNode nlist(int n) {
		ListNode first = new ListNode(n);
		ListNode last = first;
		for(int i=0; i < n-1; i++) {
			last.next = new ListNode(n);
			last = last.next;
		}
		return first;
	}
	
	public ListNode make(int n) {
		ListNode list = nlist(n);
		if (n == 1) return list;
		
		ListNode last = list;
		while (last.next != null) {
			last = last.next;
		}
		last.next = make(n-1);
		return list;
	}
}

