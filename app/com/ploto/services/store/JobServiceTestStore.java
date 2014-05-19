package com.ploto.services.store;

import com.google.common.collect.ImmutableList;
import com.ploto.services.Job;
import com.ploto.services.store.JobServiceStore;

/**
 * Created by jeff on 5/18/14.
 */
public class JobServiceTestStore implements JobServiceStore {

    @Override
    public void StoreJob(Job newJob) {
        System.out.println("In JobServiceTestStore");
    }

    @Override
    public void RemoveJob(Job jobToRemove) {

    }

    @Override
    public ImmutableList<Job> FetchOpenPositions() {
        return null;
    }
}
