package ir.appservice.model.converter;

import ir.appservice.model.entity.domain.NaturalPerson;
import ir.appservice.model.service.NaturalPersonService;
import org.springframework.stereotype.Component;

@Component
public class NaturalPersonConverter extends BaseConverter<NaturalPerson> {

    public NaturalPersonConverter(NaturalPersonService naturalPersonService) {
        super(NaturalPerson.class, naturalPersonService);
    }
}
