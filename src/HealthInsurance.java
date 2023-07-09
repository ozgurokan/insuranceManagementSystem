import java.util.Date;

public class HealthInsurance extends Insurance{

    public HealthInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
        super(insuranceName, price, startDate, finishDate);
    }

    @Override
    public double calculate() {
        // sigorta neye göre hesaplanıyor bilmiyorum

        return 123.31;
    }
}
