package vues;

import controleur.Controleur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modeleCreaFilm.Film;

import java.io.IOException;
import java.util.Collection;

public class TousLesFilms extends Vue implements VueInteractive {
    public Controleur controleur;

    @FXML
    TextArea lesFilms;

    @FXML
    VBox mainVbox;

    @FXML
    Button buttonRetour;

    @Override
    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    @FXML
    AnchorPane anchorPane;
    public static TousLesFilms creerVue(Controleur controleur, Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(TousLesFilms.class.getResource("touslesfilms.fxml"));
        fxmlLoader.load();
        TousLesFilms tousLesFilms = fxmlLoader.getController();
        tousLesFilms.initialiserVue();
        tousLesFilms.setControleur(controleur);
        tousLesFilms.setStage(stage);
        tousLesFilms.setScene(new Scene(tousLesFilms.anchorPane));

        return tousLesFilms;
    }

    private void initialiserVue(){
        buttonRetour.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                controleur.gotoMenu();
            }
        });
    }
    public void charger(Collection<Film> allFilms) {

    }
}
