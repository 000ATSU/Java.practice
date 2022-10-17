import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Smaple310 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Input name:");
		String name;
		try {
			name = in.readLine();
			System.out.println("Hello," + name);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
