import org.example.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BasToAllTest {
    @BeforeTest
    public void setUp(){

        DriverManager.init();
    }


}
