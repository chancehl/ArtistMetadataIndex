package com.chancehl.ArtistMetadataIndex.configuration;

import com.chancehl.ArtistMetadataIndex.tasks.TaskManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ApplicationConfiguration {
    @Autowired
    private TaskManager taskManager;

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        this.taskManager.registerTasks();
    }
}
