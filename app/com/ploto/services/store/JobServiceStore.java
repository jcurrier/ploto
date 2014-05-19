package com.ploto.services.store;

import com.google.common.collect.ImmutableList;
import com.ploto.services.Job;

/**
 * Created by jeff on 5/18/14.
 */
public interface JobServiceStore {

    public void StoreJob(Job newJob);

    public void RemoveJob(Job jobToRemove);

    public ImmutableList<Job> FetchOpenPositions();
}
