package inputReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class useOfBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		try {
			String str=inp.readLine();
			int T= Integer.parseInt(inp.readLine());
			System.out.println(str);
			System.out.println(T);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
