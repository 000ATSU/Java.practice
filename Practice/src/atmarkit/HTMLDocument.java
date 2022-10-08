package atmarkit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HTMLDocument {
	private StringBuffer source;

	public HTMLDocument() {
		source = new StringBuffer();
	}

	public void setSource(String html) {
		if (html.indexOf("<html>") == 0) {
			source.delete(0, source.length());
			source.append(html);
		}
	}

	public String getSource() {
		return source.toString();
	}

	public String getPlainText() {
		boolean processingTag = false;
		StringBuffer text = new StringBuffer();
		int pos;
		int start = 0;

		for (pos = 0; pos < source.length(); pos++) {
			// タグ
			if (processingTag) {
				if (source.charAt(pos) != '>') {
					for (pos++; pos < source.length(); pos++) {
						if (source.charAt(pos) == '>') {
							break;
						}
					}
				}
				start = pos + 1;
			}
			// テキスト
			else {
				if (source.charAt(pos) != '<') {
					for (pos++; pos < source.length(); pos++) {
						if (source.charAt(pos) == '<') {
							if (source.charAt(pos + 1) == ' ')
								continue;
							text.append(source.substring(start, pos));
							break;
						}
					}
				}
			}
			processingTag = !processingTag;
		}

		return text.toString();

	}

	public void loadFromURL(String sourceURL) throws MalformedURLException {
		source.delete(0, source.length());
		try {
			URL url = new URL(sourceURL);
			Object content = url.getContent();
			if (content instanceof InputStream) {
				String line;
				BufferedReader reader = new BufferedReader(
						new InputStreamReader((InputStream) content, "JISAutoDetect"));
				while ((line = reader.readLine()) != null)
					source.append(line + "\n");
			}
		} catch (IOException e) {
			source.append("<html></html>");
		}
	}
}

//class HTML32Document extends HTMLDocument {
//	void ShowPlainText() {
//		boolean processingTag = false;
//		int pos;
//		int start = 0;
//
//		for (pos = 0; pos < source.length(); pos++) {
//			if (processingTag) {
//				if (source.charAt(pos) != '>') {
//					for (pos++; pos < source.length(); pos++) {
//						if (source.charAt(pos) == '>') {
//							break;
//						}
//					}
//				}
//				start = pos + 1;
//			} else {
//				if (source.charAt(pos) != '<') {
//					for (pos++; pos < source.length(); pos++) {
//						if (source.charAt(pos) == '<') {
//							if (source.charAt(pos + 1) == ' ')
//								continue;
//							System.out.println(source.substring(start, pos));
//							break;
//						}
//					}
//				}
//			}
//			processingTag = !processingTag;
//		}
//	}
//}