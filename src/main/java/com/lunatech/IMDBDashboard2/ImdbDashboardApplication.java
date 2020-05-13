package com.lunatech.IMDBDashboard2;

import com.lunatech.IMDBDashboard2.services.DataBaseInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImdbDashboardApplication implements CommandLineRunner {
    @Autowired
    private DataBaseInitializer dataBaseInitializer;

    public static void main(String[] args) {
        SpringApplication.run(ImdbDashboardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dataBaseInitializer.execute();
    }


}
