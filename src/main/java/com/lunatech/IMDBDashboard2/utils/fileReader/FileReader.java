package com.lunatech.IMDBDashboard2.utils.fileReader;



import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FileReader<T> {

    List<T> readValuesFromFile(File file);

    default void initPIO(File file) throws IOException {


    }

}
