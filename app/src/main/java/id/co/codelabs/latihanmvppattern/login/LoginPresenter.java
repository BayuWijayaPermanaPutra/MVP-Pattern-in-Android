package id.co.codelabs.latihanmvppattern.login;

import id.co.codelabs.latihanmvppattern.LoginActivity;

/**
 * Created by bayu_ on 6/15/2016.
 */
public class LoginPresenter {
    private ILoginView view;
    private SynchronousLoginInteractor interactor;

    public LoginPresenter(ILoginView view) {
        this.view = view;
        this.interactor = new SynchronousLoginInteractor();
    }



    public void attemptLogin(String email, String password){
        boolean isValid = interactor.validateCredentials(email,password);
        if(isValid){
            view.navigateToListActivity();
        } else {
            view.loginFailed();
        }
    }
}
