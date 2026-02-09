package com.aditya.coreledger.ledger.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long transactionId;

    private Long accountId;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private EntryDirection direction;

    private LocalDateTime createdAt;

    protected Entry() {
    }
}
