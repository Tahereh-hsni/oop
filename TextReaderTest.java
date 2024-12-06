import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextReaderTest {

    @Test
    public void testAddRow() {
        TextReader textReader = new TextReader();
        textReader.läggTillRad("Hello");
        textReader.läggTillRad("World");
        assertEquals(2, textReader.getAntalRader());
        assertEquals(10, textReader.getAntalTecken());
    }

    @Test
    public void testGetAntalRader() {
        TextReader textReader = new TextReader();
        textReader.läggTillRad("Line 1");
        assertEquals(1, textReader.getAntalRader());
    }

    @Test
    public void testGetAntalTecken() {
        TextReader textReader = new TextReader();
        textReader.läggTillRad("Line");
        assertEquals(4, textReader.getAntalTecken());
    }
}
