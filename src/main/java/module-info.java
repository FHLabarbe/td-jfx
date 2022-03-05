module permissions {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens vues to javafx.fxml;
    opens modeleCreaFilm to javafx.base;
    exports pnt;
}
