package com.auto.salon.purchaseTransaction;

import com.auto.salon.core.transactionType.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
@AllArgsConstructor
public class Transaction {

    @NonNull
    private String orderNumber;
    @NonNull
    private TransactionType transactionType;
    @NonNull
    private Integer totalCost;

}
