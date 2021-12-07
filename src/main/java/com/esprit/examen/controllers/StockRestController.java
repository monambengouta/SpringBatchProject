package com.esprit.examen.controllers;

import java.util.List;

import com.esprit.examen.BatchLauncher;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.examen.entities.Stock;
import com.esprit.examen.services.IStockService;
import io.swagger.annotations.Api;


@RestController
@Api(tags = "Gestion des stocks")
@RequestMapping("/stock")
public class StockRestController {

	@Autowired
	IStockService stockService;
	@Autowired
	private BatchLauncher batchLauncher;
		
	/*Lancer le job d'ajout des lignes stocks à partir de la base de données
	 * manuellement */
	@PostMapping("/add-stocks")
	public void saveAllStocks () throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
		batchLauncher.run();

	}
	/*toDo11*/


}
