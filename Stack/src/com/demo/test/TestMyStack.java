package com.demo.test;

import java.util.Arrays;

import com.demo.beans.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack ob=new MyStack(5);
		ob.push(45);
		ob.push(89);
		ob.push(23);
		ob.push(57);
		ob.push(13);
		System.out.println(ob);
		while(!ob.isEmpty())
			System.out.println(ob.pop());
	
		
	}

}
