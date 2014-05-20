package com.ploto.services.store;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ploto.services.Job;
import com.ploto.services.store.JobServiceStore;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jeff on 5/18/14.
 */
@Singleton
public class JobServiceTestStore implements JobServiceStore {

    private Map<Integer, Job> mJobMap = null;

    @Inject
    private JobServiceTestStore() {
        System.out.println("In ctor for JobServiceTestStore");

        mJobMap = new HashMap<Integer, Job>();
    }

    @Override
    public void StoreJob(Job newJob) {
        mJobMap.put(newJob.getId(), newJob);
    }

    @Override
    public void RemoveJob(Job jobToRemove) {

    }

    @Override
    public ImmutableList<Job> FetchOpenPositions() {

        return null;
    }
}
