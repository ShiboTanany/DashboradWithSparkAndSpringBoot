/*
package com.lunatech.IMDBDashboard.utils.fileReader;


import com.lunatech.IMDBDashboard.entities.BasicsAkas;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@Component
public class TitleCrewExcelReader implements FileReader<BasicsAkas> {


    @Override
    public List<BasicsAkas> readValuesFromFile(File file) {
        try (FileInputStream inputStream = new FileInputStream(file);
             Scanner sc = new Scanner(inputStream, "UTF-8")) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
*/
