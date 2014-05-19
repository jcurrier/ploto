package com.ploto.util;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ploto.services.JobService;
import com.ploto.services.store.JobServiceSqlStore;
import com.ploto.services.store.JobServiceStore;
import com.ploto.services.store.JobServiceTestStore;

/**
 * Created by jeff on 5/18/14.
 */
public class PlotoContext {
    private static Injector mInjector = null;

    static {
        mInjector = Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                bind(JobServiceStore.class).to(JobServiceSqlStore.class);
                bind(JobService.class);
            }
        });
    }

    public static Injector getInjector() {
        return mInjector;
    }

    public static void createTestBindings() {
        mInjector = Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                bind(JobServiceStore.class).to(JobServiceTestStore.class);
                bind(JobService.class);
            }
        });
    }
}
