package com.lunatech.IMDBDashboard2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class TitleBasics {

    @Id
    @GeneratedValue
    private Integer id;
    private String tconst;
    private String titleType;
    private String primaryTitle;
    private String originalTitle;
    private boolean isAdult;
    private String startYear;
    private String endYear;
    private int runtimeMinutes;
    private String genres;

    public TitleBasics() {
    }

    public TitleBasics(String tconst, String titleType,
                       String primaryTitle, String originalTitle, boolean isAdult,
                       String startYear, String endYear, int runtimeMinutes, String genres) {
        this.tconst = tconst;
        this.titleType = titleType;
        this.primaryTitle = primaryTitle;
        this.originalTitle = originalTitle;
        this.isAdult = isAdult;
        this.startYear = startYear;
        this.endYear = endYear;
        this.runtimeMinutes = runtimeMinutes;
        this.genres = genres;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleBasics that = (TitleBasics) o;
        return isAdult == that.isAdult &&
                runtimeMinutes == that.runtimeMinutes &&
                id.equals(that.id) &&
                tconst.equals(that.tconst) &&
                titleType.equals(that.titleType) &&
                primaryTitle.equals(that.primaryTitle) &&
                originalTitle.equals(that.originalTitle) &&
                startYear.equals(that.startYear) &&
                endYear.equals(that.endYear) &&
                genres.equals(that.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tconst, titleType, primaryTitle, originalTitle, isAdult, startYear, endYear, runtimeMinutes, genres);
    }

    @Override
    public String toString() {
        return "TitleBasics{" +
                "id=" + id +
                ", tconst='" + tconst + '\'' +
                ", titleType='" + titleType + '\'' +
                ", primaryTitle='" + primaryTitle + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", isAdult=" + isAdult +
                ", startYear='" + startYear + '\'' +
                ", endYear='" + endYear + '\'' +
                ", runtimeMinutes=" + runtimeMinutes +
                ", genres='" + genres + '\'' +
                '}';
    }
}
