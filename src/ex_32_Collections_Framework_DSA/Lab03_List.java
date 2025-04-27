package ex_32_Collections_Framework_DSA;

import java.util.ArrayList;

public class Lab03_List
{
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Office Work, program practice, Exercise, daily work");
        System.out.println("Daily Routine Task =" +tasks);
        tasks.add("Home Rituals");
        System.out.println("Added new task =" +tasks.add("Home Rituals"));
        tasks.remove("program practice");
        System.out.println("This task is done =" +tasks);
        System.out.println("Total number of task =" +tasks.size());
    }
}
