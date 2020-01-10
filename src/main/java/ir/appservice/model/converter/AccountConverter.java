package ir.appservice.model.converter;

import ir.appservice.model.entity.application.Account;
import ir.appservice.model.service.AccountService;
import org.springframework.stereotype.Component;

@Component
public class AccountConverter extends BaseConverter<Account> {

    public AccountConverter(AccountService accountService) {
        super(Account.class, accountService);
    }
}
