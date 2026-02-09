package com.aditya.coreledger.ledger.service;

import com.aditya.coreledger.ledger.repository.AccountRepository;
import com.aditya.coreledger.ledger.repository.TransactionRepository;
import com.aditya.coreledger.ledger.repository.EntryRepository;
import org.springframework.stereotype.Service;

@Service
public class LedgerService {

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;
    private final EntryRepository entryRepository;

    public LedgerService(AccountRepository accountRepository,
                         TransactionRepository transactionRepository,
                         EntryRepository entryRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
        this.entryRepository = entryRepository;
    }
}
