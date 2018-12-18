public static boolean Palindromicity(String s){
    int low = 0;
    int high = s.length()-1;
    s = s.toLowerCase();
    while(low < high){
        if(NonAlphabetic(s.charAt(low))){
            low++;
            continue;
        }
        if(NonAlphabetic(s.charAt(high))){
            high--;
            continue;
        }
        if(s.charAt(low++) != s.charAt(high--)) return false;
    }
    
    
    return true;
}

public static boolean NonAlphabetic(char c){
    if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) return true;
    return false;
}
