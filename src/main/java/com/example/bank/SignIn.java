package com.example.bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;


public class SignIn {
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

    private void checkLogin() throws IOException {
        Main m = new Main();
        if(username.getText().toString().equals("Axel") && password.getText().toString().equals("123")){
            logInTrue.setText("Welcome!");
            m.changeScene("mainPage.fxml");
        }
        else if(username.getText().isEmpty() || password.getText().isEmpty()){
            logInTrue.setText("Please enter all your data");

        }
        else{
            logInTrue.setText("Wrong username or password");
        }
    }
}
