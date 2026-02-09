package com.aditya.coreledger.ledger.repository;

import com.aditya.coreledger.ledger.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Optional<Transaction> findByIdempotencyKey(String idempotencyKey);
}
