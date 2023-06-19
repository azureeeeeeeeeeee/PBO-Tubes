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

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Logincontroller extends UserModel {

    @FXML
    private Button loginButton;
    @FXML
    private Label wrongpass;
    @FXML
    private TextField usernameinput;
    @FXML
    private PasswordField passwordinput;

    @FXML
    void onLoginButtonClick() throws IOException {
        if (usernameinput.getText().isBlank() == false && passwordinput.getText().isBlank() == false) {
            validateLogin();
        } else {
            wrongpass.setText("Masukkan Username dan Password!");
        }
    }

    public void validateLogin(){
            databaseConnection connect = new databaseConnection();
            Connection connectDB = connect.getConnection();
            String verifylogin = "SELECT count(1) FROM userdata WHERE username ='"+usernameinput.getText()+"'AND password ='"+passwordinput.getText()+"'";
            try {
                Statement statement = connectDB.createStatement();
                ResultSet queryResult = statement.executeQuery(verifylogin);

                while (queryResult.next()){
                    if (queryResult.getInt(1)==1){
                        String verifyuser = "SELECT count(1) FROM userdata WHERE username ='"+usernameinput.getText()+"'AND jenispengguna ='"+1+"'";
                        ResultSet hasilquery = statement.executeQuery(verifyuser);
                        while (hasilquery.next()){
                            if(hasilquery.getInt(1)==1){
                                bukamainmenu();
                            } else {
                                bukamainmenupegawai();
                            }
                        }
                    } else {
                        wrongpass.setText("Invalid Login");
                    }
                }
            } catch (Exception e) {

            }

        }

//        String username = usernameinput.getText();
//        String password = passwordinput.getText();
//        userDAO user  = new userDAO(username,password);
//        usernameinput.setText("");
//        passwordinput.setText("");




    public void bukamainmenu() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenuAdmin.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.setTitle("arsipsurat");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void bukamainmenupegawai() throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainmenupegawai.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.setTitle("arsipsurat");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}