package crawl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stock {

	public static void main(String[] args) throws IOException {
		String url = "https://finance.naver.com/item/main.naver?code=035720";
		
		Document doc = Jsoup.connect(url).get();
		
		Elements e1 = doc.getElementsByAttributeValue("class", "no_today");
		Element e2 = e1.get(0);
		Elements e3 = e2.select("span");
		
		System.out.println("카카오주식 "+e3.get(0).text());
	}

}
