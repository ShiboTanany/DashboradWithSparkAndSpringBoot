package com.lunatech.IMDBDashboard2.services;


import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TitleRatingService {

  /*  public List<MostReviewed> getRatedFilmsWithGenre(@PathVariable String genre) {
        Dataset<Row> data = dataFrameForTitleBasics
                .select("genres", "tconst", "primaryTitle", "originalTitle")
                .where(functions.col("genres").contains(genre));
        Iterator<Row> dataOutput = dataFrameForTitleRating
                .join(data, data.col("tconst")
                        .equalTo(dataFrameForTitleRating.col("tconst")))
                .select("averageRating", "numVotes", "primaryTitle", "originalTitle", "genres")
                .orderBy(functions.desc("averageRating"))
                .toLocalIterator();
        List<MostReviewed> mostReviewedList = new ArrayList<>();
        dataOutput.forEachRemaining(row -> {
            mostReviewedList.add(new MostReviewed(
                    row.getDouble(0), row.getInt(1), row.getString(2)
                    , row.getString(3), row.getString(4)));
        });
        return mostReviewedList;
    }

*/
}
