//Returns null if there is no common node.
//Else returns the common node

ListNode<T> commonNode(ListNode<T> head1, ListNode<T> head2){
    int len = Math.abs(head1.length() - head2.length());
    if(head1.length > head2.length){
        while(len-- > 0)
            head1 = head1.next;
    }
    else{
        while(len-- > 0)
            head2 = head2.next;
    }
    while(head1 != head2){
        head1 = head1.next;
        head2 = head2.next;
    }
    
    return head1 != null ? head1 : null;

}
