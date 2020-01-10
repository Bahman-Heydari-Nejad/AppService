package ir.appservice.model.repository;

import ir.appservice.model.entity.application.ui.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends CrudRepository<Menu, String> {

    List<Menu> findAllByTypeIgnoreCaseAndParentIsNullAndDeleteDateIsNull(String type);

    List<Menu> findAllByTypeAndDeleteDateIsNull(String type);

    List<Menu> findAllByTypeAndPanelIsNullAndDeleteDateIsNull(String type);

    List<Menu> findAllByParentIsNullAndDeleteDateIsNull();

}
