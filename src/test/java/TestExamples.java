import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class TestExamples {
    @Test
    public void testHelloWorld() {
        // Print "Hello, World!" to the console.
        System.out.println("Hello, World!");
    }

    @Test
    public void testVariablesAndTypes() {
        //Create all of the primitives (except long and double) with different values.
        //Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true
        byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;
        String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
        System.out.println(output);
    }

    @Test
    public void testConditionals() {
        // Change the variables in the first section, so that each if statement resolves as true.
        String a = "Wow";
        String b = a;
        String c = b + "!";
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
        // Change the values in numbers so it will not raise an error.
        int[] numbers = {1, 2, 3};
        int length = numbers[2];
        char[] chars = new char[length];
        chars[numbers.length -1] = 'y';
        System.out.println("Done!");
    }

    @Test
    public void testFunctions() {
        Student[] students = new Student[] {
                new Student("Morgan", "Freeman"),
                new Student("Brad", "Pitt"),
                new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName();
        }
    }

    @Test
    public void testLoops() {
        // Loop through and print out all even numbers, each in a separate line,
        // from the numbers list in the same order they are received.
        // Don't print any numbers that come after 237 in the sequence.
        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};
        // Your code goes here
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= 237) {
                System.out.println(numbers[i]);
            }
        }
    }

    @Test
    public void testObject() {
        // Write a new method in Point called scale, that will make the point closer by half to (0,0).
        // So for example, point (8, 4) after scale will be (4, 2).
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }

    @Test
    public void testInheritance() {
        // Create a house front door class which inherits from the Door class and open it.
        // Assume the house door has a locked doorknob and it swings into the house.
        // Hint: Your code should use the super keyword.
        FrontDoor d1 = new FrontDoor(200, 80, true, false);
        if (!d1.openTheDoor() && !d1.isSwingsOut)
            System.out.println("?????????????? ?????????? " + d1.doorHeight + "x" + d1.doorWidth + " (?????????????????????? ????????????), ?????????? ????????????: " + d1.isLocked);
    }


    @Test
    public void testWebDriver() {
        //System.setProperty("webdriver.grome.driver", "??/Dev/chromedriver/chromedriver");
        WebDriver driver = new SafariDriver();
        driver.get("https://google.com");
        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebElement element1 = (new WebDriverWait(driver, Duration.ofSeconds(10))
        //        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input/[@aria-label='??????????']"))));
        input.click();
        input.sendKeys("Java Language Tutorial", Keys.ENTER);
        button.click();
        //Assert.asertEquals
    }
}
