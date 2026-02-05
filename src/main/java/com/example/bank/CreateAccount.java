package com.example.bank;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CreateAccount {

    // TODO - Skapa logik som skapar konto baserat på inparametrarna
    // i Account-klassen
    // TODO - Skapa logiken som hanterar text-fieldsen
    public void goToLogInPage (ActionEvent e) throws IOException {
        Main m = new Main();
        m.changeScene("logInPage.fxml");
    }
}
