import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTestAdd {
    private PhoneBook phoneBook;

    @BeforeEach
    public void initPhoneBook(){
        phoneBook = new PhoneBook();
    }

    @AfterEach
    public void nullOfPhoneBook(){
        phoneBook = null;
    }

    @Test
    public void testAddOneContact(){
        String name = "Света";
        String phoneNumber = "8-999-990-90-09";

        int expected = 1;
        int result = phoneBook.add(name, phoneNumber);

        assertEquals(expected, result);
    }
    @Test
    public void testAddThreeContact(){
        phoneBook.add("fist", "23523523");
        phoneBook.add("second", "23523523");

        String name = "Света";
        String phoneNumber = "8-999-990-90-09";

        int expected = 3;
        int result = phoneBook.add(name, phoneNumber);

        assertEquals(expected, result);
    }
    @Test
    public void testAddThreeSameContacts(){
        String name = "Света";
        String phoneNumber = "8-999-990-90-09";

        int expected = 1;
        phoneBook.add(name, phoneNumber);
        phoneBook.add(name, phoneNumber);
        int result = phoneBook.add(name, phoneNumber);

        assertEquals(expected, result);
    }
}
