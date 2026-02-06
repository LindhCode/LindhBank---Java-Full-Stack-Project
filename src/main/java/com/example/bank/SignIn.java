package com.example.bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;


public class SignIn {
    Account admin = new Account("admin","admin",0,0);
    Main m = new Main();

    @FXML
    private Button logInButton;
    @FXML
    private Label logInTrue;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    public void logIn(ActionEvent e) throws IOException {
        checkLogin();
    }

    public void goToPageCreateAccount(ActionEvent e) throws IOException {
            m.changeScene("createAccountPage.fxml");
        }

    private void checkLogin() throws IOException {
        String attemptedUsername = username.getText();
        String attemptedPassword = password.getText();
        boolean validLogIn = false;
        for(Account a: Account.getAccounts()){
            if(attemptedUsername.equals(a.getUsername()) && attemptedPassword.equals(a.getPassword())){
                validLogIn = true;
            }
        }
        if(validLogIn){
            logInTrue.setText("Welcome!");
            m.changeScene("mainPage.fxml");
            validLogIn = false;
        }
        else if(username.getText().isEmpty() || password.getText().isEmpty()){
            logInTrue.setText("Please enter all your data");

        }
        else{
            logInTrue.setText("Wrong username or password");
        }
    }
}
