public class AddressManager {

    // kullanıcının sadece ev adresi varsa
    public static void addAddress(User user, IAddress address){

        user.getAddresses().add(address);

    }

    // hem ev hem iş yeri adresi varsa
    public static void addAddress(User user, HomeAddress homeAddress, BusinessAddress businessAddress){

        user.getAddresses().add(homeAddress);
        user.getAddresses().add(businessAddress);

    }

    // adres silme
    public static void removeAddress(User user, IAddress address){

        user.getAddresses().remove(address);

    }
}
