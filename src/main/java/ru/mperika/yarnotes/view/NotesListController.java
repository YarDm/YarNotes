/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mperika.yarnotes.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import ru.mperika.yarnotes.MainApp;
import ru.mperika.yarnotes.model.Note;

/**
 * FXML Controller class
 *
 * @author Y. Dmitriv <y.o.dmitriv@gmail.com>
 */
public class NotesListController implements Initializable{

    @FXML
    private TableView<Note> tableView;
    @FXML
    private TableColumn<Note,String> dateColumn;
    @FXML
    private TableColumn<Note,String> noteColumn;
    
    private MainApp mainApp;
    
    public NotesListController(){
        
    }
    
    /*
    @FXML
    private void initialize() {
        dateColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Note, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Note, String> cellData) {
                return cellData.getValue().dateProperty();
            }
        });
        noteColumn.setCellValueFactory(cellData -> cellData.getValue().noteProperty());
        
    }    
    */
    
    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
        
        tableView.setItems(mainApp.getNoteData());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dateColumn.setCellValueFactory(new PropertyValueFactory<Note, String>("date"));
    }
    
}
