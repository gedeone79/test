package com.quicktutorials.learnmicroservices.services;


import com.quicktutorials.learnmicroservices.daos.AccountDao;
import com.quicktutorials.learnmicroservices.daos.OperationDao;
import com.quicktutorials.learnmicroservices.entities.Account;
import com.quicktutorials.learnmicroservices.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OperationServiceImpl implements OperationService {

    @Autowired
    AccountDao accountDao;

    @Autowired
    OperationDao operationDao;


    @Override
    public List<Operation> getAllOperationPerAccount(String accountId) {
        return operationDao.findAllOperationsByAccount(accountId);
    }

    @Override
    public List<Account> getAllAccountsPerUser(String userId) {
        return accountDao.getAllAccountsPerUser(userId);
    }

    @Override
    public Operation saveOperation(Operation operation) {

        if (operation.getDate() == null) {
            operation.setDate(new Date());
        }

        return operationDao.save(operation);
    }


}
