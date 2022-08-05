package ru.netology.sqr;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "6,10,99"
    })
    void shouldCalculateNumberOfIterations(int expected, int left, int right) {
        SqrService service = new SqrService();

        int actual = service.calculate(left, right);

        assertEquals(expected, actual);
    }
}
