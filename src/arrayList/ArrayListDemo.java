package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<String>();
        ArrayList<Employee> myEmployeeList = new ArrayList<Employee>();
        int numOfValues = 0;
        int numOfEmployees = 0;
        boolean doneYet = false;

        while (doneYet != true){
            System.out.println("Input entry: ");
            myList.add(keyboard.nextLine());
            System.out.println("More items? (y/n)");
            numOfValues++;

            if ( keyboard.nextLine().equalsIgnoreCase("n")){
                doneYet = true;
            }
        }

        //Displays
        System.out.println("\nThe list contains:");
        for (String entry : myList) {
            System.out.println(entry);
        }

        //search
        System.out.println("\nAn item to search: ");
        String answer = keyboard.nextLine();
        if (myList.contains(answer)) {
            System.out.printf("%s is in the list%n", answer);
        }
        else {
            System.out.printf("%s is not in the list%n", answer);
            }

        //remove
        System.out.print("An item to remove: ");
        answer = keyboard.nextLine( );
        if (myList.remove(answer)) {
            System.out.printf("%s is removed from the list.%n", answer);
        } else {
            System.out.printf("%s was not in the list.%n", answer);
        }

        //Displays my 1st list again after removing an element.
        System.out.println("\nThe list contains:");
        for (String entry : myList) {
            System.out.println(entry);
        }

        System.out.println();


        // We start using the employee class here.
        doneYet = false; // Reset doneYet to false so we can use it again.
        int employeeNumber; // Temporarily hold our number  and name to build an employee constructor with.
        String employeeFirstName;


        while ( !doneYet){
            System.out.println("Input a number: ");
            employeeNumber = keyboard.nextInt();
            keyboard.nextLine(); // Absorb next line.
            System.out.println("Input a name: ");
            employeeFirstName = keyboard.nextLine();

            Employee newEmployee = new Employee(employeeNumber, employeeFirstName );
//            myEmployeeList[numOfEmployees] = new Employee( employeeNumber, employeeFirstName );
            myEmployeeList.add(newEmployee);
            numOfEmployees++;

            System.out.println("More items? (y/n)");


            if ( keyboard.nextLine().equalsIgnoreCase("n")){
                doneYet = true;
            }
        }

        //Displays
        System.out.println("\nThe Employee list contains:");
        for (Employee entry : myEmployeeList) {
            System.out.println(entry);
        }

        //search
        System.out.println("\nType the number and name to search: ");
        System.out.println("Name: ");
        String name = keyboard.nextLine();
        System.out.println("Number: ");
        int number = keyboard.nextInt();
        Employee tempEmployee = new Employee( number, name ); // The purpose of this temp object is to compare it to our employee array list.

        if (myEmployeeList.contains(tempEmployee)) {
            System.out.printf("%s is in the list%n", tempEmployee);
        }
        else {
            System.out.printf("%s is not in the list%n", tempEmployee);
        }

        //remove
        keyboard.nextLine(); // Absorbs nextline after nextint.
        System.out.print("Enter name of account to remove: ");
        employeeFirstName = keyboard.nextLine();
        System.out.print("Enter number of account to remove: ");
        employeeNumber = keyboard.nextInt();
        keyboard.nextLine(); // Absorbs nextline after nextint.
        tempEmployee = new Employee(employeeNumber, employeeFirstName);
        if (myEmployeeList.remove(tempEmployee)) {
            System.out.printf("%s is removed from the list.%n", tempEmployee);
        } else {
            System.out.printf("%s was not in the list.%n", tempEmployee);
        }

        //Displays myEmployeeList again after removing an item.
        System.out.println("\nThe Employee list contains:");
        for (Employee entry : myEmployeeList) {
            System.out.println(entry);
        }
    }
}