package com.ploto.services;

import org.springframework.format.datetime.joda.DateTimeFormatterFactoryBean;

import java.util.Date;

/**
 * Created by jeff on 5/18/14.
 */
public class Position {
    private String mId;
    private String mTitle;
    private String mDescription;
    private String mLocation;
    private short mStatus;
    private Date mDatePosted;
    private Date mLastUpdated;

    public static final short OPEN_STATUS = 0;
    public static final short CLOSED_STATUS = 1;

    public String getId() {
        return mId;
    }

    public void setId(String newId) {
        mId = newId;
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

    public short getStatus() { return mStatus; }

    public Date getDatePosted() { return mDatePosted; }

    public Date getLastUpdateTime() { return mLastUpdated; }

    public Position() { }

    public Position(String id, String jobTitle, String description, String location) {
        this.mId = id;
        this.mTitle = jobTitle;
        this.mDescription = description;
        this.mLocation = location;
        this.mStatus = OPEN_STATUS;
    }

    public Position(String jobTitle, String description, String location) {
        this.mTitle = jobTitle;
        this.mDescription = description;
        this.mLocation = location;
        this.mStatus = OPEN_STATUS;
    }
}
