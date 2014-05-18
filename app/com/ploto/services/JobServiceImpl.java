package com.ploto.services;


import com.google.common.collect.ImmutableList;

/**
 * Created by jeff on 5/17/14.
 */
public class JobServiceImpl {

    private static JobServiceImpl mInstance = null;

    private JobServiceImpl() {

    }

    public static JobServiceImpl Instance() {

        // BUGBUG: Rip this out and replace with dependency injection later.
        if(mInstance == null) {
            mInstance = new JobServiceImpl();
        }

        return mInstance;
    }

    public void CreateJob() {

    }

    public void RemoveJob() {

    }

    public ImmutableList<Job> FetchOpenPositions() {
        return null;
    }
};

