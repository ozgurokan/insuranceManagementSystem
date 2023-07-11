import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager();

        // diğer ödevleri yetiştirmek için manager sınıfına sadece login methodu ekledim. şimdilik program kötü görünüyor.
        User user1 = new User("okan","özdal","ooo@gmail.com","okan","ogrenci",23);
        AddressManager.addAddress(user1,new HomeAddress("kaskldjakdsa"),new BusinessAddress("askdsaşl123","patika"));

        User user2 = new User("sertap","erener","sertaperener@gmail.com","sertap","sarkici",100);
        AddressManager.addAddress(user1,new HomeAddress("kaskldjakdsa"),new BusinessAddress("askdsaşl123","sarki"));

        User user3 = new User("nejat","işler","nejatisler@gmail.com","nejat","oyuncu",51);
        AddressManager.addAddress(user1,new HomeAddress("kaskldjakdsa"),new BusinessAddress("askdsaşl123","kaybedenler kulubu"));

        Individual acc1 = new Individual(user1);
        Individual acc2 = new Individual(user2);
        Enterprise acc3 = new Enterprise(user3);

        AccountManager.addAccount(acc1);
        AccountManager.addAccount(acc2);
        AccountManager.addAccount(acc3);

        System.out.println(AccountManager.getAccountList().size());


        manager.run();


    }
}
