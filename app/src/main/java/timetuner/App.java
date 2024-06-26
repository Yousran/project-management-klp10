/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package timetuner;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import timetuner.models.User;
import timetuner.views.SceneLogin;

public class App extends Application {
    public static User loggedUser = null;
    public static String AppName = "Project Management";
    public static String style = "/styles/styles.css";
    //NOTE: remove budget dengan membuat button di samping kiri budget yang akan muncul jika di hover
    //NOTE: scroll pane di team member dan budgetlist
    //NOTE: tambah tim tidak bisa menambah 2 kali username yang sama
    //NOTE: budget tidak bisa negative
    //NOTE: due date tidak boleh lewat dari sekarang
    //NOTE: edit project name,due date, dan budget
    //NOTE: register, email harus pake lower case
    //NOTE: username berikan batasan 12 huruf
    //NOTE: validasi username tidak boleh sama dengan yang sudah ada
    //NOTE: saat project list kosong akan memberikan pesan
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(true);
        // primaryStage.setMaximized(true);
        primaryStage.setTitle(AppName);
        Image appIcon = new Image(getClass().getResourceAsStream("/icons/app-logo.png"));
        primaryStage.getIcons().add(appIcon);
        SceneLogin sceneLogin = new SceneLogin(primaryStage,1024,720);
        sceneLogin.show();
    }
}
