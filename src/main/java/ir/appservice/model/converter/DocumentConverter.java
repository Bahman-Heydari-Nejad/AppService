package ir.appservice.model.converter;

import ir.appservice.model.entity.domain.Document;
import ir.appservice.model.service.DocumentService;
import org.springframework.stereotype.Component;

@Component
public class DocumentConverter extends BaseConverter<Document> {

    public DocumentConverter(DocumentService documentService) {
        super(Document.class, documentService);
    }
}
