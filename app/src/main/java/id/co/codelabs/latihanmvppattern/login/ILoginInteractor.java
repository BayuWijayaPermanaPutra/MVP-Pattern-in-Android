package id.co.codelabs.latihanmvppattern.login;

/**
 * Created by bayu_ on 6/15/2016.
 */
public interface ILoginInteractor {
    boolean validateCredentials(String username, String password);
}
