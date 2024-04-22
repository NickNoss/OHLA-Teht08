import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "57, 0:00:57",
            "-5, -1",
            "0, 0:00:00",
            "3600, 1:00:00",
            "1800, 0:30:00",
            "7200, 2:00:00",
            "86400, 24:00:00",
            "100000, -1"
    })
    public void testSecToTime(int seconds, String expectedResult) {
        String result = TimeUtils.secToTime(seconds);
        assertEquals(expectedResult, result);
    }
}
