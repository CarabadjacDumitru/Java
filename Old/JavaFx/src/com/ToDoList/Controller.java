package com.ToDoList;

import com.ToDoList.datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private ListView todoListView;

    private List<ToDoItem> todoItems;

    public void initialize(){
        ToDoItem item1 = new ToDoItem("Mail birthDay","Buy a 30th birthday card for John", LocalDate.of(2017, Month.APRIL,25));
        ToDoItem item2 = new ToDoItem("Doctor Appointment","See Dr.Smith at 123 Main street. Bring paperwork", LocalDate.of(2017, Month.MAY,23));
        ToDoItem item3 = new ToDoItem("Finish Design proposal","I promised email webside mockups by Friday 22 ", LocalDate.of(2017, Month.APRIL,22));
        ToDoItem item4 = new ToDoItem("PickUp Doug train","Doug arriving on March 23", LocalDate.of(2017, Month.MARCH,23));
        ToDoItem item5 = new ToDoItem("Pick up dry Cleaning ","The clothes should be ready in wednesday", LocalDate.of(2017, Month.APRIL,20));
        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
    }
    @FXML
    public void onButtonClicked(ActionEvent e){

    }
}
