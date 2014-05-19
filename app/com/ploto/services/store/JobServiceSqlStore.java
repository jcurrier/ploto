package com.ploto.services.store;

import com.google.common.collect.ImmutableList;
import com.ploto.services.Job;

/**
 * Created by jeff on 5/18/14.
 */
public class JobServiceSqlStore implements JobServiceStore {
    @Override
    public void StoreJob(Job newJob) {

    }

    @Override
    public void RemoveJob(Job jobToRemove) {

    }

    @Override
    public ImmutableList<Job> FetchOpenPositions() {
        return null;
    }
}
