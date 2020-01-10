package ir.appservice.model.repository;

import ir.appservice.model.entity.application.ui.Panel;
import org.springframework.stereotype.Repository;

@Repository
public interface PanelRepository extends CrudRepository<Panel, String> {

}
