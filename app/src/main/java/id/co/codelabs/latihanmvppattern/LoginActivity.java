package id.co.codelabs.latihanmvppattern;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.co.codelabs.latihanmvppattern.login.ILoginView;
import id.co.codelabs.latihanmvppattern.login.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements ILoginView {
    private EditText edtTextEmail;
    private EditText edtTextPassword;
    private Button buttonLogin;
    ProgressDialog progressDialog;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        presenter = new LoginPresenter(this);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                progressDialog = ProgressDialog.show(getBaseContext(),"Authenticating",null);
                String email = edtTextEmail.getText().toString();
                String pass = edtTextPassword.getText().toString();

                presenter.attemptLogin(email,pass);
            }
        });
    }

    private void initView(){
        edtTextEmail = (EditText) findViewById(R.id.edt_text_emaillogin);
        edtTextPassword = (EditText) findViewById(R.id.edt_text_passwordlogin);
        buttonLogin = (Button) findViewById(R.id.button_login);
    }

    @Override
    public void navigateToListActivity() {
        //progressDialog.dismiss();
        Toast.makeText(this,"Login Success",Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginFailed() {
        //progressDialog.dismiss();
        Toast.makeText(this,"Login Failed. Email or Password is incorrect!",Toast.LENGTH_LONG).show();
    }
}
