package Service;

import java.util.Scanner;

import beans.Person;

public class PersonService {



	public void acceptdata(Person[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter age");
			int age=sc.nextInt();
			
			arr[i]=new Person(id,name,age);
		}
		
	}

	

	public void selectionsortbyage(Person[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].getAge()>arr[j].getAge()) {
					Person temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}



	public void selectionsortbyid(Person[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].getId()>arr[j].getId()) {
					Person temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}



	
	
	
	
}
