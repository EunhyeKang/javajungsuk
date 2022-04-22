package jsoupTest;

import java.io.IOException;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import javax.swing.text.html.parser.Element;

/**
 * A simple example, used on the jsoup website.
 */
public class Jsoup {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        log(doc.title());

        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
        }
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}