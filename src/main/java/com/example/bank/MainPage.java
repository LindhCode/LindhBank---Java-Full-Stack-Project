package com.example.bank;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MainPage {

    public void userLogOut(ActionEvent e) throws IOException{
        Main m = new Main();
        m.changeScene("logInPage.fxml");
    }


}
