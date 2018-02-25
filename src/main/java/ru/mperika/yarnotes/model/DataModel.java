/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mperika.yarnotes.model;

import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Y. Dmitriv <y.o.dmitriv@gmail.com>
 */
public class DataModel {
     private final ObservableList<Note> noteData = 
             FXCollections.observableArrayList();
    
    public ObservableList<Note> getNoteData() {
        return this.noteData;
    }
    
    public DataModel(){
        noteData.add(new Note(LocalDate.now(), "Hello, how are you?"));
        noteData.add(new Note(LocalDate.now(), "Fuck off muderfucker!"));
        noteData.add(new Note(LocalDate.now(), "FUUUUUUUUUUCK!"));
    }
}
