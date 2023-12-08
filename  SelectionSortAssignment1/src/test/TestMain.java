package test;

import java.util.Arrays;

import Service.PersonService;
import beans.Person;

public class TestMain {

	public static void main(String[] args) {
//		Person[] arr= new Person[1];
//		Person P=new Person(1,"sahil",13);
//		System.out.println(P);
		
		
		
		Person[ ]arr=new Person[3];
		PersonService ps=new PersonService();
		
		ps.acceptdata(arr);
		System.out.println(Arrays.toString(arr));
		

		
		
//		ps.selectionsortbyage(arr);
//		System.out.println(Arrays.toString(arr));
		
		ps.selectionsortbyid(arr);
		System.out.println(Arrays.toString(arr));
	}

}
