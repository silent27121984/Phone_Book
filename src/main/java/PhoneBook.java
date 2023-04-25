import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public Map<String, String> contactsList = new HashMap<>();

    public int add(String name, String phoneNumber) {
        if (!contactsList.containsValue(name)) {
            contactsList.put(name, phoneNumber);
        } else {
            System.out.println("Контакт с таким именем уже существует");
        }
        if (name == null)
            throw new RuntimeException("Имя контакта пустое");
        return contactsList.size();
    }

    public String findByNumber(String phoneNumber) {
        String name = "";
        for (String contacts : contactsList.keySet()) {
            if (contactsList.get(contacts).equals(phoneNumber)) {
                name = contacts;
                break;
            }
        }
        return name;
    }

    public String findByName(String name) {
        return contactsList.get(name);
    }

    public String printAllNames() {
        return contactsList.keySet().toString();
    }
}
