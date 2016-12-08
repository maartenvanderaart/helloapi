/**
 * Created by maarten on 08/12/2016.
 */
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(5000);
        get("/", (req, res) -> "Hello Cloudy \n");
    }
}
