package svt;

import java.util.List;

public class ConsoleOutput implements Output {

    @Override
    public void showPhones(List<String> phones) {
        if (phones.get(0).contains("Фамилии")) {
            System.out.println(phones.get(0));
        } else {
            System.out.println("\nСписок телефонов");

            for (int i = 0; i < phones.size(); i++) {
                System.out.println(" " + (i + 1) + ". " + phones.get(i));
            }
        }
    }
}