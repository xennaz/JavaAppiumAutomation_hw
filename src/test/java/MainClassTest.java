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



}
