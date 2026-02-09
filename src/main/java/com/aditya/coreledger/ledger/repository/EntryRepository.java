package com.aditya.coreledger.ledger.repository;

import com.aditya.coreledger.ledger.domain.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Long> {
    List<Entry> findByAccountId(Long accountId);
    List<Entry> findByTransactionId(Long transactionId);
}
