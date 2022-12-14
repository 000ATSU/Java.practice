
class HTMLDocument {
	String source;

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

public class practice07 {
	public static void main(String[] args) {
		HTML32Document doc = new HTML32Document();

		doc.source = "<html>TEXT</html>";
		doc.showPlainText();
	}
}
