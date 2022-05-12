
package com.revature;

public class MagicIndex {
	
	 static int MagicIndexSearch(int arr[], int n)
	    {
	        int i;
	        for (i = 0; i < n; i++) {
	            if (arr[i] == i)
	                return i;
	        }
	  
	        return -1;
	    }

	    public static void main(String args[])
	    {
	        int arr[] = { -10, -1, 0, 3, 5, 7, 10, 11, 20, 30, 50, 100 };
	        int n = arr.length;
	        System.out.println("Magic index is "
	                           + MagicIndexSearch(arr, n));
	    }
	}