import java.util.Date;

public class CarInsurance extends Insurance{

    public CarInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
        super(insuranceName, price, startDate, finishDate);
    }

    @Override
    public double calculate() {

        // sigorta nasıl hesaplanır bilmiyorum
        return 333.123;
    }
}
