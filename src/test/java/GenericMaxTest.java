import com.bridgelabz.maximum.GenericMax;
import com.bridgelabz.maximum.GenericMaxRefactor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMaxTest {

    @Test
    public void testGenericInteger(){
        assertEquals(50, GenericMax.testMaximum(10,50,40));
    }

    @Test
    public void testGenericFloat() {
        assertEquals(9.5f, GenericMax.testMaximum(3.3f, 9.5f, 6.6f));
    }

    @Test
    public void testGenericString() {
        assertEquals("Peach", GenericMax.testMaximum("Apple", "Peach", "Banana"));
    }

    @Test
    public void testGenericRefactorClass() {
        GenericMaxRefactor<String> strMax = new GenericMaxRefactor<>("Apple", "Banana", "Peach");
        assertEquals("Peach", strMax.testMaximum());
    }


}
