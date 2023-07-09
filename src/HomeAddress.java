public class HomeAddress implements IAddress{
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
}
