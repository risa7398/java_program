package basic;
import java.util.*;
public class oldest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a1,a2,a3;
		System.out.println("enter the value of a1=");
		a1=sc.nextInt();
		System.out.println("enter the value of a2=");
		a2=sc.nextInt();
		System.out.println("enter the value of a3=");
		a3=sc.nextInt();
		if (a1>a2 && a1>a3) {
			System.out.println("a1 is an oldest");
		}
		else if (a2>a1 && a2>a3){
			System.out.println("a2 is oldest");
		}
		else if (a3>a1 && a3>a2) {
			System.out.println("a3 is oldest");
		}
		else {
			System.out.println("they are of same age");
		}

	}

}
