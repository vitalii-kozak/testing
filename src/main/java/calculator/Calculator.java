package calculator;

import calculator.domain.ComplexObject;
import calculator.domain.Operation;
import calculator.domain.Service;
import calculator.service.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
public class Calculator {

    private Map <Service, ValidationService> validationMap;
    private CountingService countingService;
    private StatisticService statisticService;


    public Calculator(CountingService countingService, StatisticService statisticService) {
        this.statisticService = statisticService;
        this.countingService = countingService;

        // Map operation initialization start here
        validationMap = new HashMap<>();
        validationMap.put(Service.ONE, new ValidationServiceOne());
        validationMap.put(Service.TWO, new ValidationServiceTwo());
        validationMap.put(Service.THREE, new ValidationServiceThree());

    }

    public void setCountingService(CountingService countingService){
        this.countingService = countingService;
    }

    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        validateOperation(param1,param2);
        statisticService.increase(Operation.ADD);
        return countingService.add(param1,param2);
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        validateOperation(param1,param2);
        statisticService.increase(Operation.SUBTRACT);
        return countingService.subtract(param1,param2);
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        validateOperation(param1,param2);
        statisticService.increase(Operation.MULTIPLY);
        return countingService.multiply(param1,param2);
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        validateOperation(param1,param2);
        statisticService.increase(Operation.DIVIDE);
        return countingService.divide(param1,param2);
    }


    private void validateOperation(ComplexObject param1, ComplexObject param2) {

        if (param1 == null) {
            throw new IllegalArgumentException("Param1 is null !!!");
        }
        if (param2 == null) {
            throw new IllegalArgumentException("Param2 is null !!!");
        }

        if (param1.getService() != param2.getService()) {
            throw new IllegalArgumentException("Services must be equal !!!");
        }

        ValidationService validationService = validationMap.get(param1.getService());
        validationService.validate(param1);
        validationService.validate(param2);
    }

}
