package useOfIfElse;

import java.util.Scanner;

public class ExampleIfElse {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N<1)
            System.out.println("NEGATIVE NUMBERS ARE NOT ALLOWED");
        else if(N%2!=0)
            System.out.println("Weird");
        else if(N%2==0 && N>=2 && N<=5)
            System.out.println("Not Weird");
        else if(N%2==0 && N>=6 && N<=20)
            System.out.println("Weird");
        else if(N%2==0 && N>20)
            System.out.println("Not Weird");
        scanner.close();

	}

}
