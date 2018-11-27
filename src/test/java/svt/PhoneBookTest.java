package svt;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {

    @Test
    public void testGetPhones() {
        PhoneBook phoneBook = new PhoneBook();
        List<String> phones1 = phoneBook.getPhoneList("Петров П.П.");
        assertEquals("+8 800 2000 500", phones1.get(0));
        assertEquals("+8 800 2000 700", phones1.get(1));
        List<String> phones2 = phoneBook.getPhoneList("Марьин");
        assertEquals("Фамилии Марьин нет в БД",phones2.get(0));
    }
}
