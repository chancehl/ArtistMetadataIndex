package com.chancehl.ArtistMetadataIndex.tasks;

import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Timer;

@Component
@NoArgsConstructor
public class TaskManager {
    @Autowired
    private ScanArtistTask scanArtistTask;

    public void registerTasks() {
        Logger logger = LoggerFactory.getLogger(TaskManager.class);

        Timer timer = new Timer();

        long DELAY = 0;
        long INTERVAL = 60000;

        timer.schedule(scanArtistTask, DELAY, INTERVAL);

        logger.info("Successfully registered tasks");
    }
}
