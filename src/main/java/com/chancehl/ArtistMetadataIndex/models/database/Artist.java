package com.chancehl.ArtistMetadataIndex.models.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Artist {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String displayName;
}
