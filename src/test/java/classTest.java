import org.testng.annotations.Test;

public class classTest {
    @Test
    public void testHelloWorld() {
        System.out.println("This will be printed");
    }

    @Test
    public void testVariablesAndTypes() {
        byte zero = 0;
        String output = "W" + zero + "w";
        System.out.println(output);
    }
}
