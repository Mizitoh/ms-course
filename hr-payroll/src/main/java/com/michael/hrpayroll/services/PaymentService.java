package com.michael.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.michael.hrpayroll.entities.Payment;
import com.michael.hrpayroll.entities.Worker;
import com.michael.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
//	@Value("${hr-worker.host}")
//	private String workerHost;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

//	public Payment getPayment(Long workerId, Integer days) {
//		Map<String, String> uriVariables = new HashMap<>();
//		// ""+numero, converte pra String
//		uriVariables.put("id", ""+workerId);
//		
//		/*
//		 * cria-se um map passando parametros da url, nesse caso precisamos do id
//		 * pasamos a chave valor do map uriVariables.put("id", ""+workerId);
//		 * quando for feita a requisição, o map será preenchido com o valor do id
//		 * em getForObject passamos nos parametros a url (como no getmapping)
//		 * O tipo de objeto que deve ser retornado, no caso a classe Worker
//		 * e por fim o map com valores que serão mapeados no caso:
//		 * /workers/{id} para .put("id", ""+workerId);
//		 * 
//		 */
//		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
//		return new Payment(worker.getName(), worker.getDailyIncome(), days);
//	}
	
	public Payment getPayment(Long workerId, Integer days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
