package com.ploto.services;

import com.google.common.collect.ImmutableList;

/**
 * Created by jeff on 5/18/14.
 */
public interface JobService {
    public void CreateJob();

    public void RemoveJob();

    public ImmutableList<Job> FetchOpenPositions();
}
