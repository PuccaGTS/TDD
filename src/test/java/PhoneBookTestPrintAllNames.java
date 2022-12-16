import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTestPrintAllNames {
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
    public void testPrintAllNamesFirstPos(){
        Set<String> treeSet = phoneBook.printAllNames();
        for (String name : treeSet){
            String expected = "Вася";
            assertEquals(expected, name);
            break;
        }
    }

    @Test
    public void testPrintAllNamesArray(){
        Set<String> treeSet = phoneBook.printAllNames();
        Object [] names = treeSet.toArray();
        String expected1 = "Катя";
        String expected2 = "Оля";
        String expected3 = "Света";

        assertEquals(names[1], expected1);
        assertEquals(names[2], expected2);
        assertEquals(names[3], expected3);
    }
}
