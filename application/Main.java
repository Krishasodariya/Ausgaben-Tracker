package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

//Die Main-Klasse erbt von der Application-Klasse, um eine JavaFX-Anwendung zu starten.
public class Main extends Application {
	
	// Die start-Methode wird aufgerufen, wenn die Anwendung gestartet wird.
	@Override
	public void start(Stage primaryStage) {
		try {
			// FXMLLoader wird verwendet, um die Benutzeroberflaeche aus einer FXML-Datei zu laden.
			FXMLLoader loader = new FXMLLoader();
			
			// Die Lage der Haupt-FXML-Datei wird festgelegt.
			loader.setLocation(Main.class.getResource("MainWindow.fxml"));
			
			// Die Wurzel des FXML-Dokuments, hier ein AnchorPane, wird geladen.
			AnchorPane root = loader.load();
			
			// Eine neue Szene wird mit der Wurzel und den angegebenen Abmessungen erstellt.
			Scene scene = new Scene(root,1080,500);
			// Ein externes Stylesheet wird der Szene hinzugefuegt, um das Aussehen zu definieren.
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// Die Szene wird dem primaeren Fenster (Stage) zugewiesen.
			primaryStage.setScene(scene);
			
			// Das primaere Fenster wird angezeigt.
			primaryStage.show();
		} catch(Exception e) {
			// Fehler werden hier abgefangen und auf der Konsole ausgegeben.
			e.printStackTrace();
		}
	}
	
	// Die main-Methode startet die Anwendung, indem sie die launch-Methode von Application aufruft.
	public static void main(String[] args) {
		launch(args);
	}
}
