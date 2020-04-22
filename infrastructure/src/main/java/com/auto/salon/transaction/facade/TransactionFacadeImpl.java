package com.auto.salon.transaction.facade;

import com.auto.salon.TransactionRepository;
import com.auto.salon.purchaseTransaction.Transaction;
import com.auto.salon.transaction.TransactionFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class TransactionFacadeImpl implements TransactionFacade {

    private final TransactionRepository transactionRepository;

    @Override
    public List<Transaction> generate() {
        return transactionRepository.getAll().stream().collect(Collectors.toList());
    }
}
