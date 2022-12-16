package com.quicktutorials.learnmicroservices.services;

import com.quicktutorials.learnmicroservices.entities.Account;
import com.quicktutorials.learnmicroservices.entities.Operation;

import java.util.List;

public interface OperationService {

    List<Operation> getAllOperationPerAccount(String accountId);

    List<Account> getAllAccountsPerUser(String userId);

    Operation saveOperation(Operation operation);

}
