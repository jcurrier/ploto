package com.ploto.settings;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ploto.services.store.JobServiceSqlStore;
import com.ploto.services.store.JobServiceStore;
import play.Application;
import play.GlobalSettings;

/**
 * Created by jeff on 5/18/14.
 */
public class PlotoSettings extends GlobalSettings {
    private Injector mInjector = null;

    @Override
    public void onStart(Application application) {
        mInjector = Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                bind(JobServiceStore.class).to(JobServiceSqlStore.class);
            }
        });
    }
}
