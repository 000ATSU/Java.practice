
public class Sample510 {
	public static void main(String[] args) {
		System.out.println(0x10);
		int[] bs = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int j = 0; j < bs.length; j++) {
			int b = bs[j];
			System.out.println(b + ":");
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < 32; i++) {
				sb.append(b & 0x1);
				b = b >>> 1;
			}
			System.out.println(sb.reverse().toString());
		}
	}
}
