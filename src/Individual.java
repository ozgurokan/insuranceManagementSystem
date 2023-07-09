public class Individual extends Account{

    public Individual(User user) {
        super(user);
    }


    @Override
    public void addInsurancePolicy(Insurance insurance) {

        this.getInsurances().add(insurance);
    }

}
