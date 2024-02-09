package com.chancehl.ArtistMetadataIndex.controllers;

import com.chancehl.ArtistMetadataIndex.models.datatransfer.ArtistDto;
import com.chancehl.ArtistMetadataIndex.models.datatransfer.MetadataIndexDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {
    @GetMapping("/index")
    public MetadataIndexDto index() {
        List<ArtistDto> artists = new ArrayList<>();

        artists.add(
            ArtistDto.builder()
                .displayName("Test test")
                .rank(1)
                .build()
        );

        return MetadataIndexDto.builder()
                .artists(artists)
                .build();
    }
}
