/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolistapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ToDoListApp {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task){
        tasks.add(task);
    }
    
    public void removeTask(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.remove(index);
        }
        else{
            System.out.println("Invalid index, Task not removed");
        }
    }
    
    public void displayTask(){
        if(tasks.isEmpty()){
            System.out.println("No tasks in the to-do list.");
        }
        else{
            for(int i=0; i<tasks.size();i++){
             System.out.println(i+1+"."+tasks.get(i));   
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ToDoListApp todolist = new ToDoListApp();
        Scanner s = new Scanner(System.in);
        int choice;
        
        System.out.println("-----------*********WELCOME to ToDo List App*********-----------");
        do{
            System.out.println("ToDo List App Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Display tasks");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            
            choice = s.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter task to add:");
                    s.nextLine();
                    String taskToAdd = s.nextLine();
                    todolist.addTask(taskToAdd);
                    break;
                    
                case 2:
                    System.out.println("Enter the index of the task to remove:");
                    int indexToRemove = s.nextInt();
                    todolist.removeTask(indexToRemove-1);
                    break; 
                    
                case 3:
                    todolist.displayTask();
                    break;
                    
                case 4:
                    System.out.println("Exiting the ToDo List App. GoodBye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while(choice!=4);
    } 
}
