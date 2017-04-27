package com.ToDoList.datamodel;


import java.time.LocalDate;

public class ToDoItem {
    private  String shortDescription;
    private String Detail;
    private LocalDate deadLine;

    public ToDoItem(String shortDescription, String detail, LocalDate deadLine) {
        this.shortDescription = shortDescription;
        Detail = detail;
        this.deadLine = deadLine;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }


}
