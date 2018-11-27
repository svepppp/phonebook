import svt.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input=new ConsoleInput();
        Output output=new ConsoleOutput();
        PhoneBook phoneBook=new PhoneBook();
        String fio=input.getFio();
        List<String>  phones=phoneBook.getPhones(fio);
        output.showPhones(phones);
    }
}
