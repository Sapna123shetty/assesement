1.Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal 
substring consisting of non-space characters only.
solution:
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            --i;
        }
        int j = i;
        while (j >= 0 && s.charAt(j) != ' ') {
            --j;
        }
        return i - j;
    }
}

Medium 2 

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
solution:

import java.io.*;

class GFG {
	static void findMajority(int arr[], int n)
	{
		int flag=0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > n/3) {
				System.out.print(arr[i]+" ");
				flag=1;
			}
		}

		if (flag==0)
			System.out.println("No Majority Element");

	}

	public static void main (String[] args) {
		int arr[] = { 2, 2, 3, 1, 3, 2, 1, 1 };
		int n = arr.length;
		findMajority(arr, n);
	}
}
Hard 2 
You are given a string s. You can convert s to a 
palindrome by adding characters in front of it.
Return the shortest palindrome you can find by performing this transformation.

class Solution {
    public String shortestPalindrome(String s) {
        int i=0; 
    int j=s.length()-1;
 
    while(j>=0){
        if(s.charAt(i)==s.charAt(j)){
            i++;
        }
        j--;
    }
 
    if(i==s.length())
        return s;
 
    String suffix = s.substring(i);
    String prefix = new StringBuilder(suffix).reverse().toString();
    String mid = shortestPalindrome(s.substring(0, i));
    return prefix+mid+suffix;
    }
}
