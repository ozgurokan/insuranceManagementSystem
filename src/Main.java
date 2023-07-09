import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager();


        User user1 = new User("okan","özdal","okanokan1@gmail.com","okanokan1","yazilimci",31);
        AddressManager.addAddress(user1,new HomeAddress("kaskldjakdsa"),new BusinessAddress("askdsaşl123","Meta"));

        User user2 = new User("sertap","erener","okanokan11@gmail.com","okanokan1","yazilimci",31);
        AddressManager.addAddress(user1,new HomeAddress("kaskldjakdsa"),new BusinessAddress("askdsaşl123","Meta"));

        User user3 = new User("arsız","dayak","okanokan12@gmail.com","okanokan1","yazilimci",31);
        AddressManager.addAddress(user1,new HomeAddress("kaskldjakdsa"),new BusinessAddress("askdsaşl123","Meta"));

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