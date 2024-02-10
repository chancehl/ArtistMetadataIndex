package com.chancehl.ArtistMetadataIndex.tasks;

import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.TimerTask;

@Component
@NoArgsConstructor
public class ScanArtistTask extends TimerTask {
    @Override
    public void run() {
        Logger logger = LoggerFactory.getLogger(ScanArtistTask.class);

        logger.info("I am running on an interval");
    }
}
