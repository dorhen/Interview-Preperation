

static void subListReverse(Node<T> head, int i , int j){
    Node<T> p = null;
    Node<T> curr = head.next;
    Node<T> prev = curr;
    Node<T> next;
    Node<t> k;
    int counter == 0;
    while(curr!=null && counter <= j){
        if(counter == i){
            p = prev;
            k = curr;
            next = curr.next
        }
        if(counter > i && counter < j){
            next = curr.next;
            curr.next = prev;
            curr = next;
        }
        if(counter == j){
            next = curr.next;
            k.next = next;
            p.next = curr;
        }
        
    curr = curr.next;
    counter1++;
    }
}
