
public class Sample331 {
	public static void main(String[] args) {
		String[] users = { "Sara", "Akira", "Akira", "Jacky", "" };
		String[] password = { "", "777", "111", "abc", "xyz" };
		Sample330 sample = new Sample330();
		for (int i = 0; i < user.length; i++) {
			try {
				System.out.println("i=" + i + ":");
				boolean isLogin = sample.login(users[i], password[i]);
				if (isLogin) {
					System.out.println("ログインに成功しました。(" + users[i] + ")");
				} else {
					System.out.println("ログインに失敗しました。");
				}
			} catch (SampleException e1) {
				e1.printStackTrace();
				System.err.prinln("code[" + e1.getCode() + "]");
			} catch (SampleException2 e2) {
				e2.printStackTrace();
			}
			Sysytem.err.println("");
		}
	}
}
