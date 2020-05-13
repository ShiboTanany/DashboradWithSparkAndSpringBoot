package com.lunatech.IMDBDashboard2.repositories;

import com.lunatech.IMDBDashboard2.entities.TitleRatings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRatingsRepo extends JpaRepository<TitleRatings, Integer> {


}
