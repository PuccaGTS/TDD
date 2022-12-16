import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTestFindByName {
    private PhoneBook phoneBook;

    @BeforeEach
    public void initPhoneBook(){
        phoneBook = new PhoneBook();
        phoneBook.add("Света", "9-999-999-999");
        phoneBook.add("Оля", "2532353215");
        phoneBook.add("Катя", "666666");
        phoneBook.add("Вася", "12121212");
    }

    @AfterEach
    public void nullOfPhoneBook(){
        phoneBook = null;
    }

    @Test
    public void testFindByName(){
        String name = "Вася";

        String expected = "12121212";
        String result = phoneBook.findByName(name);

        assertEquals(expected, result);
    }

    public void testFindByNameNull(){
        String name = "Олег";

        String expected = "Такого контакта нет в книге";
        String result = phoneBook.findByName(name);

        assertEquals(expected, result);
    }
}
