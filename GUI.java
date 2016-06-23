import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.Scene;

public class GUI extends Application{

public static void main(String[] args) {
launch(args);
}

 @Override
 public void start(Stage mainStage) {
 Button bt_training = new Button();
 bt_training.setText("Übung auswählen");
 Text tx_Welcome = new Text("Willkommen!");

 GridPane mainMenu_layout = new GridPane();
 mainMenu_layout.setAlignment(Pos.CENTER);
 mainMenu_layout.add(tx_Welcome,0,0);
 mainMenu_layout.add(bt_training,0,1);
 
 Scene sc_mainmenu = new Scene(mainMenu_layout,500,500);

 mainStage.setScene(sc_mainmenu);
 mainStage.setTitle("Hauptemü");
 mainStage.show();
 }




}
