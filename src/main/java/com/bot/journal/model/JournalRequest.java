package com.bot.journal.model;

import lombok.*;

import java.util.Date;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class JournalRequest {
    private String journalTitle;
    private String journalContent;
    private Date date;
}
