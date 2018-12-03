import java.util.*;
import java.lang.*;

class StringConversion{
    
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rand = (int)(Math.random()*-10000);
        System.out.println("Original int: " + rand);
        String s = String.valueOf(rand);
        System.out.println("My int: " + convert(s));
    }
	
    static int convert(String s){
        int i = 0;
        boolean negative = false;
        if(s.charAt(0) == '-'){
            i = 1;
            negative = true;
        }
        int power = 0;
        int num = 0;
        for(int k = s.length() - 1; k >= i; k--){
            num+=((s.charAt(k) - '0')*Math.pow(10,power));
            power++;
        }
        if(negative)return -1*num;
        return num;
    }
}
