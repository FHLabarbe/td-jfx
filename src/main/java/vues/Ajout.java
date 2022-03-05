package vues;

import controleur.Controleur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modeleCreaFilm.Film;

import java.io.IOException;
import java.util.Collection;

public class Ajout extends Vue implements VueInteractive {
    public Controleur controleur;

    @FXML
    TextField newFilm;

    @FXML
    Button buttonRetour;

    @Override
    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    @FXML
    BorderPane borderPane;
    public static Ajout creerVue(Controleur controleur, Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Ajout.class.getResource("ajout.fxml"));
        fxmlLoader.load();
        Ajout ajout = fxmlLoader.getController(); //Donne le controleur crée par fxml
        ajout.initialiserVue();
        ajout.setControleur(controleur);
        ajout.setStage(stage); //définit la stage
        ajout.setScene(new Scene(ajout.borderPane)); //définit la scène

        return ajout;
    }

    private void initialiserVue(){
        buttonRetour.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                controleur.gotoMenu();
            }
        });
    }

    public void afficherErreur(String erreur_de_genre, String s) {
    }

    public void viderChamps() {
    }
}
