package com.zim0101.springbatchpoc.job.import_user;

import com.zim0101.springbatchpoc.model.Account;
import com.zim0101.springbatchpoc.repository.UserRepository;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class UserItemWriter implements ItemWriter<Account> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(Chunk<? extends Account> chunk) throws Exception {
        userRepository.saveAll(chunk);
    }
}