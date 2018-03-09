
package ru.mperika.yarnotes;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ru.mperika.yarnotes.model.DataModel;
import ru.mperika.yarnotes.model.Note;
import ru.mperika.yarnotes.view.NotesListController;

/**
 *
 * @author Y. Dmitriv <y.o.dmitriv@gmail.com>
 */
public class YarNotes extends Application {

    private Stage primaryStage;
    private AnchorPane anchorPane;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Yar Notes");
        
        showNotesOverview();   
              
    }
    
    public void showNotesOverview(){
        try {
            //создан объект загрузчика для FXML файлов
            FXMLLoader loader = new FXMLLoader();
            //добавляем путь используя рефлексию
            loader.setLocation(YarNotes.class.getResource("/fxml/NotesList.fxml"));
            /**
             * в этом случае выражение в скобках рботает скорее не как приведение типов, а как выбор
             * соответствующего тега из иерархии FXML
             * метод load() загружает всю иерархию из FXML
            */
            anchorPane = (AnchorPane) loader.load();
            Scene scene = new Scene(anchorPane);
            primaryStage.setScene(scene);
            primaryStage.show();
            
            //Объект создается из класса объекта связанного с корневым элементом, метод getController() 
            //возвращает именно контроллер связанный с корневым элементом.
            NotesListController nlc = loader.getController();
            
            DataModel dm = new DataModel();
            nlc.setDataModel(dm);
        } catch (IOException ex) {
            Logger.getLogger(YarNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
