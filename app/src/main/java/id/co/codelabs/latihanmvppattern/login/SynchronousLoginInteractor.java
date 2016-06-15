package id.co.codelabs.latihanmvppattern.login;

/**
 * Created by bayu_ on 6/15/2016.
 */
public class SynchronousLoginInteractor implements ILoginInteractor {
    private final String emailAccount = "bayubayyz@gmail.com";
    private final String passAccount = "bayubayu";

    public SynchronousLoginInteractor() {
    }

    @Override
    public boolean validateCredentials(String email, String password) {
        return email.equals(emailAccount) && password.equals(passAccount);
    }
}
