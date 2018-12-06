
public class SublistReverse {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(11,null);
		ListNode n2 = new ListNode(3,null);
		ListNode n3 = new ListNode(5,null);
		ListNode n4 = new ListNode(7,null);
		ListNode n5 = new ListNode(2,null);
		n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
		System.out.println(n1);
		subListReverse(n1,2,4);
		System.out.println(n1);
	}
	
	
	static void subListReverse(ListNode head, int i , int j){
	    ListNode p = null;
	    ListNode curr = head.next;
	    ListNode prev = head;
	    ListNode next;
	    ListNode k = null;
	    int counter = 2;
	    while(curr!=null && counter <= j){
	        if(counter == i){
	            p = prev;
	            k = curr;
	            prev = curr;
	            curr = curr.next;
	        }
	        else if(counter > i && counter < j){
	            next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }
	        else if(counter == j){
	            next = curr.next;
	            curr.next = prev;
	            k.next = next;
	            p.next = curr;
	        }
	        else{
	        	prev = curr;
	            curr = curr.next;
	        }
	        counter++;
	    }
	}
}
