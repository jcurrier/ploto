package com.ploto.services.store;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ploto.services.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by jeff on 5/18/14.
 */
@Singleton
public class JobServiceSqlStore extends BaseSqlStore implements JobServiceStore {

    private final String CREATE_JOB =
            "INSERT INTO position(id, title, description, location, status)" +
            "VALUES(?, ?, ?, ?, ?);";

    private final String REMOVE_JOB = "DELETE FROM position WHERE id = ?;";

    @Inject
    private JobServiceSqlStore() {
        System.out.println("In ctor of JobServiceSqlStore");
    }

    @Override
    public void StoreJob(Position newPosition) {
        System.out.println("In JobServiceSqlStore");

        Connection dbConn = null;
        try {
            dbConn = getConnection();

            PreparedStatement ps = dbConn.prepareStatement(CREATE_JOB);
            ps.setString(0, generateUniqueId());
            ps.setString(1, newPosition.getTitle());
            ps.setString(2, newPosition.getDescription());
            ps.setString(3, newPosition.getLocation());
            ps.setShort(4, newPosition.getStatus());

            ps.execute();
            int updateCount = ps.getUpdateCount();
            System.out.println("updateCount == " + updateCount);

        } catch(Exception ex) {
            ex.printStackTrace();

        } finally {
            if(dbConn != null) {
                //dbConn.close();
            }
        }
    }

    @Override
    public void RemoveJob(Position positionToRemove) {

    }

    @Override
    public ImmutableList<Position> FetchOpenPositions() {
        return null;
    }
}
