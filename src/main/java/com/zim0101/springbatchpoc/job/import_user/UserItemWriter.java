package com.zim0101.springbatchpoc.job.import_user;

import com.zim0101.springbatchpoc.model.User;
import com.zim0101.springbatchpoc.repository.UserRepository;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class UserItemWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(Chunk<? extends User> chunk) throws Exception {
        userRepository.saveAll(chunk);
    }
}