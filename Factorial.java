import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the Number::");
		int number=sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println();
       System.out.println("Fatcorial of given number is ::" + fact);
       sc.close();
	}

}
