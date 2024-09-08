package com.bot.journal.service;

import com.bot.journal.entity.JournalEntry;
import com.bot.journal.mapper.JournalMapper;
import com.bot.journal.model.JournalRequest;
import com.bot.journal.repo.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;
@Service
public class JournalService {
    @Autowired
    private JournalMapper journalMapper;
    @Autowired
    private JournalRepository journalRepository;


    public List<JournalEntry> getAllJournals()
    {
        return this.journalRepository.findAll();

    }


    public void addJournalEntry(JournalRequest journalRequest) {
        JournalEntry journalEntry = journalMapper.convertDtoToEntity(journalRequest);
        journalEntry.setDate(new Date());
        this.journalRepository.save(journalEntry);
    }
}
