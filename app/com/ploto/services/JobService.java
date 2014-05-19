package com.ploto.services;


import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.ploto.services.store.JobServiceStore;

/**
 * Created by jeff on 5/17/14.
 */
public class JobService {

    private static JobService mInstance = null;

    @Inject
    private JobServiceStore mJobServiceStore = null;

    private JobService() {

    }

    public static JobService Instance() {

        // BUGBUG: Rip this out and replace with dependency injection later.
        if(mInstance == null) {
            mInstance = new JobService();
        }

        return mInstance;
    }

    public void CreateJob(Job newJob) {
        // Validate our input parameters.
        Preconditions.checkNotNull(newJob);
        Preconditions.checkState(newJob.getId() < 0, "Invalid Job ID");
        Preconditions.checkState(newJob.getTitle() == null || newJob.getTitle().length() < 1, "Invalid Job Title");
        Preconditions.checkState(newJob.getDescription() == null || newJob.getDescription().length() < 1,
                "Invalid Job Description");
        Preconditions.checkState(newJob.getLocation() == null || newJob.getLocation().length() < 1,
                "Invalid Job Location");


    }

    public void RemoveJob(Job jobToRemove) {
        // Validate our input parameters.
        Preconditions.checkNotNull(jobToRemove);
        Preconditions.checkState(jobToRemove.getId() < 0, "Invalid Job ID");

    }

    public ImmutableList<Job> FetchOpenPositions() {

        return null;
    }
};

