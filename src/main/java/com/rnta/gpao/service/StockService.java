package com.rnta.gpao.service;

import java.util.List;
import com.rnta.gpao.entities.Stock;

public interface StockService {

	List<Stock> getAllStock();
	Stock saveStock(Stock stock);
	Stock getStockById(Long id);
	Stock updateStock(Stock stock);

}
