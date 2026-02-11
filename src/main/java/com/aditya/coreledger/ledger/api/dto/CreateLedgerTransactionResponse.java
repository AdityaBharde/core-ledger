package com.aditya.coreledger.ledger.api.dto;

import java.time.Instant;

public class CreateLedgerTransactionResponse {

    private Long transactionId;

    private Instant createdAt;

    public CreateLedgerTransactionResponse() {}

    public CreateLedgerTransactionResponse(Long transactionId, Instant createdAt) {
        this.transactionId = transactionId;
        this.createdAt = createdAt;
    }

    public Long getTransactionId() { return transactionId; }

    public Instant getCreatedAt() { return createdAt; }
}
