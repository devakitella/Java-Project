package JavaClass;

import java.util.*;

public class PhoneBook {

    public static TreeMap<String, String> getContactsStartsWith(TreeMap<String, String> contacts, String prefix) {
        TreeMap<String, String> result = new TreeMap<>();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String name = entry.getKey();
            String phoneNumber = entry.getValue();
            if (name.toLowerCase().startsWith(prefix.toLowerCase())) {
                result.put(name, phoneNumber);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeMap<String, String> contacts = new TreeMap<>();
        contacts.put("Jake", "123-456-7890");
        contacts.put("James", "987-654-3210");
        contacts.put("Deva", "555-123-4567");
        contacts.put("Jackson", "444-555-6666");

        String prefix = "Ja";
        TreeMap<String, String> afterFiltering = PhoneBook.getContactsStartsWith(contacts, prefix);

        for (Map.Entry<String, String> entry : afterFiltering.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
