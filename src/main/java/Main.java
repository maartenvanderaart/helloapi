/**
 * Created by maarten on 08/12/2016.
 */
import static spark.Spark.*;
import org.jsoup.*;
import org.jsoup.nodes.Document;



public class Main {
    public static void main(String[] args) {
        port(5000);
        get("/", (req, res) -> "Hello Cloudy \n");
        get("/act-randomly", (req, res) -> {
            Document doc = Jsoup.connect("http://www.setgetgo.com/randomword/get.php").get();
            String text = doc.body().text() + "\n";
            return text;
        });

    }
}
