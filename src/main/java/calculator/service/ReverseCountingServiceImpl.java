package calculator.service;

import calculator.Calculator;
import calculator.domain.ComplexObject;

/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
public class ReverseCountingServiceImpl implements CountingService {

    public ComplexObject add(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() + param2.getValueA());
        result.setValueB(param1.getValueB() + param2.getValueB());
        return result;
    }

    public ComplexObject subtract(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() - param2.getValueA());
        result.setValueB(param1.getValueB() - param2.getValueB());
        return result;
    }

    public ComplexObject multiply(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() * param2.getValueA());
        result.setValueB(param1.getValueB() * param2.getValueB());
        return result;
    }

    public ComplexObject divide(ComplexObject param1, ComplexObject param2) {
        ComplexObject result = new ComplexObject();
        result.setValueA(param1.getValueA() / param2.getValueA());
        result.setValueB(param1.getValueB() / param2.getValueB());
        return result;
    }
}
