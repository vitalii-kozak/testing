package calculator.service;

import calculator.domain.ComplexObject;
import calculator.domain.Service;

public class ValidationServiceOne implements ValidationService {

    public void validate(ComplexObject object) {
        if (object == null) {
            throw new IllegalArgumentException("Complex object is null !!!");
        }
    }
}
