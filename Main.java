/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.seriesmodel;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Series series = new Series();
            
            boolean applicationRunning = true;
            
            System.out.println("LATEST SERIES - 2025");
            
            while (applicationRunning) {
                
                System.out.println(
                        "Enter (1) to launch menu or any other key to exit");
                
                String launch = scanner.nextLine();
                
                if (!launch.equals("1")) {
                    break;
                }
                
                System.out.println(
                        "\nPlease select one of the following menu items:");
                
                System.out.println("(1) Capture a new series.");
                System.out.println("(2) Search for a series.");
                System.out.println("(3) Update series age restriction");
                System.out.println("(4) Delete a series.");
                System.out.println("(5) Print series report - 2025");
                System.out.println("(6) Exit Application.");
                
                String choice = scanner.nextLine();
                
                switch (choice) {
                    
                    case "1" -> series.CaptureSeries();
                    
                    case "2" -> {
                        System.out.print(
                                "Enter the series id to search: ");
                        
                        String searchId = scanner.nextLine();
                        
                        SeriesModel foundSeries =
                                (SeriesModel) series.SearchSeries(searchId);
                        
                        if (foundSeries != null) {
                            
                            System.out.println(
                                    "SERIES ID: "
                                            + foundSeries.getSeriesId());
                            
                            System.out.println(
                                    "SERIES NAME: "
                                            + foundSeries.getSeriesName());
                            
                            System.out.println(
                                    "SERIES AGE RESTRICTION: "
                                            + foundSeries.getSeriesAge());
                            
                            System.out.println(
                                    "SERIES NUMBER OF EPISODES: "
                                            + foundSeries
                                                    .getSeriesNumberOfEpisodes());
                            
                        } else {
                            
                            System.out.println(
                                    "Series with Series Id: "
                                            + searchId
                                            + " was not found!");
                        }
                    }
                    
                    case "3" -> {
                        System.out.print("Enter the series id to update: ");
                        String updateId = scanner.nextLine();
                        if (series.SearchSeries(updateId) == null) {
                            System.out.println("Series with Series Id: " + updateId + " was not found!");
                            break;
                        }
                        System.out.print("Enter the series name: ");
                        String updateName = scanner.nextLine();
                        String updateAge;
                        while (true) {
                            System.out.print("Enter the age restriction: ");
                            updateAge = scanner.nextLine();
                            if (series.SeriesAgeRestriction(updateAge)) break;
                            System.out.println("You have entered a incorrect series age !!!");
                            System.out.println("Please re-enter the series age >>");
                        }
                        System.out.print("Enter the number of episodes: ");
                        String updateEpisodes = scanner.nextLine();
                        series.UpdateSeries(updateId, updateName, updateAge, updateEpisodes);
                        System.out.println("Series updated successfully.");
                    }
                    
                    case "4" ->     {
                        System.out.print("Enter the series id to delete: ");
                        String deleteId = scanner.nextLine();
                        if (series.SearchSeries(deleteId) == null) {
                            System.out.println("Series with Series Id: " + deleteId + " was not found!");
                            break;
                        }
                        System.out.print("Are you sure you want to delete series " + deleteId + " from the system? Yes (y) to delete.\n");
                        boolean confirmDelete = scanner.nextLine().equalsIgnoreCase("y");
                        if (series.DeleteSeries(deleteId, confirmDelete)) {
                            System.out.println("Series with Series Id: " + deleteId + " WAS deleted!");
                        } else {
                            System.out.println("Deletion cancelled.");
                        }           }
                    
                    case "5" -> series.SeriesReport();
                    
                    case "6" -> {
                        series.ExitSeriesApplication();
                        
                        applicationRunning = false;
                    }
                    
                    default -> System.out.println(
                            "Invalid menu option. Please try again.");
                }
            }
        }
    }
}

