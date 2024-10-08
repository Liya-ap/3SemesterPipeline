import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BasicTest {

    @Test
    void test_expected_to_succeeds() {
        int number = 10;
        int numberBigger = 20;

        assertThat(number, lessThan(numberBigger));
    }


    @Test
    void test_expected_to_fail() {
        int number = 10;
        int numberBigger = 20;

        assertThat(number, greaterThan(numberBigger));
    }
}
