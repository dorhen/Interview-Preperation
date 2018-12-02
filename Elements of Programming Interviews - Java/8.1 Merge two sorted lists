import java.util.*;

class MergeSortedLists{
    
    static ListNode<Integer> merge(ListNode<Integer> l1, ListNode<Integer> l2){
        ListNode<Integer> newList = new ListNode<Integer>(0,null);
        ListNode<Integer> curr = newList;
        ListNode<Integer> curr1 = l1, curr2 = l2;
        while(curr1 != null && curr2 != null){
            if(curr1.data > curr2.data){
                curr.next = l1;
                curr1 = curr1.next;
            }
            else{
                curr.next = curr2;
                curr2 = curr2.next;
            }
        }
        curr.next = (l1 == null) ? l2:l1;
        return newList;
    }
}

public class ListNode<T>{
    public T data;
    public ListNode<T> next;
    
    public ListNode(T insert, ListNode<T> next){
        this.data = insert;
        this.next = next;
    }
}
