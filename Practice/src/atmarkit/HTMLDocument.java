package atmarkit;

public class HTMLDocument {
	String source;

	public void setSource(String html) {
		if (html.indexOf("<html>") == 0)
			source = html;
	}

	public String getSource() {
		return source;
	}

	public void showPlainText() {
		boolean processingTag = false;
		int pos;
		int start = 0;

		for (pos = 0; pos < source.length(); pos++) {
			if (processingTag) {
				if (source.charAt(pos) != '>') {
					for (pos++; pos < source.length(); pos++) {
						if (source.charAt(pos) == '>') {
							break;
						}
					}
				}
				start = pos + 1;
			} else {
				if (source.charAt(pos) != '<') {
					for (pos++; pos < source.length(); pos++) {
						if (source.charAt(pos) == '<') {
							System.out.println(source.substring(start, pos));
							break;
						}
					}
				}
			}
			processingTag = !processingTag;
		}
	}
}

class HTML32Document extends HTMLDocument {
	void ShowPlainText() {
		boolean processingTag = false;
		int pos;
		int start = 0;

		for (pos = 0; pos < source.length(); pos++) {
			if (processingTag) {
				if (source.charAt(pos) != '>') {
					for (pos++; pos < source.length(); pos++) {
						if (source.charAt(pos) == '>') {
							break;
						}
					}
				}
				start = pos + 1;
			} else {
				if (source.charAt(pos) != '<') {
					for (pos++; pos < source.length(); pos++) {
						if (source.charAt(pos) == '<') {
							if (source.charAt(pos + 1) == ' ')
								continue;
							System.out.println(source.substring(start, pos));
							break;
						}
					}
				}
			}
			processingTag = !processingTag;
		}
	}
}