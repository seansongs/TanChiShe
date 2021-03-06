package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GamePanel gamePanel = new GamePanel();

        final Scene scene = new Scene(gamePanel,800, 600);
        gamePanel.initial();
        scene.setFill(new ImagePattern(new Image(getClass().getResourceAsStream("img/background.png"))));
        stage.setScene(scene);
        stage.setTitle("JavaFX游戏开发--贪吃蛇--by HUPENG");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("img/snake_logo.png")));
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.exit(0);
            }
        });
        stage.show();
    }
    public static void main(String[] args) {
        launch(Main.class, args);
    }
}
