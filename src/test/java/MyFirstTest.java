import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {
    private String name = "Gospodin";

    @Test
    public void firstTest() {
        System.out.println("Hello");

        int sum = sumTwoDigits(15, 45);
        System.out.println(sum);

        System.out.println(sumTwoDigits(9, 13));

    }

    private int sumTwoDigits(int a, int b) {
        System.out.println(name);

        int c = a + b;
        return c;
    }

}


