package calculator.service;

import calculator.domain.ComplexObject;
import calculator.domain.Service;

public class ValidationServiceThree implements ValidationService {

    public void validate(ComplexObject object) {
        if (object == null) {
            throw new IllegalArgumentException("Complex object is null !!!");
        }
        if (object.getValueA() != 50 || object.getValueA() != -100) {
            throw new IllegalArgumentException("ValueA must be 50 or -100 !!!");
        }
        if (object.getValueB() >= 0) {
            throw new IllegalArgumentException("ValueB must be less than zero !!!");
        }
    }
}
