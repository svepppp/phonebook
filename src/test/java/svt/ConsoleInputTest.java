package svt;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ConsoleInputTest {

    @Test
    public void testGetFio() throws UnsupportedEncodingException {

        String mockInput = "Иванов И.И.";
        InputStream mockInputStrim = new ByteArrayInputStream(mockInput.getBytes(StandardCharsets.UTF_8.name()));
        ConsoleInput consoleInput = new ConsoleInput(mockInputStrim);
        String fio;
        fio = consoleInput.getFio();
        assertEquals("Иванов И.И.", fio);
    }
}
