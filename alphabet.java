package basic;
import java.util.*;
public class alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char alph;
		System.out.println("enter the character=");
		alph=sc.next().charAt(0);
		if (alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u' ||alph=='A' || alph=='E' || alph=='I' || alph=='O' || alph=='U'){
			System.out.println("is a vowel");
		}
		else {
			System.out.println("is consonant");
		}
		

	}

}
