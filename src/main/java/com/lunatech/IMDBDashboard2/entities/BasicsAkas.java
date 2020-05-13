package com.lunatech.IMDBDashboard2.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class BasicsAkas {

    @Id
    @GeneratedValue
    private Integer id;
    private String titleId;//(string) - a tconst, an alphanumeric unique identifier of the title
    private Integer ordering;//(integer) – a number to uniquely identify rows for a given titleId
    @Column(columnDefinition = "text")
    private String title;//(string) – the localized title
    private String region; //(string) - the region for this version of the title
    private String language;//(string) - the language of the title
    private String types;// (array) - Enumerated set of attributes for this alternative title. One or more of the following: "alternative", "dvd", "festival", "tv", "video", "working", "original", "imdbDisplay". New values may be added in the future without warning
    private String attributes;//(array) - Additional terms to describe this alternative title, not enumerated
    private boolean isOriginalTitle;// (boolean) – 0: not original title; 1: original title

    public BasicsAkas() {
    }

    public BasicsAkas(String titleId, Integer ordering, String title,
                      String region, String language, String types, String attributes,
                      boolean isOriginalTitle) {
        this.titleId = titleId;
        this.ordering = ordering;
        this.title = title;
        this.region = region;
        this.language = language;
        this.types = types;
        this.attributes = attributes;
        this.isOriginalTitle = isOriginalTitle;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public boolean isOriginalTitle() {
        return isOriginalTitle;
    }

    public void setOriginalTitle(boolean originalTitle) {
        isOriginalTitle = originalTitle;
    }

    @Override
    public String toString() {
        return "BasicsAkas{" +
                "titleId='" + titleId + '\'' +
                ", ordering=" + ordering +
                ", title='" + title + '\'' +
                ", region='" + region + '\'' +
                ", language='" + language + '\'' +
                ", types=" + types +
                ", attributes=" + attributes +
                ", isOriginalTitle=" + isOriginalTitle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicsAkas akas = (BasicsAkas) o;
        return isOriginalTitle == akas.isOriginalTitle &&
                Objects.equals(titleId, akas.titleId) &&
                Objects.equals(ordering, akas.ordering) &&
                Objects.equals(title, akas.title) &&
                Objects.equals(region, akas.region) &&
                Objects.equals(language, akas.language) &&
                Objects.equals(types, akas.types) &&
                Objects.equals(attributes, akas.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleId, ordering, title, region, language, types, attributes, isOriginalTitle);
    }
}

