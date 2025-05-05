import com.bridgelabz.maximum.GenericMax;
import com.bridgelabz.maximum.GenericMaxRefactor;
import com.bridgelabz.maximum.GenericMaxVarArgs;
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
    @Test
    public void testGenericVarArgs() {
        assertEquals(100, GenericMaxVarArgs.testMaximum(10, 30, 100, 70));
        assertEquals("Zebra", GenericMaxVarArgs.testMaximum("Apple", "Mango", "Zebra"));
        assertEquals(5.6f, GenericMaxVarArgs.testMaximum(3.5f,5.6f,4.5f,2.4f));
    }

}
