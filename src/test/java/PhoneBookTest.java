import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @BeforeEach
    public void testStarted() {
        System.out.println("The beginning of the test");
    }

    @AfterEach
    public void testFinished() {
        System.out.println("End of the test");
    }

    @Test
    public void testAdd() {
        int expected = phoneBook.add("Sergey", "+79204444444");
        expected++;
        Assertions.assertEquals(expected, phoneBook.add("Julia", "+79205555555"));
    }

    @Test
    public void testNameIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> phoneBook.add(null, "+79203333333"));
    }

    @Test
    public void testFindByNumber(){
        phoneBook.add("Sergey", "+79204444444");
        String expected = "Sergey";
        String numberValue = "+79204444444";
        Assertions.assertEquals(expected, phoneBook.findByNumber(numberValue));
    }
}
