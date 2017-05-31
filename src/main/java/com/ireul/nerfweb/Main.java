package com.ireul.nerfweb;

import com.ireul.nerf.Nerf;
import com.ireul.nerf.application.BaseApplication;
import com.ireul.nerf.inject.Provide;
import com.ireul.nerfweb.models.SomeModel;

/**
 * Created by ryan on 5/31/17.
 */
public class Main extends BaseApplication {

    @Provide
    SomeModel model = new SomeModel();

    @Override
    public void boot() {
        super.boot();

        this.model.setName("newName");
        this.model.setValue("newValue");
    }

    public static void main(String[] args) {
        Nerf.ignite(Main.class, args);
    }
}
