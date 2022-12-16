import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTestFindByNumber {
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
        public void testFindByNumber(){
            String number = "666666";

            String expected = "Вася";
            String result = phoneBook.findByNumber(number);

            assertEquals(expected, result);
        }

    @Test
    public void testFindByNumberNull(){
        String number = "1231231231";

        String expected = "Такого номера нет в книге";
        String result = phoneBook.findByNumber(number);

        assertEquals(expected, result);
    }
}
