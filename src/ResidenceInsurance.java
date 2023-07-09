import java.util.Date;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
        super(insuranceName, price, startDate, finishDate);
    }

    @Override
    public double calculate() {
        // sigorta nasıl hesaplannır bilmiyorum.
        return 231.23;
    }
}
