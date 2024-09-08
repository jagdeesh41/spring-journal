package com.bot.journal.model;

import lombok.*;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class JournalRequest {
    private String journalTitle;
    private String journalContent;
}
