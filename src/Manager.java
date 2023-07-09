import java.util.Scanner;

public class Manager {

    private Scanner input = new Scanner(System.in);


    public void run() {
        Account account;
        System.out.print("Mail Adresi: ");
        String mail = input.nextLine();

        System.out.print("Şifre: ");
        String password = input.nextLine();


        try {
            account = AccountManager.login(mail, password);
        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }

    }
}
