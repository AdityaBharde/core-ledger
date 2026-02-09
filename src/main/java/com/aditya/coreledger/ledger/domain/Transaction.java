package com.aditya.coreledger.ledger.domain;

import jakarta.persistence.*;
import lombok.Getter;
import java.time.LocalDateTime;

@Entity
@Getter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    private String idempotencyKey;

    private String reference;
    private String metadata;

    protected Transaction() {
    }

}
