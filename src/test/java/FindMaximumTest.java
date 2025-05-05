import com.bridgelabz.maximum.FindMaximum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FindMaximumTest {

    FindMaximum findMaximum=new FindMaximum();

    //Method to find Max string
    @Test
    public  void findStringMax()
    {
        String actualResult= findMaximum.findStringMaximum("Dog","Cat","doll");
        assertEquals("doll",actualResult);
    }

    //TC 1.1 Max in first position
    @Test
    public  void findStringMaxAtFirstPosition()
    {
        String s1="apple";
        String s2="Apple";
        String s3="App";
        String actualResult=findMaximum.findStringMaximum(s1,s2,s3);
        if (s1.compareTo(s2)>0&&s1.compareTo(s3)>0)
        {
            assertEquals(s1,actualResult);
            System.out.println("TC 1.1 - Inputs: s1 = " + s1 + ", s2 = " + s2 + ", s3= " + s3);
            System.out.println("Maximum value found: " + actualResult);
        }
        else
        {
            fail("Test data invalid: first string  is not the maximum string");
        }

    }

    //TC 1.2 Max in second position
    @Test
    public  void findStringMaxAtSecondPosition()
    {
        String s1="Dog";
        String s2="dog";
        String s3="App";
        String actualResult=findMaximum.findStringMaximum(s1,s2,s3);
        if (s2.compareTo(s1)>0&&s2.compareTo(s3)>0)
        {
            assertEquals(s2,actualResult);
            System.out.println("TC 1.2 - Inputs: s1 = " + s1 + ", s2 = " + s2 + ", s3= " + s3);
            System.out.println("Maximum value found: " + actualResult);
        }
        else
        {
            fail("Test data invalid: second string  is not the maximum string");
        }

    }

    //TC 1.3 Max in third position
    @Test
    public  void findStringMaxAtThirdPositiongit ()
    {
        String s1="not";
        String s2="none";
        String s3="nope";
        String actualResult=findMaximum.findStringMaximum(s1,s2,s3);
        System.out.println("Maximum value found: " + actualResult);
        if (s3.compareTo(s1)>0&&s3.compareTo(s2)>0)
        {
            assertEquals(s3,actualResult);
            System.out.println("TC 1.3 - Inputs: s1 = " + s1 + ", s2 = " + s2 + ", s3= " + s3);

        }
        else
        {
            fail("Test data invalid: third string  is not the maximum string");
        }

    }
}