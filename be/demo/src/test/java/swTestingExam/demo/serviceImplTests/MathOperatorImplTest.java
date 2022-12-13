package swTestingExam.demo.serviceImplTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.ArithmeticException;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import swTestingExam.demo.Exceptions.InvalidOperationException;
import swTestingExam.demo.serviceImpl.MathOperatorImpl;

public class MathOperatorImplTest {
    MathOperatorImpl service =  new MathOperatorImpl();

    @SneakyThrows
    @Test
    public void add_success() {assertEquals(12, service.doMath(2, 10, "+"));}

    @SneakyThrows
    @Test
    public void add_fail() {assertNotEquals(11, service.doMath(2, 10, "+"));}

    @SneakyThrows
    @Test
    public void divide_success() {assertEquals(2, service.doMath(20, 10, "/"));}

    @SneakyThrows
    @Test
    public void zero_divides() {assertThrows(InvalidOperationException.class, () -> {
        service.doMath(3, 0, "/");
    } );}

    @SneakyThrows
    @Test
    public void substract_fail() {assertNotEquals(11, service.doMath(2, 10, "-"));}

    @SneakyThrows
    @Test
    public void substract_success() {assertEquals(11, service.doMath(21, 10, "-"));}
}
