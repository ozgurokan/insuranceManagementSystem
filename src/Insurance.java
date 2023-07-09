import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double price;
    private Date startDate, finishDate;


    public Insurance(String insuranceName, double price, Date startDate, Date finishDate) {
        this.insuranceName = insuranceName;
        this.price = price;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }


    public abstract double calculate();
}
