package com.chancehl.ArtistMetadataIndex.tasks;

import com.chancehl.ArtistMetadataIndex.interfaces.ArtistRepository;
import com.chancehl.ArtistMetadataIndex.models.database.Artist;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.TimerTask;

@Component
@NoArgsConstructor
public class ScanArtistTask extends TimerTask {
    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public void run() {
        Logger logger = LoggerFactory.getLogger(ScanArtistTask.class);

        List<Artist> artists = this.artistRepository.findAll();

        logger.info("Scanning for {} artists...", artists.size());
    }
}
