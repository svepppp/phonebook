package svt;

import org.junit.Test;

import java.io.*;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConsoleOutputTest {

    @Test
    public void testShowPhones() throws IOException {
        PhoneBook phoneBook = new PhoneBook();
        List<String> phones1 = phoneBook.getPhoneList("Иванов И.И.");
        checkList(phones1);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("phone.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        line = in.readLine();
        assertEquals("Список телефонов", line);
        line = in.readLine();
        assertEquals("+8 800 2000 500", line);

        List<String> phones2 = phoneBook.getPhoneList("Марьин М.М.");
        checkList(phones2);
        in = new BufferedReader(new FileReader("phone.txt"));
        line = in.readLine();
        assertEquals("Фамилии Марьин М.М. нет в БД", line);
    }

    private void checkList(List<String> phones) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter("phone.txt"))) {
            if (phones.get(0).contains("Фамилии")) {
                out.println(phones.get(0).toString());
            } else {
                out.println("Список телефонов");

                for (int i = 0; i < phones.size(); i++) {
                    out.println(phones.get(i).toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


