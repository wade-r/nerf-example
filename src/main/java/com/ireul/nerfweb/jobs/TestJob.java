package com.ireul.nerfweb.jobs;

import com.ireul.nerf.inject.Inject;
import com.ireul.nerf.schedule.BaseJob;
import com.ireul.nerf.schedule.Schedule;
import com.ireul.nerfweb.models.SomeModel;
import org.quartz.JobDataMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ryan Wade
 */
@Schedule(group = "Test", interval = 5)
public class TestJob extends BaseJob {

    @Inject
    SomeModel model;

    private final Logger logger = LoggerFactory.getLogger(TestJob.class);

    @Override
    public void execute(JobDataMap jobDataMap) throws Exception {
        logger.info("Model: " + model.getValue());
    }

}
