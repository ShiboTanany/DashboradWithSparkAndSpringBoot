package com.lunatech.IMDBDashboard2.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(
        indexes = {
                @Index(columnList = "averageRating", name = "average_rating")
        })
public class TitleRatings {
    @Id
    @GeneratedValue
    private int titleRatingId;
    private String tconst;
    private double averageRating;
    private int numVotes;

    public TitleRatings() {
    }

    public TitleRatings(String tconst, double averageRating, int numVotes) {
        this.averageRating = averageRating;
        this.numVotes = numVotes;
        this.tconst = tconst;
    }

    public int getTitleRatingId() {
        return titleRatingId;
    }

    public void setTitleRatingId(int id) {
        this.titleRatingId = id;
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String toconst) {
        this.tconst = toconst;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleRatings that = (TitleRatings) o;
        return titleRatingId == that.titleRatingId &&
                Double.compare(that.averageRating, averageRating) == 0 &&
                numVotes == that.numVotes &&
                tconst.equals(that.tconst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleRatingId, tconst, averageRating, numVotes);
    }

    @Override
    public String toString() {
        return "TitleRatings{" +
                "id=" + titleRatingId +
                ", tconst='" + tconst + '\'' +
                ", averageRating=" + averageRating +
                ", numVotes=" + numVotes +
                '}';
    }
}
