package com.aditya.coreledger.ledger.api.dto;

import com.aditya.coreledger.ledger.domain.Currency;
import java.util.List;

public class CreateLedgerTransactionRequest {

    private String idempotencyKey;

    private Currency currency;

    private List<LedgerEntryRequest> entries;

    public CreateLedgerTransactionRequest() {}

    public CreateLedgerTransactionRequest(String idempotencyKey,
                                          Currency currency,
                                          List<LedgerEntryRequest> entries) {
        this.idempotencyKey = idempotencyKey;
        this.currency = currency;
        this.entries = entries;
    }

    public String getIdempotencyKey() { return idempotencyKey; }

    public Currency getCurrency() { return currency; }

    public List<LedgerEntryRequest> getEntries() { return entries; }
}
