import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSumOfEvenNumbers() {
        // Kiểm tra tính đúng đắn của việc tính tổng các số chẵn từ 1 đến 10
        assertEquals(30, Main.sumOfEvenNumbers(10));
    }

    @Test
    public void testSumOfEvenNumbersWithZero() {
        // Kiểm tra khi đưa vào số 0
        assertEquals(0, Main.sumOfEvenNumbers(0));
    }

    // Thêm các phương thức kiểm thử khác tại đây nếu cần

}
