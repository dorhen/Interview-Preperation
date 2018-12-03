//Could have used Deque less specific solution.

public class ListNode{
    public ListNode next;
    public ListNode prev;
    public int data;
    public int maxUntilNow;
    public ListNode(int val, ListNode next){
        this.data = val;
        this.next = next;
        maxUntilNow = 0;
    }
}

import java.lang.*;

public class MaxStack{
    public ListNode head;
    public int size;
    public MaxStack(){
        head = new ListNode(0,null);;
        size = 0;
    }
    
    public void push(int i){
        if(size == 0){
            head.next = new ListNode(i, null);
            ListNode curr = head;
            head = head.next;
            head.prev = curr;
            head.maxUntilNow = i;
            size++;
        }
        else{
            head.next = new ListNode(i, null);
            ListNode curr = head;
            head = head.next;
            head.prev = curr;
            head.maxUntilNow = Math.max(i,head.prev.maxUntilNow);
            size++;
        }
    }
    
    public int pop() throws NullPointerException{
    	if(size == 0) throw new NullPointerException("Stack is empty");
        int toReturn = head.data;
        head = head.prev;
        return toReturn;
        
    }
    
    public int max(){
        return head.maxUntilNow;
    }
}
