import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  {
       primaryStage.show();
    }
}
