package com.sistemarsipsurat.arsipsurat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainmenu {
    @FXML
    private Button tambahsuratmasuk;
    @FXML
    private Button tambahsuratkeluar;
    @FXML
    private TableView listsuratmasuk;
    @FXML
    private TableView listsuratkeluar;
    @FXML
    private Button deletesuratchoosen;

    @FXML
    void tambahsuratmasukonclick() throws IOException {
        bukamainmenu12();
    }
    public void bukamainmenu12() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tambahsuratmasuk.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) Tes.getScene().getWindow();
            stage.setTitle("arsipsurat");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}