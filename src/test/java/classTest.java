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



    @Test
    public void testConditionals() {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }

    @Test
    public void testArrays() {
        int[] numbers = {1, 2, 8};
        int length = numbers[2];
        char[] chars = new char[length];
        chars[numbers.length + 4] = 'y';
        //chars[2] = 'y';
        System.out.println("Done!");
    }

}
