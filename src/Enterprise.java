public class Enterprise extends Account{

    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {

        this.getInsurances().add(insurance);
    }
}
