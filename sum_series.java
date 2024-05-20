package basic;
import java.util.*;
public class sum_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		float i,n,sum=0;
		n=sc.nextFloat();
		for (i=1;i<=n;i++) {
			sum=(1/i)+sum;
			
		}
		System.out.println("sum of series is:"+sum);

	}

}
