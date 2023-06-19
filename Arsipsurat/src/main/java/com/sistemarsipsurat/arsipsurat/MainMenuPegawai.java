package com.sistemarsipsurat.arsipsurat;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuPegawai {
    @FXML
    private Button re;
    @FXML
    private Label helo;
    @FXML
    void inites(){
        helo.setText("Halo gan");
    }

}
