/*
package com.lunatech.IMDBDashboard.utils.fileReader;

import com.lunatech.IMDBDashboard.entities.BasicsAkas;
import com.lunatech.IMDBDashboard.repositories.BasicAkasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Component
public class TitleAkasExcelReader implements FileReader<BasicsAkas> {

    @Autowired
    private BasicAkasRepository basicsAkasRepository;

    @Override
    public List<BasicsAkas> readValuesFromFile(File file) {
        List<BasicsAkas> listOfAkas = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream(file);
             Scanner sc = new Scanner(inputStream, "UTF-8")) {
             sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] arrayOfValues = line.split("\t");
                */
/*BasicsAkas basicsAkas = new BasicsAkas(arrayOfValues[0],
                        Integer.parseInt(arrayOfValues[1]), arrayOfValues[2], arrayOfValues[3],
                        arrayOfValues[4], arrayOfValues[5], arrayOfValues[6], arrayOfValues[7].equals("") ? true : false);

                basicsAkasRepository.save(basicsAkas);
                System.out.println("added");*//*

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfAkas;
    }
}
*/
