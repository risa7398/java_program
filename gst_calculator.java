package basic;
import java.util.*;
public class gst_calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the amount");
	float amt ,gst,sgst,cgst,total;
	amt=sc.nextFloat();
	char type,A,B,C,D,E;
	System.out.print("enter the type=");
	type=sc.next().charAt(0);
	if (type == 'A') {
		sgst = cgst = 0 / 100;
		System.out.println(amt + "  " + cgst + "  " + sgst);
		sgst = cgst = amt + amt * 0 / 100;
		total = amt + cgst + sgst;
		System.out.println("the total amount:" + total);
	} 
	else {
		if (type == 'B') {
			sgst = cgst = 5 / 2;
			System.out.println(amt + "  " + cgst + "  " + sgst);
			sgst = cgst = amt + amt * 5 / 100;
			total = amt + cgst + sgst;
			System.out.println("the total amount:" + total);
		}
		else {
			if (type == 'c') {
				sgst = cgst = 12 / 2;
				System.out.println(amt + "  " + cgst + "  " + sgst);
				total = amt + cgst + sgst;
				System.out.println("the total amount:" + total);
			} 
			else {
				if (type == 'D') {
					sgst = cgst = 18 / 2;
					System.out.println(amt + "  " + cgst + "  " + sgst);
					sgst = cgst = amt + amt * 18 / 100;
					total = amt + cgst + sgst;
					System.out.println("the total amount:" + total);
				}
				else {
					sgst = cgst = 28 / 2;
					System.out.println(amt + "  " + cgst + "  " + sgst);
					sgst = cgst = amt + amt * 28 / 100;
					total = amt + cgst + sgst;
					System.out.println("the total amount:" + total);
				}
			}

		}
	}
	}
}

	
	
