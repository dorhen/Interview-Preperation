/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		String input;
		for(int i = 0; i < num; i++){
		    input = reader.nextLine(); 
		    System.out.println(arrangeString(input));
		}
	}
	
	public static String arrangeString(String s){
	    int sum = 0;
	    int [] bucket = new int[26];
	    String ans = "";
	    for(int i = 0; i < s.length(); i++){
	        if(s.charAt(i) <= '9' && s.charAt(i)>= '0')
	            sum += (s.charAt(i) - '0');
	        else
	            bucket[s.charAt(i)-'A']++;
	    }
	    char c;
	    int j = 'A';
	    for(int i = 0; i < 26; i++){
	        c = (char)(j + i);
	        while(bucket[i]-- != 0){
	            ans += c;
	        }
	    }
	    ans+=sum;
	    return ans;
	}
}
