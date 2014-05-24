package com.ploto.services.store;

import com.google.common.collect.ImmutableList;
import com.ploto.services.Position;

/**
 * Created by jeff on 5/18/14.
 */
public interface JobServiceStore {

    public void StoreJob(Position newPosition);

    public void RemoveJob(Position positionToRemove);

    public ImmutableList<Position> FetchOpenPositions();
}
