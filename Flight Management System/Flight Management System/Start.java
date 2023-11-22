import java.io.*;
import java.util.Scanner;

import Classes.*;
import Fileio.FileReadWrite;

public class Start {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        PersonManagement management = new PersonManagement();
        
        System.out.println("------------------------------------------------");
        System.out.println("Welcome to XYZ Air Service");
        System.out.println("------------------------------------------------");

        boolean repeat = true;
        while(repeat) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Passanger Management");
            System.out.println("2. Crew Management");
            System.out.println("3. Flight Booking");
            System.out.println("4. Flight Booking History");
            System.out.println("5. Exit\n");
            System.out.print("Your choice : ");

            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("------------------------------------------------");
                    System.out.println("Passanger Management");
                    System.out.println("------------------------------------------------");
                    System.out.println("You have the following options:");
                    System.out.println("1. Insert New Passanger");
                    System.out.println("2. Remove Existing Passanger");
                    System.out.println("3. Search an Passanger");
                    System.out.println("4. Show All Passanger");
                    System.out.println("5. Go Back\n");
                    System.out.print("Your choice : ");
                    int choice1 = sc.nextInt();
                    switch(choice1) {
                        case 1:
                            System.out.println("------------------------------------------------");
                            System.out.println("Insert New Passanger");
                            System.out.println("------------------------------------------------");
                            System.out.print("Enter Passanger Name : ");
                            String name1 = bfr.readLine();
                            System.out.print("Enter Passanger NID : ");
                            String ID1 = sc.next();
                            System.out.print("Enter Passanger Contact Number : ");
                            String num1 = sc.next();
                            Passanger p1 = new Passanger(name1, ID1, num1);
                            if(management.insertPassanger(p1)) {
                                System.out.println("Passanger inserted. NID : " + ID1);
                            }else {
                                System.out.println("Passanger not inserted. NID : " + ID1);
                            }
                            break;
                        case 2:
                            System.out.println("------------------------------------------------");
                            System.out.println("Remove New Passanger");
                            System.out.println("------------------------------------------------");
                            System.out.println("Enter Passanger NID to Remove : ");
                            String ID2 = sc.next();
                            if(management.removePassanger(ID2)) {
                                System.out.println("Passanger removed. NID : " + ID2);
                            }else {
                                System.out.println("Passanger not removed. NID : " + ID2);
                            }
                            break;
                        case 3:
                            System.out.println("------------------------------------------------");
                            System.out.println("Search Passanger");
                            System.out.println("------------------------------------------------");
                            System.out.println("Enter Passanger NID to search : ");
                            String ID3 = sc.next();
                            Passanger pp = management.searchPassanger(ID3);
                            if(pp != null) {
                                System.out.println("Passanger found");
                                pp.showDetails();
                            }else {
                                System.out.println("Passanger not found.");
                            }
                            break;
                        case 4:
                            System.out.println("------------------------------------------------");
                            System.out.println("Show All Passangers");
                            System.out.println("------------------------------------------------");
                            management.showAllPassanger();
                            break;
                        case 5: 
                            System.out.println("------------------------------------------------");
                            System.out.println("Go Back");
                            System.out.println("------------------------------------------------");
                            break;
                        default: 
                            System.out.println("------------------------------------------------");
                            System.out.println("invalid");
                            System.out.println("------------------------------------------------");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("Crew Management");
                    System.out.println("------------------------------------------------");
                    System.out.println("You have the following options:");
                    System.out.println("1. Insert New Crew");
                    System.out.println("2. Remove Existing Crew");
                    System.out.println("3. Search an Crew");
                    System.out.println("4. Show All Crew");
                    System.out.println("5. Go Back\n");
                    System.out.print("Your choice : ");
                    int choice2 = sc.nextInt();
                    switch(choice2) {
                        case 1:
                            System.out.println("------------------------------------------------");
                            System.out.println("Insert New Crew");
                            System.out.println("------------------------------------------------");
                            System.out.print("Enter Crew Name : ");
                            String cname1 = bfr.readLine();
                            System.out.print("Enter Crew NID : ");
                            String cID1 = sc.next();
                            System.out.print("Enter Crew Contact Number : ");
                            String cnum1 = sc.next();
                            Crew p1 = new Crew(cname1, cID1, cnum1);
                            if(management.insertCrew(p1)) {
                                System.out.println("Crew inserted. NID : " + cID1);
                            }else {
                                System.out.println("Crew not inserted. NID : " + cID1);
                            }
                            break;
                        case 2:
                            System.out.println("------------------------------------------------");
                            System.out.println("Remove New Crew");
                            System.out.println("------------------------------------------------");
                            System.out.println("Enter Crew NID to Remove : ");
                            String cID2 = sc.next();
                            if(management.removeCrew(cID2)) {
                                System.out.println("Crew removed. NID : " + cID2);
                            }else {
                                System.out.println("Crew not removed. NID : " + cID2);
                            }
                            break;
                        case 3:
                            System.out.println("------------------------------------------------");
                            System.out.println("Search Crew");
                            System.out.println("------------------------------------------------");
                            System.out.println("Enter Crew NID to search : ");
                            String cID3 = sc.next();
                            Crew pp = management.searchCrew(cID3);
                            if(pp != null) {
                                System.out.println("Crew found");
                                pp.showDetails();
                            }else {
                                System.out.println("Crew not found.");
                            }
                            break;
                        case 4:
                            System.out.println("------------------------------------------------");
                            System.out.println("Show All Crew");
                            System.out.println("------------------------------------------------");
                            management.showAllCrews();
                            break;
                        case 5: 
                            System.out.println("------------------------------------------------");
                            System.out.println("Go Back");
                            System.out.println("------------------------------------------------");
                            break;
                        default: 
                            System.out.println("------------------------------------------------");
                            System.out.println("invalid");
                            System.out.println("------------------------------------------------");
                            break;
                    }
                    break;
                case 3: 
                    System.out.println("------------------------------------------------");
                    System.out.println("Flight Booking");
                    System.out.println("------------------------------------------------");
                    FlightManagement flight = new FlightManagement();
                    System.out.println("Enter Passanger ID : "); 
                    String pid2 = sc.next();
                    Passanger p2 = management.searchPassanger(pid2);
                    if(p2 != null){
                        flight.showAllFlights();
                        FileReadWrite file = new FileReadWrite();
                        file.writeInFile("Passanger ID : " + pid2);
                        System.out.println("\nYour Choice : ");
                        int choice3 = sc.nextInt();
                        if(choice3 >= 1 && choice3 <= 4) {
                            switch(choice3){
                                case 1: 
                                    p2.setTicket("Flight No 767");
                                    file.writeInFile("Flight No 767");
                                    break;
                                case 2:
                                    p2.setTicket("Flight No 896");
                                    file.writeInFile("Flight No 896");
                                    break;
                                case 3:
                                    p2.setTicket("Flight No 324");
                                    file.writeInFile("Flight No 324");
                                    break;
                                case 4:
                                    p2.setTicket("Flight No 999");
                                    file.writeInFile("Flight No 999");
                                    break;
                            }
                            System.out.println("Flight Booked");
                        }else {
                            System.out.println("Invalid");
                        }
                    }else {
                        System.out.println("Passanger not found!");
                    }
                    break;
                case 4:
                    System.out.println("------------------------------------------------");
                    System.out.println("Flight Booking History");
                    System.out.println("------------------------------------------------");
                    FileReadWrite f = new FileReadWrite();
                    f.readFromFile();
                    break;
                case 5:
                    System.out.println("------------------------------------------------");
                    System.out.println("Exit");
                    System.out.println("------------------------------------------------");
                    repeat = false;
                    break;
                default:
                    System.out.println("------------------------------------------------");
                    System.out.println("invalid");
                    System.out.println("------------------------------------------------");
                    break;
            }
        }
    }
}