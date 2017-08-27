package com.kalenicz.maciej.explorerapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("vote_average")
    private Double voteAverage;

    @SerializedName("production_countries")
    private List<ProductionCountry> productionCountries;

    public Movie(String posterPath, boolean adult, String title, String overview, String releaseDate, Double voteAverage, List<ProductionCountry> productionCountries) {
        this.posterPath = posterPath;
        this.adult = adult;
        this.title = title;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.voteAverage = voteAverage;
        this.productionCountries = productionCountries;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public List<ProductionCountry> getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(List<ProductionCountry> productionCountries) {
        this.productionCountries = productionCountries;
    }
}
