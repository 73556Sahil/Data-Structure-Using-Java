package com.demo.beans;

import java.util.Arrays;

public class MyStack {
	private int arr[]=new int[5];
	private int size;
	private int top;
	
	public MyStack(){
		int arr[]=null;
		size=5;
		top=-1;
	}
	
	public MyStack(int size1) {
		int arr[]=new int [size1];
		size=size1;
		top=-1;
	}
	
	public boolean isEmpty(){
		if(top==-1) {
			return true;
		}else {
			return false;
		}
//		return top==-1;
	}
	
	public boolean isFull() {
		if (top==size-1)
			return true;
		else
			return false;
//		return top==size-1;
	}
	
	public boolean push(int v) {
		if(isFull()) {
			System.out.println("Stack is overflow");
			return false;
		}else {
			top++;
			arr[top]=v;
			return true;			
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is underflow");
			return -1;
		}else {
			int temp=arr[top];
			top--;
			return temp;
		}
	}
	public String toString() {
		return "arr=" + Arrays.toString(arr);
	}
}
