import javax.naming.AuthenticationException;
import java.util.Objects;
import java.util.TreeSet;

public class AccountManager {

    private static TreeSet<Account> accountList = new TreeSet<>();


    public static void addAccount(Account account) {
        accountList.add(account);
    }


    public static Account login(String email, String password) throws InvalidAuthenticationException {
        Account loggedAccount = null;

        for (Account acc : accountList) {
            if (acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(password)) {
                acc.login(email, password);
                loggedAccount = acc;
            }
        }
        if (!(loggedAccount == null)) {
            return loggedAccount;
        } else {
            throw new InvalidAuthenticationException("Giriş bilgileri eksik veya hatalı");
        }
    }


    public static TreeSet<Account> getAccountList() {
        return accountList;
    }
}
