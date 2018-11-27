package svt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private String fio;
    private String phoneString;
    private List<String> phoneList;
    private Map<String, String> phoneBookMap;

    public PhoneBook() {
        phoneBookMap = new HashMap<>();
        phoneBookMap.put("Иванов И.И.", "+8 800 2000 500");
        phoneBookMap.put("Петров П.П.", "+8 800 2000 500 +8 800 2000 700");
        phoneBookMap.put("Сидоров П.П.", "+8 800 2000 800 +8 800 2000 900");
    }

    public List<String> getPhoneList(String fio) {
        phoneList = new ArrayList<>();
        this.fio = fio;
        String phone = " ";
        char symbol = ' ';
        phoneString = getPhoneString();
        if (phoneString.isEmpty()) {
            phone = "Фамилии " + fio + " нет в БД";
            phoneList.add(phone);
        } else {
            for (int i = 0; i < phoneString.length(); i++) {
                symbol = phoneString.charAt(i);
                if (symbol == '+') {
                    phone = phoneString.substring(i, i + 15);
                    phoneList.add(phone);
                }
            }
        }
        return phoneList;
    }

    private String getPhoneString() {
        if (phoneBookMap.containsKey(fio)) {
            phoneString = phoneBookMap.get(fio);
        } else {
            phoneString = "";
        }
        return phoneString;
    }
}
