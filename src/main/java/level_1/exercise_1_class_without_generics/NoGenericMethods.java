package level_1.exercise_1_class_without_generics;

import java.math.BigDecimal;

public class NoGenericMethods {
    private BigDecimal element1;
    private BigDecimal element2;
    private BigDecimal element3;

    public NoGenericMethods(BigDecimal element1, BigDecimal element2, BigDecimal element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public BigDecimal getElement1(){return element1;}
    public BigDecimal getElement2(){return element2;}
    public BigDecimal getElement3(){return element3;}
}
