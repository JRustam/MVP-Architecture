package presenter;

import android.util.Log;
import JRustam.project.MainContract;
import model.Model;

public class Presenter implements MainContract.Presenter {

    private static final String TAG = "Presenter";

    private MainContract.Model model;
    private MainContract.View view;

    private String login;
    private String password;

    public Presenter(MainContract.View view) {
        this.view = view;
        this.model = new Model();
    }

    @Override
    public void onButtonClicked() {
        login = model.loadLogin();
        password = model.loadPassword();
        view.showLogin(login);
        view.showPassword(password);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: bla bla bla");
    }
}
