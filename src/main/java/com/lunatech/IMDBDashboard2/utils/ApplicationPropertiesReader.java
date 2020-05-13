package com.lunatech.IMDBDashboard2.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.imdb")
public class ApplicationPropertiesReader {

    private String idmFilesPath;

    public String getIdmFilesPath() {
        return idmFilesPath;
    }

    public void setIdmFilesPath(String idmFilesPath) {
        this.idmFilesPath = idmFilesPath;
    }
}
