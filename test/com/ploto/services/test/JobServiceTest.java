package com.ploto.services.test;

import com.ploto.services.Position;
import com.ploto.services.JobService;
import com.ploto.util.PlotoContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import play.test.FakeApplication;
import play.test.Helpers;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jeff on 5/18/14.
 */

public class JobServiceTest {
    private static PlotoContext mCtx = new PlotoContext();
    private static FakeApplication mApp = null;

    @BeforeClass
    public static void setup() {

        PlotoContext.createProdBindings();
        Map<String, String> settings = new HashMap<String, String>();
        settings.put("db.plotodb.driver", "com.mysql.jdbc.Driver");
        settings.put("db.plotodb.url", "jdbc:mysql://localhost/plotodb");
        settings.put("db.plotodb.user", "ploto");
        settings.put("db.plotodb.password", "dev");
        mApp = Helpers.fakeApplication(settings);
        Helpers.start(mApp);
    }

    @Test
    public void newJobTest() {

        JobService jobSvc = mCtx.getInjector().getInstance(JobService.class);

        jobSvc.CreatePosition(new Position("title", "description", "location"));
    }

    @Test
    public void removeJobTest() {

        JobService jobSvc = mCtx.getInjector().getInstance(JobService.class);

        jobSvc.CreatePosition(new Position("title", "description", "location"));
    }

    @AfterClass
    public static void tearDown() {
        if(mApp != null) {
            Helpers.stop(mApp);
        }
    }
}
