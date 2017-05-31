package com.ireul.nerfweb.controllers;

import com.ireul.nerf.web.controller.BaseController;
import com.ireul.nerf.web.route.Action;

/**
 * Created by ryan on 5/31/17.
 */
public class WelcomeController extends BaseController {

    @Action("/")
    public void index() {
        bodyPlain("Welcome to Nerf !");
    }

    @Action("/users/:name")
    public void users() {
        bodyPlain("Welcome " + namedPath("name"));
    }

}
