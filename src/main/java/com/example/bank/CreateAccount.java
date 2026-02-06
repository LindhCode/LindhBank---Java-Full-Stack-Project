package com.example.bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class CreateAccount {
    Account admin = new Account("admin","admin",0,0);
    Main m = new Main();
    @FXML
    private Button createAccount;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label successLabel;


    public void createAccountButton() throws IOException {
        boolean accountExists = false;
        for(Account a: admin.getAccounts()){
            if(Objects.equals(a.getUsername(), username.getText())){
                successLabel.setText("Account with that name already exists");
                accountExists = true;
            }
        }

        if(!username.getText().isEmpty() && !password.getText().isEmpty() && !accountExists){
            admin.createNewAccount(username.getText(),password.getText());
            m.changeScene("logInPage.fxml");
            accountExists = false;
        }

    }

    public void goToLogInPage (ActionEvent e) throws IOException {
        m.changeScene("logInPage.fxml");
    }
}
