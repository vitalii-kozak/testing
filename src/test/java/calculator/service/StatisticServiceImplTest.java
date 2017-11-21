package calculator.service;

import calculator.Calculator;
import calculator.domain.ComplexObject;
import calculator.domain.Operation;
import calculator.domain.Service;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class StatisticServiceImplTest {

    private CountingService countingService;
    private StatisticService statisticService;
    private Calculator calculator;

    @Before
    public void BeforeClassInit(){
        countingService = new CountingServiceImpl();
        statisticService = new StatisticServiceImpl();
        calculator = new Calculator(countingService, statisticService);
    }

    @Test
    public void countAddTest() {
        //Before
        ComplexObject objectA = new ComplexObject(1, 2, Service.ONE);
        ComplexObject objectB = new ComplexObject(3 , 4, Service.ONE);
        int itWas = statisticService.getStatistic(Operation.ADD);

        //When
        calculator.add(objectA, objectB);
        calculator.add(objectA, objectB);

        //Then
        Assert.assertEquals(statisticService.getStatistic(Operation.ADD), itWas + 2);

    }

    @Test
    public void countSubtractTest() {
        //Before
        ComplexObject objectA = new ComplexObject(1, 2, Service.ONE);
        ComplexObject objectB = new ComplexObject(3 , 4, Service.ONE);
        int itWas = statisticService.getStatistic(Operation.SUBTRACT);

        //When
        calculator.subtract(objectA, objectB);
        calculator.subtract(objectA, objectB);

        //Then
        Assert.assertEquals(statisticService.getStatistic(Operation.SUBTRACT), itWas + 2);

    }

    @Test
    public void countMultiplyTest() {
        //Before
        ComplexObject objectA = new ComplexObject(1, 2, Service.ONE);
        ComplexObject objectB = new ComplexObject(3 , 4, Service.ONE);
        int itWas = statisticService.getStatistic(Operation.MULTIPLY);

        //When
        calculator.multiply(objectA, objectB);
        calculator.multiply(objectA, objectB);

        //Then
        Assert.assertEquals(statisticService.getStatistic(Operation.MULTIPLY), itWas + 2);

    }


}
