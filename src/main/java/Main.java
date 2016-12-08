/**
 * Created by maarten on 08/12/2016.
 */
import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello Cloudy \n");
    }
}
