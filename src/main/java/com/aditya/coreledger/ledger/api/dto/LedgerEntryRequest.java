package com.aditya.coreledger.ledger.api.dto;

import com.aditya.coreledger.ledger.domain.EntryDirection;
import java.math.BigDecimal;

public class LedgerEntryRequest {

    private Long accountId;

    private BigDecimal amount;

    private EntryDirection direction;

    public LedgerEntryRequest() {}

    public LedgerEntryRequest(Long accountId, BigDecimal amount, EntryDirection direction) {
        this.accountId = accountId;
        this.amount = amount;
        this.direction = direction;
    }

    public Long getAccountId() { return accountId; }

    public BigDecimal getAmount() { return amount; }

    public EntryDirection getDirection() { return direction; }
}
