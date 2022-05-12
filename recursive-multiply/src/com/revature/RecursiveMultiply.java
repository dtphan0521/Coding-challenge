package com.revature;

public class RecursiveMultiply {
	static int multiply(int a, int b) {
        
        if (b == 0)
            return 0;
     
        if (b > 0)
            return (a + multiply(a, b - 1));
     
        if (b < 0)
            return -multiply(a, -b);
             
        return -1;
    }
     
    public static void main(String[] args) {
         
        System.out.print("\n" + multiply(2, -14));
    }

}
