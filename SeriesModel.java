/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seriesmodel;

/**
 *
 * @author Student
 */
public class SeriesModel {

    private String SeriesId;
    private String SeriesName;
    private String SeriesAge;
    private String SeriesNumberOfEpisodes;

    public SeriesModel(String SeriesId, String SeriesName,
                       String SeriesAge, String SeriesNumberOfEpisodes) {

        this.SeriesId = SeriesId;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }

    public String getSeriesId() {
        return SeriesId;
    }

    public void setSeriesId(String SeriesId) {
        this.SeriesId = SeriesId;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public void setSeriesName(String SeriesName) {
        this.SeriesName = SeriesName;
    }

    public String getSeriesAge() {
        return SeriesAge;
    }

    public void setSeriesAge(String SeriesAge) {
        this.SeriesAge = SeriesAge;
    }

    public String getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }

    public void setSeriesNumberOfEpisodes(String SeriesNumberOfEpisodes) {
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }

    @Override
    public String toString() {

        return "SERIES ID: " + SeriesId
                + "\nSERIES NAME: " + SeriesName
                + "\nSERIES AGE RESTRICTION: " + SeriesAge
                + "\nSERIES NUMBER OF EPISODES: "
                + SeriesNumberOfEpisodes;
    }
}
