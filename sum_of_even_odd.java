package basic;
import java.util.*;
public class sum_of_even_odd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i,sumE=0,sumO=0;
		for(i=0;i<=10;i++) {
			if (i%2==0){
				sumE=sumE+i;
			}
		}
		System.out.println("sum of even number is:"+sumE);
		for(i=0;i<=10;i++) {
			if (i%2!=0) {
				sumO=sumO+i;
			}
	   }
		System.out.println("sum of even number is:"+sumO);
	}
		
}


