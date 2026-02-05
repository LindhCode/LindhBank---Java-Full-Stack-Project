package com.example.bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class CreateAccount {
    Account admin = new Account("admin","admin",0,0);

    @FXML
    private Button createAccount;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    public void createAccountButton(){
        if(!username.getText().isEmpty() || !password.getText().isEmpty()){
            admin.createNewAccount(username.getText(),password.getText());
        }
    }


    // TODO - Skapa logik som skapar konto baserat på inparametrarna
    // i Account-klassen
    // TODO - Skapa logiken som hanterar text-fieldsen
    public void goToLogInPage (ActionEvent e) throws IOException {
        Main m = new Main();
        m.changeScene("logInPage.fxml");
    }
}
