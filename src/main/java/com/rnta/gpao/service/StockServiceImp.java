package com.rnta.gpao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rnta.gpao.entities.Stock;
import com.rnta.gpao.repository.StockRepository;

@Service
public class StockServiceImp implements StockService {

	@Autowired
	private StockRepository  stockRepository;
			  
	@Override
	public List<Stock> getAllStock() {
		 return stockRepository.findAll();
	}

	@Override
	public Stock saveStock(Stock stock) {
		return this.stockRepository.save(stock);
		
	}


	@Override
	public Stock getStockById(Long id) {
		Optional<Stock> optional = stockRepository.findById(id);
		Stock stock = null;
		if(optional.isPresent()) {
			stock =  optional.get();
		}else {
			throw new RuntimeException("effectif n'est pas trouvée par l'id ::"+ id);
		}
		return stock ;
	}

	@Override
	public Stock updateStock(Stock stock) {
	 return  stockRepository.save(stock);
	}

	

	

}
