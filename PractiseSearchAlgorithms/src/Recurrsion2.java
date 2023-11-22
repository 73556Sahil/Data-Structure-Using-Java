import java.util.Scanner;

public class Recurrsion2 {

	public static void main(String[] args) {
		System.out.println("Enter Number for addition from number 1 ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		add(num);
		System.out.println(" Addition of number is :"+ add(num));
		
		fact(num);
		System.out.println(" Factorial of number is :"+ fact(num));
		
	}

	private static int fact(int num) {
		
		if(num>1) {
			return num*fact((num)-1);
		}
		return num;
	}
	

	private static int add(int num) {
		
		if(num>1) {
			return num+add((num)-1);
		}
		return num;
	}

}
