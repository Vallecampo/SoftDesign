/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentlist;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create array of student object and iterate through it and print it
        Student[] studList=new Student[3];
        Scanner input=new Scanner(System.in);
        
        for (int i = 0; i < studList.length; i++) {
            studList[i]=new Student();
            System.out.println("Enter student name: ");
            studList[i].setName(input.nextLine());
        }
        
        for (int i = 0; i < studList.length;i++) {
            System.out.println("student name is: "+studList[i].getName());
        }
    }

}
