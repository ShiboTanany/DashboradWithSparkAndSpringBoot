package com.lunatech.IMDBDashboard2.services;

import com.lunatech.IMDBDashboard2.utils.ApplicationPropertiesReader;
import com.lunatech.IMDBDashboard2.utils.fileReader.TitleRatingExcelReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class DataBaseInitializer {

    private final static String TITLEPRINCIPAL = "title.principals.tsv";
    private final static String TITLERATINGS = "title.ratings.tsv";
    private final static String TITLECREW = "title.crew.tsv";
    private final static String TITLEAKKAS = "title.akas.tsv";
    private final static String TITLEEPISODE = "title.episode.tsv";

    @Autowired
    private ApplicationPropertiesReader applicationPropertiesReader;

    /*@Autowired
    private TitleAkasExcelReader titleAkasExcelReader;

    @Autowired
    private TitlePrinicipalExcelReader titlePrinicipalExcelReader;
*/
    @Autowired
    private TitleRatingExcelReader titleRatingExcelReader;
/*
    @Autowired
    private TitleCrewExcelReader titleCrewExcelReader;

    @Autowired
    private TitleEpisodeExcelReader titleEpisodeExcelReader;*/


    public List execute() {
        String parentFolder = applicationPropertiesReader.getIdmFilesPath();
        Long startTime = System.currentTimeMillis();
      /*new Thread(() -> {
            titleAkasExcelReader.readValuesFromFile(new File(parentFolder + "/" + TITLEAKKAS));
        }).start();*//*
        new Thread(() -> {
            titlePrinicipalExcelReader.readValuesFromFile(new File(parentFolder + "/" + TITLEPRINCIPAL));
        }).start();*/
        new Thread(() -> {
            titleRatingExcelReader.getTitleRating("Horror");
        }).start();/*
        new Thread(() -> {
            titleCrewExcelReader.readValuesFromFile(new File(parentFolder + "/" + TITLECREW));
        }).start();
        new Thread(() -> {
            titleEpisodeExcelReader.readValuesFromFile(new File(parentFolder + "/" + TITLEEPISODE));
        }).start();*/
        System.out.println(((System.currentTimeMillis()) - startTime) / 1000);
        return null;

    }

}
