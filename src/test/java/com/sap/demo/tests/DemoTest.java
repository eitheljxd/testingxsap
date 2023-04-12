package com.sap.demo.tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Epic("Demo for Interview")
@Feature("Jenkins Report")
public class DemoTest extends BaseTest {


    @Description("Test one - failed")
    @Test(description = "should be able to create a playlist")
    public void failedTestCase(){
        assertThat("Error for test case n1",false);

    }
    @Description("Test two - approve")
    @Test
    public void approveTestCase(){
        assertThat("Success for test case n2",true);
    }

}
