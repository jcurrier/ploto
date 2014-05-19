package com.ploto.services.store;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ploto.services.Job;

/**
 * Created by jeff on 5/18/14.
 */
@Singleton
public class JobServiceSqlStore implements JobServiceStore {

    @Inject
    private JobServiceSqlStore() {
        System.out.println("In ctor of JobServiceSqlStore");
    }

    @Override
    public void StoreJob(Job newJob) {
        System.out.println("In JobServiceSqlStore");

    }

    @Override
    public void RemoveJob(Job jobToRemove) {

    }

    @Override
    public ImmutableList<Job> FetchOpenPositions() {
        return null;
    }
}
