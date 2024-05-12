package basic;
import java.util.*;
public class age {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		System.out.println("enter the age="+age);
		if (age>=18) {
			System.out.println("your are eligible");
		}
		else {
			System.out.println("not eligible");
		}
	}

}
