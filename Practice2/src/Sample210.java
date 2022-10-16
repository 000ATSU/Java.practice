import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample210 {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Input name:");
		String name = in.readLine();
		in.close();
		System.out.println("Hello," + name);
	}
}
