/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mperika.yarnotes;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.mperika.yarnotes.model.Note;
import ru.mperika.yarnotes.view.NotesListController;

/**
 *
 * @author Y. Dmitriv <y.o.dmitriv@gmail.com>
 */
public class MainApp extends Application {

    private Stage primaryStage;

    private ObservableList<Note> noteData = FXCollections.observableArrayList();

    public MainApp() {
        noteData.add(new Note(LocalDate.now(), "Hello, how are you?"));
        noteData.add(new Note(LocalDate.now(), "Fuck off muderfucker!"));
        noteData.add(new Note(LocalDate.now(), "FUUUUUUUUUUCK!"));
    }

    public ObservableList<Note> getNoteData() {
        return this.noteData;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/NotesList.fxml"));
            Scene scene = new Scene(root);
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("Yar Notes");
            this.primaryStage.setScene(scene);
            this.primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        /**NotesListController nlc = new NotesListController();
        nlc.setMainApp(this);
*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
