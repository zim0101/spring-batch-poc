package com.zim0101.springbatchpoc.job.import_user;

import com.zim0101.springbatchpoc.model.User;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {
    @Override
    public User process(User user) throws Exception {
        return user;
    }
}