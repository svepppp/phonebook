package svt;

import java.io.InputStream;
import java.util.Scanner;


public class ConsoleInput implements Input {
    private Scanner scanner;

    public ConsoleInput() {
        this(System.in);
    }

    public ConsoleInput(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    @Override
    public String getFio() {
        String fio;
        System.out.println("Укажите ФИО");
        fio = scanner.nextLine();
        return fio;
    }
}
