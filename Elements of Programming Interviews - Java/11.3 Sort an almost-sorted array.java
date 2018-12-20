public static void SortK(Iterator<Integer> itr, int k){
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k, (a,b) -> a-b);
    int i = 0;
    while (i < k && itr.hasNext()){
        q.add(itr.next());
    }
    while(itr.hasNext()){
        System.out.println(q.poll());
        q.add(itr.next());
    }
    while(!q.isEmpty()){
        System.out.println(q.poll());
    }
}
