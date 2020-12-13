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
public class User {
    private String username;
    private String password;
    private String email;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        show();
    }
    
    public void updateInfo(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
 
    private void show(){
        System.out.println("Welcome "+username);
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmail() {
        return email;
    }
    public String getUserName() {
        return username;
    }
     public String getpassword() {
        return password;
    }
     public void addTask(String taskName, String description, String time){
         Task task = new Task();
         task.setTaskName(taskName);
         task.setDescription(description);
         task.setTime(time);
     }
     public void udpateTask(Task task1){
         task1.getTaskName();
         task1.getDescription();
         task1.getTime();
        boolean equals = task1.equals(this);
     }
    public boolean checkUser(String username, String password){
        if(username.equalsIgnoreCase(this.username) && password.equals(this.password)){
            return true;
        }
        else
            return false;
    }
    public boolean checkPass(String password){
        if(password.equals(this.password)){
            return true;
        }
        else
            return false;
    }
    
}
