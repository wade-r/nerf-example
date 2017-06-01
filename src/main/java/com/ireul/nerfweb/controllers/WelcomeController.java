package com.ireul.nerfweb.controllers;

import com.ireul.nerf.inject.Inject;
import com.ireul.nerf.web.controller.BaseController;
import com.ireul.nerf.web.route.Action;
import com.ireul.nerfweb.models.SomeModel;

/**
 * Created by ryan on 5/31/17.
 */
public class WelcomeController extends BaseController {

    @Inject
    SomeModel model = null;

    @Action("/")
    void index() {
        bodyPlain("Welcome to Nerf !");
    }

    @Action("/users/:name")
    void users() {
        bodyPlain("Welcome " + namedPath("name") + " value: " + this.model.getValue());
    }

    @Action("/raise")
    void raise() {
        throw new Error("wild error appears");
    }

    @Action("/index_view")
    void view() {
        local("name", "hello");
        local("model", this.model);
        renderHtml("index/view");
    }

}
