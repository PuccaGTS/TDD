import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTestPrintAllNames {
    private PhoneBook phoneBook;

    @BeforeEach
    public void initPhoneBook(){
        phoneBook = new PhoneBook();
        phoneBook.add("�����", "9-999-999-999");
        phoneBook.add("���", "2532353215");
        phoneBook.add("����", "666666");
        phoneBook.add("����", "12121212");
    }

    @AfterEach
    public void nullOfPhoneBook(){
        phoneBook = null;
    }

    @Test
    public void testPrintAllNamesFirstPos(){
        Set<String> treeSet = phoneBook.printAllNames();
        for (String name : treeSet){
            String expected = "����";
            assertEquals(expected, name);
            break;
        }
    }

    @Test
    public void testPrintAllNamesArray(){
        Set<String> treeSet = phoneBook.printAllNames();
        String [] names = (String[]) treeSet.toArray();
        String expected1 = "����";
        String expected2 = "���";
        String expected3 = "�����";

        assertEquals(names[1], expected1);
        assertEquals(names[2], expected2);
        assertEquals(names[3], expected3);

    }
}
