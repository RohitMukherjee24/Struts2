package org.rohit.service;

/**
 * Created by rohit on 1/24/2017.
 */
public class TutorialFinderService {
    private String language;

    public String getBestTutorialSite(String language){
        this.language = language;
        if(language.equals("java")) {
            return "Java Brains";
        }
        else
            return "language Not Supported";
    }

}
