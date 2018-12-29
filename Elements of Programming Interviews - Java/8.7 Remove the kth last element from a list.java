void removeKthLast(ListNode<Integer> head, int k){
    LisNode<Integer> temp = head;
    while(k-- > 0 && head != null)
        head = head.next;
    if(head == null && k > 0) return;
    while(head != null){
        head = head.next;
        temp = temp.next;
    }
    temp.data = temp.next.data;
    temp.next = temp.next.next;
}
