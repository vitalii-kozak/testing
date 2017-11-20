package calculator;

import calculator.domain.ComplexObject;
import calculator.domain.Service;
import calculator.service.CountingService;

import java.util.Map;

/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
public class Calculator {

    private Map <Service, CountingService> serviceMap;

    private CountingService countingService;

    public void setCountingService(CountingService countingService){
        this.countingService = countingService;
    }
    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        return countingService.add(param1,param2);
    }

    public ComplexObject subtrack(ComplexObject param1, ComplexObject param2) {
        return countingService.subtrack(param1,param2);
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        return countingService.multiply(param1,param2);
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        return countingService.divide(param1,param2);
    }
}
