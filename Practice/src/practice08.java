import atmarkit.HTMLDocument;

public class practice08 {
	public static void main(String[] args) {
		HTMLDocument doc = new HTMLDocument();

		doc.setSource("<html>TEXT</html>");
		doc.showPlainText();
	}
}
