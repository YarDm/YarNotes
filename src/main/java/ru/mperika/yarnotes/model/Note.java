/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mperika.yarnotes.model;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Y. Dmitriv <y.o.dmitriv@gmail.com>
 */
public class Note {
    private SimpleStringProperty date;
    private SimpleStringProperty note;

    public Note() {
        this(null, null);
    }
    
    /**Конструктор хранящий данные для отображения в таблице, используется в 
    контроллер
     * @param date
     * @param note
     */
    public Note(LocalDate date, String note){
        this.date = new SimpleStringProperty(date.toString());
        this.note = new SimpleStringProperty(note);
    }
    
    public void setNote(String nt){
        note.set(nt);
    }
    
    public String getNote(){
        return note.get();
    }
    
    public StringProperty noteProperty(){
        return note;
    }
    
    public void setDate(LocalDate ldate){
        date.set(ldate.now().toString());
    }
    
    public String getDate(){
        return date.get();
    }
    
    public StringProperty dateProperty(){
        return date;
    }
}
