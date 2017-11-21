package calculator;

import calculator.domain.ComplexObject;
import calculator.domain.Operation;
import calculator.domain.Service;
import calculator.service.CountingService;
import calculator.service.StatisticService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    @Mock
    private CountingService countingService;
    @Mock
    private StatisticService statisticService;

    @InjectMocks
    private Calculator calculator = new Calculator(countingService, statisticService);

    @Test
    public void addTest(){
        //Given
        ComplexObject objectA = new ComplexObject(1, 2, Service.ONE);
        ComplexObject objectB = new ComplexObject(3, 4, Service.ONE);

        ComplexObject expectedResult = new ComplexObject(4, 6, Service.ONE);

        Mockito.when(countingService.add(objectA, objectB)).thenReturn(expectedResult);
        //When

        ComplexObject result = calculator.add(objectA, objectB);

        //Then
        Assert.assertEquals(expectedResult, result);
        //Mockito.verify(countingService, Mockito.times(2)).add(objectA,objectB);
        Mockito.verify(countingService).add(objectA,objectB);
        Mockito.verify(statisticService).increase(Operation.ADD);
        //Mockito.verify(statisticService).getStatistic(Operation.ADD);
    }

    @Test
    public void divideTest(){
        //Given
        ComplexObject objectA = new ComplexObject(8, 12, Service.ONE);
        ComplexObject objectB = new ComplexObject(2, 2, Service.ONE);

        ComplexObject expectedResult = new ComplexObject(4, 6, Service.ONE);

        Mockito.when(countingService.divide(objectA, objectB)).thenReturn(expectedResult);
        //When

        ComplexObject result = calculator.divide(objectA, objectB);

        //Then
        Assert.assertEquals(expectedResult, result);
        //Mockito.verify(countingService, Mockito.times(2)).add(objectA,objectB);
        Mockito.verify(countingService).divide(objectA,objectB);
        Mockito.verify(statisticService).increase(Operation.DIVIDE);
        //Mockito.verify(statisticService).getStatistic(Operation.ADD);
    }

    @Test
    public void multiplyTest(){
        //Given
        ComplexObject objectA = new ComplexObject(1, 2, Service.TWO);
        ComplexObject objectB = new ComplexObject(3, 4, Service.TWO);

        ComplexObject expectedResult = new ComplexObject(3, 8, Service.TWO);

        Mockito.when(countingService.multiply(objectA, objectB)).thenReturn(expectedResult);
        //When

        ComplexObject result = calculator.multiply(objectA, objectB);

        //Then
        Assert.assertEquals(expectedResult, result);
        //Mockito.verify(countingService, Mockito.times(2)).add(objectA,objectB);
        Mockito.verify(countingService).multiply(objectA,objectB);
        Mockito.verify(statisticService).increase(Operation.MULTIPLY);
        //Mockito.verify(statisticService).getStatistic(Operation.MULTIPLY);
    }

    @Test
    public void subtractTest(){
        //Given
        ComplexObject objectA = new ComplexObject(-100, -2, Service.THREE);
        ComplexObject objectB = new ComplexObject(-100, -4, Service.THREE);

        ComplexObject expectedResult = new ComplexObject(0, 2, Service.THREE);

        Mockito.when(countingService.subtract(objectA, objectB)).thenReturn(expectedResult);
        //When

        ComplexObject result = calculator.subtract(objectA, objectB);

        //Then
        Assert.assertEquals(expectedResult, result);
        //Mockito.verify(countingService, Mockito.times(2)).add(objectA,objectB);
        Mockito.verify(countingService).subtract(objectA,objectB);
        Mockito.verify(statisticService).increase(Operation.SUBTRACT);
        //Mockito.verify(statisticService).getStatistic(Operation.SUBTRACT);
    }

}
