import java.net.*;
import java.net.URL;

public class ShowHTML {
	public static void main(String[] args) {
		StringBuffer result = new StringBuffer();
		
		try {
			if (args.length == 0)
				throw new MalformedURLException();
			
			URL url new URL(args[0]);
			Object content = url.getContent();
			
			if (content instanceof InputStream) {
				String line;
				BUfferedReader reader = new BufferedReader(new InputStreamReader((InputStream)content, "JISAutoDetect"));
				while ((line = reader.readline()) != null)
					result.append(line+"\n");
			}
		} catch (MalformedURLException e) {
			result.append("無効な書式のURLです。\n");
			result.append("使い方:LoadFromURL<URL>");
		} catch (IOException e) {
			result.append("存在しないURLが指定されました。");
		} finally {
			System.out.println(result);
		}
	}
}
