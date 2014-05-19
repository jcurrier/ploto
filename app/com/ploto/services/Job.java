package com.ploto.services;

/**
 * Created by jeff on 5/18/14.
 */
public class Job {
    private Integer mId;
    private String mTitle;
    private String mDescription;
    private String mLocation;

    public Integer getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getLocation() {
        return mLocation;
    }

    public Job() {

    }

    public Job(Integer id, String jobTitle, String description, String location) {
        this.mId = id;
        this.mTitle = jobTitle;
        this.mDescription = description;
        this.mLocation = location;
    }
}
