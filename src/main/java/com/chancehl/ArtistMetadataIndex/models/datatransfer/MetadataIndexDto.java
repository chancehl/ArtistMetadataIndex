package com.chancehl.ArtistMetadataIndex.models.datatransfer;

import lombok.Builder;

import java.util.List;

@Builder
public class MetadataIndexDto {
    public List<ArtistDto> artists;
}
