package inputReading;

import java.util.Scanner;

public class ExamplePrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf(s1 + "'%15s'");
            System.out.print(x);
            
           
        }
        System.out.println("================================");
        
	}

}
