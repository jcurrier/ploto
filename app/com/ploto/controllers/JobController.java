package com.ploto.controllers;

import com.ploto.services.Position;
import com.ploto.services.JobService;
import com.ploto.util.PlotoContext;
import com.ploto.views.html.index;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jeff on 5/17/14.
 */
public class JobController extends Controller {

  public static Result index() {

    JobService jobSvc = PlotoContext.getInjector().getInstance(JobService.class);

    jobSvc.createPosition(new Position("title", "description", "location"));
    return ok(index.render("Your new application is ready."));
  }
}
