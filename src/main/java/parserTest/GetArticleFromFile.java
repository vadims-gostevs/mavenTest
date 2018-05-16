package parserTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class GetArticleFromFile {
    public static void main(String[] args) throws IOException {
        File saraksts = new File("C:\\VG\\Java\\jsoup\\saraksts.txt");
        Document doc = Jsoup.parse(saraksts, "UTF-8");
        System.out.println(doc);
    }




}
