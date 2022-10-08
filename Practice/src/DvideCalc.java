import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DvideCalc {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("10÷Nの計算をします");
			System.out.println("Nの値を入れてください");

			String s = r.readLine();
			int n = Integer.parseInt(s);

			System.out.println("答えは" + (10 / n) + "です。");
		} catch (Exception e) {
			System.out.println("エラーが発生しました");
		}
	}
}
