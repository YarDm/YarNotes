/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mperika.yarnotes.view;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import ru.mperika.yarnotes.YarNotes;
import ru.mperika.yarnotes.model.DataModel;
import ru.mperika.yarnotes.model.Note;

/**
 * FXML Controller class
 *
 * @author Y. Dmitriv <y.o.dmitriv@gmail.com>
 */
public class NotesListController {

    @FXML
    private TableView<Note> tableView;
    @FXML
    private TableColumn<Note,String> dateColumn;
    @FXML
    private TableColumn<Note,String> noteColumn;
    
    DataModel dataModel;
    
    public NotesListController(){
        
    }
    
    
    @FXML
    private void initialize() {
        dateColumn.setCellValueFactory((TableColumn.CellDataFeatures<Note, String> cellData) -> cellData.getValue().dateProperty());
        noteColumn.setCellValueFactory((TableColumn.CellDataFeatures<Note, String> cellData) -> cellData.getValue().noteProperty());
        
    }    
    
    public void setDataModel(DataModel dataModel){
        this.dataModel = dataModel;

        tableView.setItems(dataModel.getNoteData());
    }
    
}
