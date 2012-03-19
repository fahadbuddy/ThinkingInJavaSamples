package com.shk.enterprises.tij4.collections.advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress{
	private String s;
	public StringAddress(String s){this.s = s;}
	public String toString(){
		return super.toString() + " " + s + "\n";
	}
}

public class FillingLists {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<StringAddress> list= new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello")));
		
		System.out.println(list);

	}

}
