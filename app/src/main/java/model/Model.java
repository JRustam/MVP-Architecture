package model;

import JRustam.project.MainContract;

public class Model implements MainContract.Model {

    @Override
    public String loadLogin() {
        return "Rustam";
    }

    @Override
    public String loadPassword() {
        return "12345";
    }
}
