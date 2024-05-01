import com.sun.source.util.TaskEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

// Joleyne Hernandez 04/02/24 CSCI 1660
public class Main {
    public static ArrayList<Tasks> myTask = new ArrayList<>();


    public static void newTask(Scanner input) {

        try {
            System.out.println("What's the name of the task");
            String taskName = input.nextLine();

            System.out.println("What's the task description?");
            String getDescription = input.nextLine();

            System.out.println("What's the priority value for this task?");
            int taskPrior = input.nextInt();
            input.nextLine();

            Tasks theNewTasks = new Tasks(taskName, getDescription, taskPrior);
            myTask.add(theNewTasks);
        } catch (NumberFormatException e) {
            System.out.println("Error! Enter an actual number");

        }
    }

    public static void reMove(Scanner input) {
        try {
            System.out.println(myTask);
            System.out.println("What Task would you like to remove? 0 - " + myTask.size());
            int taskToList = input.nextInt();
            input.nextLine();
            myTask.remove(taskToList);
            System.out.println("Your List " + myTask);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error, Please try again");
        }
    }

    public static void upDate(Scanner input) {
        try {
            System.out.println("What Task would you like to update? Starting from 0");
            System.out.println(myTask);
            String reMoveTask = input.nextLine();
            myTask.remove(Integer.parseInt(reMoveTask));
            System.out.println("What's the name of the task");
            String taskName = input.nextLine();

            System.out.println("What's the task description?");
            String getDescription = input.nextLine();

            System.out.println("What's the priority value for this task?");
            int taskPrior = input.nextInt();

            input.nextLine();
            Tasks newTask = new Tasks(taskName, getDescription, taskPrior);
            myTask.add(newTask);
        }catch (NumberFormatException e){
            System.out.println("Error");
        }


    }

    public static void list(Scanner input) {
        System.out.println("What task would you like to view?" +
                "\n(0)All tasks" +
                "\n(1)Tasks with a priority of 1" +
                "\n(2)Tasks with a priority of 2" +
                "\n(3)Tasks with a priority of 3" +
                "\n(4)Tasks with a priority of 4" +
                "\n(5)Tasks with a priority of 5");
        int prior = input.nextInt();
        input.nextLine();
        switch (prior) {
            case 0:
                System.out.println("Here are all the Task");
                Collections.sort(myTask);
                for(Tasks a: myTask){
                    System.out.println(a);
                }
                break;
            case 1:
                System.out.println("Here are all the Task with priority of 1");
                for (Tasks tasks : myTask) {
                    if (tasks.getPriority() == prior) {
                        int i = myTask.indexOf(tasks);
                        System.out.println("Task Name: " + myTask.get(i).getName() +
                                "\n Description: " + myTask.get(i).getDescription() +
                                "\n Priority: " + myTask.get(i).getPriority() + "\n");
                    }
                }
                break;
            case 2:
                System.out.println("Here are all the Task with priority of 2");
                for (Tasks tasks : myTask) {
                    if (tasks.getPriority() == prior) {
                        int i = myTask.indexOf(tasks);
                        System.out.println("Task Name: " + myTask.get(i).getName() +
                                "\n Description: " + myTask.get(i).getDescription() +
                                "\n Priority: " + myTask.get(i).getPriority() + "\n");
                    }
                }
                break;
            case 3:
                System.out.println("Here are all the Task with priority of 3");
                for (Tasks tasks : myTask) {
                    if (tasks.getPriority() == prior) {
                        int i = myTask.indexOf(tasks);
                        System.out.println("Task Name: " + myTask.get(i).getName() +
                                "\n Description: " + myTask.get(i).getDescription() +
                                "\n Priority: " + myTask.get(i).getPriority() + "\n");
                    }
                }
                break;
            case 4:
                System.out.println("Here are all the Task with priority of 4");
                for (Tasks tasks : myTask) {
                    if (tasks.getPriority() == prior) {
                        int i = myTask.indexOf(tasks);
                        System.out.println("Task Name: " + myTask.get(i).getName() +
                                "\n Description: " + myTask.get(i).getDescription() +
                                "\n Priority: " + myTask.get(i).getPriority() + "\n");
                    }
                }
                break;
            case 5:
                System.out.println("Here are all the Task with priority of 5");
                for (Tasks tasks : myTask) {
                    if (tasks.getPriority() == prior) {
                        int i = myTask.indexOf(tasks);
                        System.out.println("Task Name: " + myTask.get(i).getName() +
                                "\n Description: " + myTask.get(i).getDescription() +
                                "\n Priority: " + myTask.get(i).getPriority() + "\n");
                    }
                }
                break;

            default:
                System.out.println("Please enter an actual option");
                break;
        }


    }

    public static String choices(Scanner input) {
        System.out.println("(1) Add a Task");
        System.out.println("(2) Remove a Task");
        System.out.println("(3) Update a Task");
        System.out.println("(4) List all Tasks");
        System.out.println("(0) Exit");
        System.out.println("What option would you like to choose?");


        String choice = input.nextLine();
        return choice;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String choice = choices(input);
            while (!(choice.equals("0"))) {
                if (choice.equals("1")) {
                    newTask(input);
                    choice = choices(input);
                } else if (choice.equals("2")) {
                    reMove(input);
                    choice = choices(input);
                } else if (choice.equals("3")) {
                    upDate(input);
                    choice = choices(input);
                } else if (choice.equals("4")) {
                    list(input);
                    choice = choices(input);
                } else {
                    System.out.println("Please enter an actual option");
                    choice = choices(input);
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
        }
    }
}