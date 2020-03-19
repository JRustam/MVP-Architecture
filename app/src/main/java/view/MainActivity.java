package view;

//region IMPORTS
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.main.R;

import JRustam.project.MainContract;
import presenter.Presenter;
//endregion

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter presenter;

    private TextView loginTxt;
    private TextView passwordTxt;
    private Button logInBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);
        loginTxt = findViewById(R.id.login);
        passwordTxt = findViewById(R.id.password);
        logInBtn = findViewById(R.id.button);
        logInBtn.setOnClickListener((v) -> presenter.onButtonClicked());
    }

    @Override
    public void showLogin(String login) {
        loginTxt.setText(login);
    }

    @Override
    public void showPassword(String message) {
        passwordTxt.setText(message);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
