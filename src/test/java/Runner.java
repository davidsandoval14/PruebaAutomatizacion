import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/",
        glue = "StepsDefinitions",
        tags = {"@Prueba"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true)

public class Runner {

    @BeforeClass
    public static void setup() {
    }

    @AfterClass
    public static void teardown() {
    }

}


/* TODO
*
* Generar los xPath
*
*  */
