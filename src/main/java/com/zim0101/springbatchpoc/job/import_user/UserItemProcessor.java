package com.zim0101.springbatchpoc.job.import_user;

import com.zim0101.springbatchpoc.model.Account;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<Account, Account> {
    @Override
    public Account process(Account account) throws Exception {
        return account;
    }
}