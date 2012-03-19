package com.shk.enterprises.tij4.generics;

public class Holder3<T> {

	private T a;
	
	public Holder3(T a){
		this.a = a;
	}
	
	public void set(T a){
		this.a = a;
	}
	
	public T get(){
		return a;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Holder3<String> sub = new Holder3<String>("Fahad");
		
		//sub.set(3);
	}

}
