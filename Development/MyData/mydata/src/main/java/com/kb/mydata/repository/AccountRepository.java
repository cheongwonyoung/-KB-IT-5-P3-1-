package com.kb.mydata.repository;

import com.kb.mydata.entity.Account;
import com.kb.mydata.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findByUser_UserId(Long userId);
}