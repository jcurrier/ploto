package com.ploto.services.test;

import com.ploto.services.Job;
import com.ploto.services.JobService;
import com.ploto.util.PlotoContext;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by jeff on 5/18/14.
 */

public class JobServiceTest {
    private static PlotoContext mCtx = new PlotoContext();

    @BeforeClass
    public static void setup() {
        PlotoContext.createTestBindings();
    }

    @Test
    public void newJobTest() {

        JobService jobSvc = mCtx.getInjector().getInstance(JobService.class);

        jobSvc.CreateJob(new Job(1, "title", "description", "location"));
    }

    @Test
    public void removeJobTest() {

        JobService jobSvc = mCtx.getInjector().getInstance(JobService.class);

        jobSvc.CreateJob(new Job(1, "title", "description", "location"));
    }
}
