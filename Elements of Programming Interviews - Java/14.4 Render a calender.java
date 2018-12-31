int maxIntersections(ArrayList<Pair> arr){
    Map<Integer,Integer> map = new TreeMap<>();
    for(Pair p : arr){
        if(!map.contains(p.first)) map.put(p.first,1);
        else map.put(p.first,map.get(p.first)+1);
        if(!map.contains(p.second)) map.put(p.second,-1);
        else map.put(p.first,map.get(p.first)-1);
    }
    int curr = 0;
    int max = 0;
    for(Map.Entry<Integer,Integer> p : map.entrySet()){
        curr += p.getValue();
        max = Math.max(max,curr);
    }
    return max;
}
