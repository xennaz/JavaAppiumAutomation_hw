import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test

    public void testGetLocalNumber(){

        if (getLocalNumber() == 14){
            System.out.println("Method Local number returns 14");
        } else {
            System.out.println("Method local number returns wrong number");
        }

    }

    @Test
    public void testGetClassNumber(){

        if (getClassNumber() > 45){
            System.out.println("The returned number " + getClassNumber() +" > 45" );
        } else {
            System.out.println("Wrong returned number " + getClassNumber());
        }
    }

    @Test

    public void testGetClassString(){

        String stringToLowerCase = getClassString().toLowerCase();
        Assert.assertTrue("Word Hello/hello is absent", stringToLowerCase.contains("hello"));
    }

}
