package hexlet.code;
import java.util.Random;

public class Utils {
    public static int getRandomInt(int fromRange, int toRange) {
        Random random = new Random();
        return random.nextInt(toRange - fromRange + 1) + fromRange;
    }
}
