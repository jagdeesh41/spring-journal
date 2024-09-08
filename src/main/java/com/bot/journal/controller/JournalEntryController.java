package com.bot.journal.controller;

import com.bot.journal.entity.JournalEntry;
import com.bot.journal.model.JournalRequest;
import com.bot.journal.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class JournalEntryController {
    @Autowired
    private JournalService journalService;
    @GetMapping
    public ResponseEntity<List<JournalEntry>> getAll()
    {
        return ResponseEntity.status(HttpStatus.OK)
                .body(this.journalService.getAllJournals());
    }
    @PostMapping
    public  void addJournal(@RequestBody JournalRequest journalRequest)
    {
        journalService.addJournalEntry(journalRequest);
        ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
