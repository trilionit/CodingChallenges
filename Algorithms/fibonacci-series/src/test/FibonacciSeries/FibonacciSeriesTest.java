package test.FibonacciSeries;

import org.junit.Assert;
import org.junit.Test;

import FibonacciSeries.FibonacciSeries;

public class FibonacciSeriesTest {

  @Test
  public void testFibSeries() {

    int res = FibonacciSeries.fibSeries(3);
    Assert.assertEquals(2, res);
  }
}
