package calculator.service;

import calculator.domain.ComplexObject;
import calculator.domain.Service;

public class ValidationServiceTwo implements ValidationService {

    public void validate(ComplexObject object) {
        if (object == null) {
            throw new IllegalArgumentException("Complex object is null !!!");
        }
        if (object.getValueA() <= 0) {
            throw new IllegalArgumentException("ValueA must be more than zero !!!");
        }
        if (object.getValueB() <= 0) {
            throw new IllegalArgumentException("ValueB must be more than zero !!!");
        }
    }
}
