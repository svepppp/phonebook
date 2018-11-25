package svt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private String fio;
    private String phone;
    private List<String> phones = new ArrayList<>();
    private Map<String, String> phoneBook = new HashMap<>();

    public PhoneBook() {
        phoneBook.put("Иванов И.И.", "+8 800 2000 500");
        phoneBook.put("Петров П.П.", "+8 800 2000 500 +8 800 2000 700");
        phoneBook.put("Сидоров П.П.", "+8 800 2000 800 +8 800 2000 900");
    }

    public List<String> getPhones(String fio) {
        char symbol = ' ';
        String phoneString = getPhoneString(fio);
        for (int i = 0; i < phoneString.length(); i++) {
            symbol = phoneString.charAt(i);
            if (symbol == '+') {
                String phone = phoneString.substring(i, i + 15);
                phones.add(phone);
            }
        }
        return phones;
    }

    private String getPhoneString(String fio) {
        String phoneString = " ";
        if (phoneBook.containsKey(fio)) {
            phoneString = phoneBook.get(fio);
        } else {
            phoneString = " " + fio + " нет в БД";
        }
        return phoneString;
    }
}
