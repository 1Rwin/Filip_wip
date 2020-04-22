package com.auto.salon.transaction;

import com.auto.salon.purchaseTransaction.Transaction;

import java.util.List;

public interface TransactionFacade {

    List<Transaction> generate();

}
