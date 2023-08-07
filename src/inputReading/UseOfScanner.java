package inputReading;

import java.util.Scanner;

//Problem statement - you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line.
//input pattern - 
//42
//100
//125
//output pattern
//42
//100
//125
public class UseOfScanner {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        int c=scan.nextInt();
        scan.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
