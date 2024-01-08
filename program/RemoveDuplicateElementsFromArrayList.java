package com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(10);
        al.add(20);
        
        
       Set<Integer> set = new LinkedHashSet<Integer>(al);
       
       System.out.println(set);
		

	}

}
