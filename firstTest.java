import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class firstTest {
    @Test
    void Equal() {
        int wynik = 2 + 2;
        Assertions.assertEquals(4, wynik);
    }

    @Test
    void PrintSth() {
        int cos = 2;
        System.out.println(cos);
    }

    @Test
    void tbc() {
        System.out.println("tu będzie kontynuacja...");
    }
}

