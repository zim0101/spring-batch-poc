package com.zim0101.springbatchpoc.repository;

import com.zim0101.springbatchpoc.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Account, Integer> {
}
