import java.util.Scanner;

public class Sample211 {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Input name:");
		String name = s.next();
		s.close();
		System.out.printf("Hello, %S", name);
	}
}
