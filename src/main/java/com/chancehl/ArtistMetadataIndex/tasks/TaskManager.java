package com.chancehl.ArtistMetadataIndex.tasks;

import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Timer;

@Component
@NoArgsConstructor
public class TaskManager {

    public void registerTasks() {
        Logger logger = LoggerFactory.getLogger(TaskManager.class);

        Timer timer = new Timer();
        ScanArtistTask task = new ScanArtistTask();

        long DELAY = 60000;
        long INTERVAL = 60000;

        timer.schedule(task, DELAY, INTERVAL);

        logger.info("Successfully registered tasks");
    }
}
