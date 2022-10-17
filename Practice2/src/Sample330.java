
public class Sample330 {
	private String[] users = { "Akira", "Jacky" };
	private String[] passwords = { "777", "*" };

	public boolean login(String name, String password)
			throws SampleException, SampleException2 {
		int i;
		for (i = 0; i < users.length; i++) {
			if ("".equals(name.trim())) {
				throw new SampleException(1, "ログインに失敗しました。");
			} else if ("".equals(password.trim())) {
				throw new SampleException(2, "ログインに失敗しました。");
			}
			if (user[i].equals(name)) {
				if (passwords[i].equals("*")) {
					throw new SampleException2("ログインに失敗しました。");
				} else if (passwords[i].equals(password)) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
}
