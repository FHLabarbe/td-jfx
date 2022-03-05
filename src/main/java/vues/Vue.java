package vues;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Vue {
    private Stage stage;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    private Scene scene;

    public  Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void show (){
        this.getStage().setScene(scene);
        this.getStage().show();
    }
}
