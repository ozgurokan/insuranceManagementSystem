import java.util.Date;

public class TravelInsurance extends Insurance{

    public TravelInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
        super(insuranceName, price, startDate, finishDate);
    }

    @Override
    public double calculate() {
        //sigorta nasıl hesaplanıyor bilmiyorum
        return 199.99;
    }
}
