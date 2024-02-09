package com.chancehl.ArtistMetadataIndex.interfaces;

import com.chancehl.ArtistMetadataIndex.models.database.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {}
