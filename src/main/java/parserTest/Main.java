package parserTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException
            , URISyntaxException {

        /**
         * web page:
         * https://www.ikea.com/pl/pl/catalog/products/50284647/
         * xPath price:
         * //*[@id="price1"] //firefox
         * //*[@id="price1"] //chrome
         * #price1
         */

        Document doc;
        try {

            int[] article;
            article = new int[250];
            article[1] = 50284647;

            // need http protocol
            doc = Jsoup.connect("https://www.ikea.com/pl/pl/catalog/products/" + article[1] + "/").get();

            // get page title
            String title = doc.title();
            System.out.println("title : " + title);

            // get all links
            Elements links = doc.select("#price1");
                for (Element link : links) {

                    // get the value from href attribute
                    //System.out.println("\nlink : " + link.attr("#price1"));
                    System.out.println("Price : " + link.text());

            }

            /**
             * Elements links2 = doc.select("#localStoreLink > strong");
             * for (Element link : links2) {
             *
             *    // get the value from href attribute
             *    //System.out.println("\nlink : " + link.attr("#price1"));
             *    System.out.println("Daudzums : " + link.text());
             * }
            */


            File saraksts = new File("C:\\VG\\Java\\jsoup\\saraksts.txt");
            Document doc1 = Jsoup.parse(saraksts, "UTF-8");
            System.out.println(doc1);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
