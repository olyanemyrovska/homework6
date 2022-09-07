import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TemperatureTest {

  /**
   * Test data for Fahrenheit to Celsius conversion.
   * @return test data array
   */
  @DataProvider(name = "Fahrenheit")
  public static Object[][] fahrenheit() {
    return new Object[][]{
        {212.0, 100.0},
        {32.0, 0.0},
        {-15, -26.11111111111111},
        {0.0, -17.77777777777778},
        {5.0, -15.0}
        // TODO add 2 more test data here
    };
  }

  /**
   * Test data for Celsius to Fahrenheit conversion.
   * @return test data array
   */
  @DataProvider(name = "Celsius")
  public static Object[][] celsius() {
    return new Object[][]{
        {100.0, 212.0},
        {0.0, 32.0},
        {-26.11111111111111, -15},
        {-1.0, 30.2},
        {-17.77777777777778, 0.0}
        // TODO add 2 more test data here
    };
  }

  @Test(dataProvider = "Fahrenheit")
  public void testFahrenheitToCelsius(double fahrenheit, double expectedResult) {
    double actualResult = Temperature.fahrenheitToCelsius(fahrenheit);

    assertEquals(actualResult, expectedResult, "Conversion from Fahrenheit to Celsius is wrong");
  }

  @Test(dataProvider = "Celsius")
  public void testCelsiusToFahrenheit(double celsius, double expectedResult) {
    double actualResult = Temperature.celsiusToFahrenheit(celsius);

    assertEquals(actualResult, expectedResult, "Conversion from Celsius to Fahrenheit is wrong");
  }
}