package calculator.domain;

/**
 * Created by Vitalii_Kozak on 11/20/2017.
 */
public class ComplexObject {
    private int valueA;
    private int valueB;
    private Service service;

    public ComplexObject() {
    }

    public ComplexObject(int valueA, int valueB, Service service) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.service = service;
    }

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexObject that = (ComplexObject) o;

        if (valueA != that.valueA) return false;
        return valueB == that.valueB;

    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        int result = valueA;
        result = 31 * result + valueB;
        return result;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "valueA=" + valueA +
                ", valueB=" + valueB +
                '}';
    }
}
