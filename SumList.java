package com.revature;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class SumList {
	public static int sum(int ...values) {
	        int sum = 0;
	        for(int i=0; i<values.length; i++) {
	            sum += values[i];
	        }
	        return sum;
	    }

	public static int listValue(String number1Num, LinkedList<Integer> list) {
		Iterator<Integer> iterator;
	    StringBuilder num = new StringBuilder();

	    if (Objects.equals(number1Num, "start")) {
	            iterator = list.iterator();
	            } else {
	            iterator = list.descendingIterator();
	            }
	    while (iterator.hasNext()) {
	    	num.append(iterator.next());}
	    return Integer.valueOf(num.toString());
	    }
	public static void main (String[] args) {
		LinkedList<Integer> number1 = new LinkedList<>();
		LinkedList<Integer> number2 = new LinkedList<>();

		number1.addFirst(3);
		number1.add(4);
		number1.addLast(8);

		number2.addFirst(5);
		number2.add(9);
		number2.addLast(6);


        int forward1 = listValue("start", number1);
        int forward2 = listValue("start", number2);

        int reverse1 = listValue("", number1);
        int reverse2 = listValue("", number2);

        int forwardResult = sum(forward1, forward2);
        int reverseResult = sum(reverse1, reverse2);

        System.out.println("Number 1 (forward): " + forward1);
        System.out.println("Number 2 (forward): " + forward2);
        System.out.println("Number 1 (reverse): " + reverse1);
        System.out.println("Number 2 (reverse): " + reverse2);
        System.out.println("Sum forward order: " + forwardResult);
        System.out.println("Sum reverse order: " + reverseResult);
    }

   
}