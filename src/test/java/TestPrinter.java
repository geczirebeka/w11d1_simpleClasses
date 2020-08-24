import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 20);
    }

    @Test
    public void hasPaper() {
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void print() {
        printer.print(3, 2);
        assertEquals(6, printer.getPrinted());
    }

    @Test
    public void reduceToner() {
        printer.print(2,1);
        assertEquals(18, printer.reduceToner());
    }
}
