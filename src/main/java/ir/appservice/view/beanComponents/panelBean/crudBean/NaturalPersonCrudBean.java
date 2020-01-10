package ir.appservice.view.beanComponents.panelBean.crudBean;

import ir.appservice.model.entity.domain.NaturalPerson;
import ir.appservice.model.service.CrudService;
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
public class NaturalPersonCrudBean extends BaseLazyCrudBean<NaturalPerson> {

    private DocumentService documentService;

    public NaturalPersonCrudBean(CrudService<NaturalPerson> naturalPersonCrudService, DocumentService documentService) {
        super(naturalPersonCrudService, NaturalPerson.class);
        this.documentService = documentService;
    }

    public void uploadAvatar(FileUploadEvent event) {
        this.appLazyDataModel.getItem().setAvatar(documentService.uploadDocument(event.getFile()));
    }
}
