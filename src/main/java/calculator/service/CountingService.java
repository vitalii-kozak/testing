package calculator.service;

import calculator.domain.ComplexObject;

/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
public interface CountingService {
    ComplexObject add(ComplexObject param1, ComplexObject param2);
    ComplexObject subtrack(ComplexObject param1, ComplexObject param2);
    ComplexObject multiply(ComplexObject param1, ComplexObject param2);
    ComplexObject divide(ComplexObject param1, ComplexObject param2);
}
