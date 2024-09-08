package com.bot.journal.service;

import com.bot.journal.entity.JournalEntry;
import com.bot.journal.repo.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JournalService {
    @Autowired
    private JournalRepository journalRepository;


    public List<JournalEntry> getAllJournals()
    {
        return this.journalRepository.findAll();

    }


    public void addJournalEntry(JournalEntry journalEntry) {
        this.journalRepository.save(journalEntry);
    }
}
