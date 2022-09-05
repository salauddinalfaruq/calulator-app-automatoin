package testrunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CalculationScreen;

public class CalculationTestRunner extends Setup {

    @Test
    public void doSum(){
        CalculationScreen calculationScreen=new CalculationScreen(driver);
        String result = calculationScreen.doSum();
        Assert.assertEquals(result, "12");
    }
}
