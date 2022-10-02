
public class practice05 {
	public static void main(String[] args) {
		int a = 2;
		switch (a) {
		case 1:
			System.out.println("変数aは1です");
			break;
		case 2:
			System.out.println("変数aは2です");
			break;
		default:
			System.out.println("変数aは1でも2でもありません");
			break;
		}
		System.out.println("ここは変数aとは関係なく表示される");

		int i = 2;
		for (i = 1; i <= 10; i++) {
			System.out.println();
		}
		System.out.println("ここはfor文の外側");

		int v = 101;
		while (v < 100) {
			System.out.println("変数vは" + v + "です");
			v++;
		}

		int b = 101;
		do {
			System.out.println("変数bは" + b + "です");
			b++;
		} while (b < 100);

		int w = 100;
		for (w = 0; w < 100; w++) {
			if ((w % 2) == 0)
				continue;
			System.out.println(w);
		}

		int q = 0;
		for (q = 1; q <= 10; q++) {
			System.out.println("変数qは" + q + "です");
			if (q == 5)
				return;
		}
		System.out.println("ここはfor文の外側");
	}
}
