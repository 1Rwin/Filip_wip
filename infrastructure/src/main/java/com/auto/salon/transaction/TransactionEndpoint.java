package com.auto.salon.transaction;

import com.auto.salon.purchaseTransaction.Transaction;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log
@RestController
@AllArgsConstructor
public class TransactionEndpoint {

    private final TransactionFacade transactionfacade;

    @GetMapping("/transactions")
    public List<Transaction> getTransactions(){
        return transactionfacade.generate();
    }
}
