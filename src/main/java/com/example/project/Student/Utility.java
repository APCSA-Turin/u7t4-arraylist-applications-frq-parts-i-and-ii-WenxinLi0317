package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list)
   {
       list.sort(new Comparator<Student>()
       {
           public int compare(Student one, Student two)
           {
               int lastNameCompare = one.getLastName().compareTo(two.getLastName());


               if (lastNameCompare != 0)
               {
                   return lastNameCompare;
               }
               else
               {
                   int firstNameCompare = one.getFirstName().compareTo(two.getFirstName());


                   if (firstNameCompare != 0)
                   {
                       return firstNameCompare;
                   }


                   return Double.compare(two.getGpa(), one.getGpa());
               }


           }
       });


       return list;
   }


}
