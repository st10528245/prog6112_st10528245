/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seriesmodel;

/**
 *
 * @author Student
 */import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    private ArrayList<SeriesModel> seriesList;
    private Scanner scanner;

    public Series() {
        seriesList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Captures a new series from the user
    public void CaptureSeries() {
        System.out.println("\nCAPTURE A NEW SERIES");
        System.out.print("Enter the series id: ");
        String id = scanner.nextLine();
        System.out.print("Enter the series name: ");
        String name = scanner.nextLine();

        String age;
        while (true) {
            System.out.print("Enter the series age restriction: ");
            age = scanner.nextLine();
            if (SeriesAgeRestriction(age)) {
                break;
            }
            System.out.println("You have entered a incorrect series age !!!");
            System.out.println("Please re-enter the series age >>");
        }

        System.out.print("Enter the number of episodes for " + name + ": ");
        String episodes = scanner.nextLine();

        SeriesModel newSeries = new SeriesModel(id, name, age, episodes);
        seriesList.add(newSeries);
        System.out.println("Series processed successfully!!!");
    }

    // Searches for a series using the series ID
    public SeriesModel SearchSeries(String id) {
        for (SeriesModel series : seriesList) {
            if (series.getSeriesId().equalsIgnoreCase(id)) {
                return series;
            }
        }
        return null;
    }

    // Updates an existing series using values supplied by the caller
    public boolean UpdateSeries(String id, String name, String age, String episodes) {
        SeriesModel series = SearchSeries(id);
        if (series == null) {
            return false;
        }
        series.setSeriesName(name);
        series.setSeriesAge(age);
        series.setSeriesNumberOfEpisodes(episodes);
        return true;
    }

    // Deletes a series after confirmation
    public boolean DeleteSeries(String id, boolean confirm) {
        SeriesModel series = SearchSeries(id);
        if (series == null || !confirm) {
            return false;
        }
        seriesList.remove(series);
        return true;
    }

    // Checks whether the age restriction is between 2 and 18
    public boolean SeriesAgeRestriction(String age) {
        try {
            int ageNumber = Integer.parseInt(age);
            return ageNumber >= 2 && ageNumber <= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Prints all series stored in memory
    public void SeriesReport() {
        if (seriesList.isEmpty()) {
            System.out.println("No series data could be found.");
            return;
        }
        int number = 1;
        for (SeriesModel series : seriesList) {
            System.out.println("\nSeries " + number);
            System.out.println("SERIES ID: " + series.getSeriesId());
            System.out.println("SERIES NAME: " + series.getSeriesName());
            System.out.println("SERIES AGE RESTRICTION: " + series.getSeriesAge());
            System.out.println("NUMBER OF EPISODES: " + series.getSeriesNumberOfEpisodes());
            number++;
        }
    }

    // Allows the application to be closed
    public void ExitSeriesApplication() {
        System.out.println("Thank you for using the Latest Series Application.");
    }

    // Additional method used to add test data
    public void AddSeries(SeriesModel series) {
        seriesList.add(series);
    }
}

    

