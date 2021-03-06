package sms.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class contactC {
    public Pane home;
    public Pane about;

    public void homeClick(MouseEvent click) throws IOException
    {
        Parent mainPage = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        Stage window = (Stage) home.getScene().getWindow();
        window.setScene(new Scene(mainPage));
    }

    public void aboutClick(MouseEvent click) throws IOException
    {
        Parent aboutPage = FXMLLoader.load(getClass().getResource("about.fxml"));
        Stage window = (Stage) about.getScene().getWindow();
        window.setScene(new Scene(aboutPage));
    }
}
