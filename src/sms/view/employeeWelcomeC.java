package sms.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sms.model.Account;
import sms.model.Employee;

import java.io.IOException;

public class employeeWelcomeC {
    public Pane home;
    public Label accountL;
    public Label servicesL;
    public Label bookingsL;

    public void logout(MouseEvent click) throws IOException
    {
        Parent mainPage = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        Stage window = (Stage) home.getScene().getWindow();
        window.setScene(new Scene(mainPage));
    }

    public void servicesBox(MouseEvent click) throws IOException
    {
        Node node = (Node) click.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        String user = (String) stage.getUserData();
        Parent mainPage = FXMLLoader.load(getClass().getResource("servicesE.fxml"));
        Stage window = (Stage) home.getScene().getWindow();
        window.setUserData(user);
        window.setScene(new Scene(mainPage));
    }
    public void accountBox(MouseEvent click) throws IOException
    {
        Node node = (Node) click.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        String user = (String) stage.getUserData();
        Parent mainPage = FXMLLoader.load(getClass().getResource("accountE.fxml"));
        Stage window = (Stage) home.getScene().getWindow();
        window.setUserData(user);
        window.setScene(new Scene(mainPage));
    }
    public void bookingsBox(MouseEvent click) throws IOException
    {
        Node node = (Node) click.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        String user = (String) stage.getUserData();
        Parent mainPage = FXMLLoader.load(getClass().getResource("bookingsE.fxml"));
        Stage window = (Stage) home.getScene().getWindow();
        window.setUserData(user);
        window.setScene(new Scene(mainPage));
    }
}
