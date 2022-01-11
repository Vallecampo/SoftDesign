/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package StudentList;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] s1=new Student[3];//declare student object array
        Scanner input=new Scanner(System.in);
        
        for(int i=0; i<s1.length;i++)
        {
            s1[i]=new Student();
            System.out.println("Enter Student name: ");
            s1[i].setName(input.nextLine());
        }
  
        for(int i=0; i<s1.length;i++)
        {
            System.out.println("Student name: "+ s1[i].getName());
        }
        
        
    }

}
