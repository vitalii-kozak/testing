package calculator.service;

import calculator.domain.ComplexObject;
import calculator.domain.Service;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
public class CountingServiceImplTest {

    private CountingService countingService = new CountingServiceImpl();


    @Test
    public void addTest() {
        ComplexObject objectA = new ComplexObject(1, 2, Service.ONE);
        ComplexObject objectB = new ComplexObject(3 , 4, Service.ONE);

        ComplexObject expectedObject = new ComplexObject(4 ,6, Service.ONE);

        //When
        ComplexObject result = countingService.add(objectA, objectB);

        //Then
        Assert.assertEquals(expectedObject,result);
    }

    @Test
    public void subtractTest() {
        ComplexObject objectA = new ComplexObject(1, 2, Service.TWO);
        ComplexObject objectB = new ComplexObject(3 , 4, Service.TWO);

        ComplexObject expectedObject = new ComplexObject(-2 ,-2, Service.TWO);

        //When
        ComplexObject result = countingService.subtract(objectA, objectB);

        //Then
        Assert.assertEquals(expectedObject,result);
    }

    @Test
    public void divideTest() {
        ComplexObject objectA = new ComplexObject(4, -4, Service.THREE);
        ComplexObject objectB = new ComplexObject(2 , 2, Service.THREE);

        ComplexObject expectedObject = new ComplexObject(2 ,-2, Service.THREE);

        //When
        ComplexObject result = countingService.divide(objectA, objectB);

        //Then
        Assert.assertEquals(expectedObject,result);
    }

    @Test
    public void multiplyTest() {
        ComplexObject objectA = new ComplexObject(4, 3, Service.ONE);
        ComplexObject objectB = new ComplexObject(2 , 2, Service.ONE);

        ComplexObject expectedObject = new ComplexObject(8 ,6, Service.ONE);

        //When
        ComplexObject result = countingService.multiply(objectA, objectB);

        //Then
        Assert.assertEquals(expectedObject,result);
    }



}
