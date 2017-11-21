package calculator.service;

import calculator.domain.ComplexObject;
import calculator.domain.Service;

/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
public interface CountingService {
    //Operation add two ComplexObject
    ComplexObject add(ComplexObject param1, ComplexObject param2);
    //Operation subtract two ComplexObject
    ComplexObject subtract(ComplexObject param1, ComplexObject param2);
    //Operation multiply two ComplexObject
    ComplexObject multiply(ComplexObject param1, ComplexObject param2);
    //Operation divide two ComplexObject
    ComplexObject divide(ComplexObject param1, ComplexObject param2);
}
