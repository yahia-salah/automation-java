package base;

import io.cucumber.java.*;

import java.io.IOException;

public class Hooks extends BasePage{
    public Hooks() throws IOException {
    }

    @Before
    public synchronized void before(Scenario scenario) throws Exception {
    }

    @BeforeStep
    public synchronized void beforeStep(Scenario scenario){
    }

    @AfterStep
    public synchronized void afterStep(Scenario scenario){

    }

    @After
    public synchronized void after(Scenario scenario) throws Exception {
        if(scenario.isFailed()){
            scenario.attach(takeSnapShot(),"image/png", scenario.getName());
        }
        WebDriverInstance.cleanupDriver();
    }
}
