package svt;

import java.util.ArrayList;
import java.util.List;

public class ConsoleOutput implements Output {

    @Override
    public List<String> showPhones(List<String> phones) {
        System.out.println("\nСписок телефонов");
        for (String phone : phones) {
            System.out.println(phone);
        }
        return null;
    }
}
