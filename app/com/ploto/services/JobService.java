package com.ploto.services;


import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ploto.services.store.JobServiceStore;
import com.ploto.util.PlotoContext;

/**
 * Created by jeff on 5/17/14.
 */
@Singleton
public class JobService {

    private static JobService mInstance = null;

    @Inject
    private JobServiceStore mJobServiceStore;

    @Inject
    private JobService() {
        mJobServiceStore = PlotoContext.getInjector().getInstance(JobServiceStore.class);
    }

    public void CreatePosition(Position newPosition) {
        // Validate our input parameters.
        Preconditions.checkNotNull(newPosition);
        Preconditions.checkState(newPosition.getTitle() != null && newPosition.getTitle().length() > 1,
                "Invalid Job Title");
        Preconditions.checkState(newPosition.getDescription() != null && newPosition.getDescription().length() > 1,
                "Invalid Job Description");
        Preconditions.checkState(newPosition.getLocation() != null && newPosition.getLocation().length() > 1,
                "Invalid Job Location");

        mJobServiceStore.StoreJob(newPosition);

    }

    public void RemovePosition(Position positionToRemove) {
        // Validate our input parameters.
        Preconditions.checkNotNull(positionToRemove);
        Preconditions.checkState(positionToRemove.getId() != null && positionToRemove.getId().length() > 1,
                "Invalid Job ID");

        mJobServiceStore.RemoveJob(positionToRemove);
    }

    public ImmutableList<Position> FetchOpenPositions() {

        return null;
    }
};

