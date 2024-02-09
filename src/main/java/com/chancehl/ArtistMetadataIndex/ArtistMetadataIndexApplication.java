package com.chancehl.ArtistMetadataIndex;

import com.chancehl.ArtistMetadataIndex.interfaces.ArtistRepository;
import com.chancehl.ArtistMetadataIndex.models.database.Artist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class ArtistMetadataIndexApplication {
	@Autowired
	private ArtistRepository artistRepository;

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		Logger logger = LoggerFactory.getLogger(ArtistMetadataIndexApplication.class);

		this.artistRepository.save(Artist.builder().displayName("Test test").build());

		List<Artist> artists = this.artistRepository.findAll();

		logger.info("Found {} artists", artists.size());
	}

	public static void main(String[] args) {
		SpringApplication.run(ArtistMetadataIndexApplication.class, args);
	}
}
