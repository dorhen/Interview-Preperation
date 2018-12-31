public static void permutations(ArrayList<Integer> arr){
        ArrayList<Integer> tmp = new ArrayList<>();
        allPermutations(arr, tmp, arr.size());
    }

    public static void allPermutations(ArrayList<Integer> arr, ArrayList<Integer> tmp, int j){
        if(tmp.size() == j) {
            System.out.println(tmp);
            return;
        }
        ArrayList<Integer> temp2 = new ArrayList<>(arr);
        for(int i = 0; i < temp2.size(); i++){
            Integer k = temp2.remove(i);
            tmp.add(k);
            allPermutations(temp2, tmp, j);
            temp2.add(i,k);
            tmp.remove(k);
        }
    }
