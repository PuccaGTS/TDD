import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PhoneBook {
    private Map<String,String> contacts = new HashMap<>();

    public int add(String name, String number){
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(String number){
        return contacts.entrySet().stream()
                .filter(entry -> number.equals(entry.getValue()))
                .findFirst().map(Map.Entry::getKey)
                .orElse("Такого номера нет в книге");
    }

    public String findByName(String name){
        return contacts.containsKey(name) ? contacts.get(name) : "Такого контакта нет в книге";
    }

    public Set<String> printAllNames(){

        return null;
    }
}
