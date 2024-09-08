package com.bot.journal.mapper;

import com.bot.journal.entity.JournalEntry;
import com.bot.journal.model.JournalRequest;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface JournalMapper {
    @Mapping(target = "journalTitle", source = "journalEntry.title")
    @Mapping(target = "journalContent", source ="journalEntry.content" )
    @Mapping(target = "date", expression = "java(journalEntry.getDate())")
    JournalRequest convertEntityToDto(JournalEntry journalEntry);
    @InheritInverseConfiguration
    JournalEntry convertDtoToEntity(JournalRequest journalRequest);
}
