package atmarkit;

import java.net.MalformedURLException;

public class ShowTextFromURL {
	public static void main(String[] args) {
		StringBuffer result = new StringBuffer();
		try {
			if (args.length == 0)
				throw new MalformedURLException();

			HTMLDocument doc = new HTMLDocument();

			doc.loadFromURL(args[0]);
			result.append(doc.getPlainText());
		} catch (MalformedURLException e) {
			result.append("無効な書式のURLです。\n");
			result.append("使い方:LoadFormURL<URL>\n");
		} finally {
			System.out.println(result);
		}
	}

}
