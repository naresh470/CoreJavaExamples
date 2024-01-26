package com.al.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntaration {
public static void main(String[] args) {
	List<String> listNames=new ArrayList<>();
	listNames.add("naresh");
	listNames.add("suresh");
	listNames.add("rajesh");
	listNames.add("mahesh");
	listNames.add("rakesh");
	
	for(String names:listNames) {
		System.out.println(names);
		listNames.remove(2);
	}
	
}
}
