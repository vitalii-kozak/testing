package calculator.service;

import calculator.domain.ComplexObject;
import calculator.domain.Operation;


/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
public class CountingServiceImpl implements CountingService{

    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() + param2.getValueA());
        result.setValueB(param1.getValueB() + param2.getValueB());
        result.setService(param1.getService());
        return result;
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() - param2.getValueA());
        result.setValueB(param1.getValueB() - param2.getValueB());
        result.setService(param1.getService());
        return result;
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() * param2.getValueA());
        result.setValueB(param1.getValueB() * param2.getValueB());
        result.setService(param1.getService());
        return result;
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() / param2.getValueA());
        result.setValueB(param1.getValueB() / param2.getValueB());
        result.setService(param1.getService());
        return result;
    }
}
