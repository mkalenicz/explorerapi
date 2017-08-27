package com.kalenicz.maciej.explorerapi;

import com.google.gson.annotations.SerializedName;

/**
 * Created by maciej on 26.08.2017.
 */

public class Movie {


    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("adult")
    private boolean adult;

    @SerializedName("title")
    private String title;


    @SerializedName("overview")
    private String overview;

    public Movie(String posterPath, boolean adult, String title, String overview) {
        this.posterPath = posterPath;
        this.adult = adult;
        this.title = title;
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
