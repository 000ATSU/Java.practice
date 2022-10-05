public class practice06 {
	public static void main(String[] args) {
		boolean processingTag = false;
		String source = "<html><head><title>タイトル</title></head><body><p>段落</p></body></html>";
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
