import svt.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input=new ConsoleInput();
        Output output=new ConsoleOutput();
        String fio=input.getFio();
        PhoneBook phoneBook=new PhoneBook();
        List<String>  phones=phoneBook.getPhones(fio);
        output.showPhones(phones);
    }
}
