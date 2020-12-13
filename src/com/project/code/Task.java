/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.code;

/**
 *
 * @author Joy
 */
public class Task {
    
    /**
     * @param args the command line arguments
     */
    private  String taskName;
    private  String description;
    private String time;

    public Task(String taskName, String description, String time) {
        this.taskName = taskName;
        this.description = description;
        this.time = time;
    }

    Task() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }  
    
}
