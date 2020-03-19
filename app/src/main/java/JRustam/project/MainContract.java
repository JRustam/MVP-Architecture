package JRustam.project;

public interface MainContract {

     interface View {
        void showLogin(String login);
        void showPassword(String password);
    }

    interface Presenter {
         void onButtonClicked();
         void onDestroy();
    }

    interface Model {
         String loadLogin();
         String loadPassword();
    }
}
