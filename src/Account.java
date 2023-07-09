import java.util.*;

public abstract class Account implements Comparable<Account> {
    private User user;
    private ArrayList<Insurance> insurances;
    private AuthenticationStatus status = AuthenticationStatus.FAIL;
    private Scanner input = new Scanner(System.in);


    public Account(User user) {
        this.user = user;
    }


    public final void showUserInfo() {

        System.out.println(user.getFirstName() + " " + user.getLastName() + " Bilgileri: ");
        System.out.println("Yaş: " + user.getAge());
        System.out.println("Meslek : " + user.getJob());
        System.out.println("E-Posta : " + user.getEmail());
        System.out.println("Son Giriş Tarihi : " + user.getLastLoginDate().toString());
        System.out.println("Adres: ");

        for (IAddress address : user.getAddresses()) {
            System.out.println(address.getAddress());
            System.out.println("------------------------------------");
        }

    }

    public void login(String email, String password) {

        if (email.equals(this.user.getEmail()) && password.equals(this.user.getPassword())) {
            this.status = AuthenticationStatus.SUCCESS;
            System.out.println("Giriş Başarılı");
            this.user.setLastLoginDate(new Date());
        }
    }


    public void addNewAddress() {
        System.out.println("Vazgeçmek için : X");
        System.out.print("Adres Tipi: (E)v - (İ)ş");

        String addressType = input.nextLine().toLowerCase();
        String newAddress;
        switch (addressType) {
            case "x":
                break;
            case "e":
                System.out.print("Adresinizi giriniz: ");
                newAddress = input.nextLine();
                AddressManager.addAddress(this.user, new HomeAddress(newAddress));
                System.out.println("Yeni adres eklendi.");
                break;
            case "i":
                System.out.print("Adresinizi giriniz: ");
                newAddress = input.nextLine();
                System.out.print("Şirket Adını Giriniz: ");
                String companyName = input.nextLine();
                AddressManager.addAddress(this.user, new BusinessAddress(newAddress, companyName));
                System.out.println("Yeni adres eklendi.");
                break;
            default:
                System.out.println("Hatalı değer girdiniz!");
        }
    }

    public void removeAddress() {

        for (int i = 1; i < user.getAddresses().size(); i++) {
            System.out.println(i + " --> " + user.getAddresses().get(i).getAddress());
        }
        System.out.print("Silmek istediğiniz adresi seçiniz.");
        int selectedAddress = input.nextInt();

        try {
            AddressManager.removeAddress(this.user, this.user.getAddresses().get(selectedAddress - 1));
            System.out.println("Adres silindi.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Geçersiz adres numarası: ");
        }

    }

    public AuthenticationStatus getStatus() {
        return status;
    }


    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }


    public User getUser() {
        return user;
    }

    public abstract void addInsurancePolicy(Insurance insurance);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(user, account.user) && Objects.equals(insurances, account.insurances) && status == account.status && Objects.equals(input, account.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, insurances, status, input);
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getFirstName().compareTo(o.getUser().getFirstName());
    }
}
