
package com.lunatech.IMDBDashboard2.utils.fileReader;


import com.lunatech.IMDBDashboard2.dtos.MostReviewed;
import com.lunatech.IMDBDashboard2.entities.BasicsAkas;
import com.lunatech.IMDBDashboard2.entities.TitleBasics;
import com.lunatech.IMDBDashboard2.entities.TitleRatings;
import com.lunatech.IMDBDashboard2.utils.ApplicationPropertiesReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class TitleRatingExcelReader {

    @Autowired
    private ApplicationPropertiesReader applicationPropertiesReader;

    private final static String TITLERATINGS = "title.ratings.tsv";
    private final static String TITLEBASICS = "title.basics.tsv";

    public List<BasicsAkas> getTitleRating(String genre) {
        String parentFolder = applicationPropertiesReader.getIdmFilesPath();
        List<TitleRatings> titleRatingsList = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        try (Stream<String> titleRatingStream =
                     Files.lines(new File(parentFolder + "/" + TITLERATINGS).toPath());
             Stream<String> titleBasicsStream =
                     Files.lines(new File(parentFolder + "/" + TITLEBASICS).toPath())) {


            List<TitleBasics> listOfTitleBasics = titleBasicsStream
                    .parallel()
                    .filter(element -> element.contains(genre))
                    .map(element -> {
                        TitleBasics titleBasics = new TitleBasics();
                        titleBasics.setTconst(element.split("\t")[0]);
                        titleBasics.setPrimaryTitle(element.split("\t")[2]);
                        return titleBasics;
                    })
                    .collect(Collectors.toList());

            titleRatingsList = titleRatingStream
                    .parallel()
                    .map(element -> {
                        try {

                            return new TitleRatings(element.split("\t")[0],
                                    Double.parseDouble(element.split("\t")[1]),
                                    Integer.parseInt(element.split("\t")[2]));
                        } catch (NumberFormatException ex) {
                            return new TitleRatings();
                        }
                    })
                    .sorted((titleRating1, titleRatingg2) ->
                            titleRatingg2.getAverageRating().compareTo(titleRating1.getAverageRating()))
                    .collect(Collectors.toList());
            List<MostReviewed> mostRevieweds = new ArrayList<>();
            titleRatingsList.parallelStream().forEach(
                    titleRatings -> {
                        listOfTitleBasics.parallelStream().forEach(titleBasics -> {
                            if (titleBasics.getTconst().equals(titleRatings.getTconst())) {
                                System.out.println(titleRatings.getAverageRating() + " "
                                        + " " + titleRatings.getNumVotes() + " " + titleBasics.getPrimaryTitle() + " " + titleBasics.getOriginalTitle() + " " + titleBasics.getGenres());

                            }
                        });
                    }
            );
            mostRevieweds.forEach(System.out::println);
            System.out.println("kskjs");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        System.out.println("time is " + (System.currentTimeMillis() - startTime) / 1000);
        return null;
    }


}

