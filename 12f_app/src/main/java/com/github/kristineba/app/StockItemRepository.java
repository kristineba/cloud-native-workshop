package com.github.kristineba.app;

import com.github.kristineba.app.domain.model.ItemType;
import com.github.kristineba.app.domain.model.StockItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}

