package com.company;

import classes.Person;

public class Main {

    public static void main(String[] args) {

        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.setfName("Mark Lester");
        firstPerson.setlName("Canoy");
        firstPerson.setEmail("marklestercanoy@gmail.com");
        firstPerson.setUsername("'marklestercanoy2017");
        firstPerson.setPassword("1234567890");
        firstPerson.setAge(25);

        secondPerson.setfName("Kram Retsel");
        secondPerson.setlName("Yonac");
        secondPerson.setEmail("kramretselyonac@gmail.com");
        secondPerson.setUsername("kramretselyonac2017");
        secondPerson.setPassword("1234");
        secondPerson.setAge(24);


        String fName = firstPerson.getfName();
        System.out.println("First Name = " + fName);

        String lName = firstPerson.getlName();
        System.out.println("Last Name = " + lName);

        System.out.println("Full Name = " + fName + " " + lName);

        String email = firstPerson.getEmail();
        System.out.println("Email: " + email);

        String username = firstPerson.getUsername();
        System.out.println("Username: " + username);

        String password = (firstPerson.getPassword());
        System.out.println("Password : " + password);

        int age = (firstPerson.getAge());
        System.out.println("Age: " + age);


        System.out.println("*************************");

        // Second Users

        String fNameTwo = secondPerson.getfName();
        System.out.println("First Name = " + fNameTwo);

        String lNameTwo = secondPerson.getlName();
        System.out.println("Last Name = " + lNameTwo);

        System.out.println("Full Name = " + fNameTwo + " " + lNameTwo);

        String emailTwo = secondPerson.getEmail();
        System.out.println("Email: " + emailTwo);

        String usernameTwo = secondPerson.getUsername();
        System.out.println("Username: " + usernameTwo);

        String passwordTwo = (secondPerson.getPassword());
        System.out.println("Password : " + passwordTwo);

        int ageTwo = (secondPerson.getAge());
        System.out.println("Age: " + ageTwo);



         /* String c = "This is a String";
        char character = 'T';

        System.out.println("String = " + c);
        System.out.println("Character = " + character);*/
    }
}
