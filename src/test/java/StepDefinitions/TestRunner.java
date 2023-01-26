package StepDefinitions;

//Creando un test runner

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)    //StepDefinitions hace referencia a todas las clases que esten en esta carpeta para ejecutarse
@CucumberOptions(features="src/main/resources/Features",glue = {"StepDefinitions"},
//monochrome hace el reporte mas sencillo de leer
        monochrome = true,
        //como crear reportes cucumber
        plugin = {"pretty", "html:target/HTMLReports/report.html",
                "json:target/JsonReports/report.json",
                "junit:target/JUnitReports/report.xml"}
//        ,
//        tags = "@smokeTest"
//


)

public class TestRunner {


}
