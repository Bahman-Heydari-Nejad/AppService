package ir.appservice.view.beanComponents.panelBean.crudBean;

import ir.appservice.model.entity.application.Account;
import ir.appservice.model.service.AccountService;
import ir.appservice.model.service.DocumentService;
import ir.appservice.view.beanComponents.panelBean.BaseLazyCrudBean;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.event.FileUploadEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Setter
@Getter
@Component
@SessionScope
public class AccountCrudBean extends BaseLazyCrudBean<Account> {

    private DocumentService documentService;

    public AccountCrudBean(AccountService accountService, DocumentService documentService) {
        super(accountService, Account.class);
        this.documentService = documentService;
    }

    public void uploadAvatar(FileUploadEvent event) {
        this.appLazyDataModel.getItem().setAvatar(documentService.uploadDocument(event.getFile()));
    }
}
