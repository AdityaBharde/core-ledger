package com.aditya.coreledger.ledger.repository;

import com.aditya.coreledger.ledger.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
