package com.esprit.examen.services;

import com.esprit.examen.entities.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.examen.repositories.StockRepository;

import java.util.List;

@Service
public class StockServiceImpl implements IStockService {

	@Autowired
	StockRepository stockRepository;

	/*toDo 9*/
	@Override
	public void saveAllStock(List<Stock> stocks) {
		stockRepository.saveAll(stocks);
	}










}