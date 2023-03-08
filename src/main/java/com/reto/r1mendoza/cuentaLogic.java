package com.reto.r1mendoza;

import com.reto.r1mendoza.repository.accountRepository;
import com.reto.r1mendoza.repository.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cuentaLogic {
    @Autowired
    private accountRepository accountRepository;
    public Account getAccount(String id){
        return accountRepository.clientAccount(id).orElse(null);
    }
    public Iterable<Account> getAccounts(){
        return accountRepository.findAll();
    }

    public Account saveAccount(Account account){
        return accountRepository.save(account);
    }

    public void deleteAccount(String account){
        accountRepository.deleteByClientAccountLike(account);
    }


}
