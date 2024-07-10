package com.NetBanking.FsF.Repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NetBanking.FsF.Model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	 List<Transaction> findBySenderAccountAccountNumberOrRecipientAccountAccountNumber(String senderAccountNumber, String recipientAccountNumber);

}
