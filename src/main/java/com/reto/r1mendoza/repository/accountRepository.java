package com.reto.r1mendoza.repository;

import com.reto.r1mendoza.repository.entities.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface accountRepository extends CrudRepository<Account, Integer> {

    @Transactional // me permite modificar data en base de datos.
    @Modifying
    @Query("delete from Account a where a.clientAccount like :clientAccount" ) // delete creado por JPA, QUERY NATIVO., no estoy borrando por id de cliente
        // sino por cuenta.
    int deleteByClientAccountLike(String clientAccount);

    Iterable<Account> findAll(); //Consultas por el ORM
    Optional<Account> clientAccount(String id); //Consultas por el ORM

}
