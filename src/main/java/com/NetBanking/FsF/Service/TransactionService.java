package com.NetBanking.FsF.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NetBanking.FsF.Model.Transaction;
import com.NetBanking.FsF.Repository.TransactionRepository;


@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionsByAccountNumber(String accountNumber) {
        return transactionRepository.findBySenderAccountAccountNumberOrRecipientAccountAccountNumber(accountNumber, accountNumber);
    }
}
