package com.ploto.controllers;

import play.*;
import play.mvc.*;

import com.ploto.views.html.*;

public class Application extends Controller {

  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

}
