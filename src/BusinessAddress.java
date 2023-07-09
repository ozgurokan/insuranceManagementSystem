public class BusinessAddress implements IAddress{

    private String address;
    private String companyName;

    public BusinessAddress(String address,String companyName) {
        this.address = address;
        this.companyName = companyName;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    public String getCompanyName(){
        return this.companyName;
    }
}
