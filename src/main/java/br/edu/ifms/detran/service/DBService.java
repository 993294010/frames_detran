package br.edu.ifms.detran.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.detran.model.Apolice;
import br.edu.ifms.detran.model.Carro;
import br.edu.ifms.detran.model.Infracao;
import br.edu.ifms.detran.model.Multa;
import br.edu.ifms.detran.repository.RepositoryApolice;
import br.edu.ifms.detran.repository.RepositoryCarro;
import br.edu.ifms.detran.repository.RepositoryInfracao;
import br.edu.ifms.detran.repository.RepositoryMulta;
@Service
public class DBService {
	@Autowired
	RepositoryCarro repositoryCarro;
	@Autowired
	RepositoryApolice repositoryApolice;
	@Autowired
	RepositoryInfracao repositoryInfracao;
	@Autowired
	RepositoryMulta repositoryMulta;
		
	public void instantiateTestDatabase() throws ParseException{
		// TODO Auto-generated method stub
		
		Carro ckenely = new Carro(null, "Onix","ool 1234","Chevrolet",2014,"preto" , null);
		Carro cRodrigo = new Carro(null, "ka","kal 127664","ford",2018,"preto" , null);
		Carro cThais = new Carro(null, "onix","ool 1234","Chevrolet",2014,"vermelho" , null);
		Carro cFabiola = new Carro(null, "Cruze","ksd34","chevrolet",2023,"preto", null);
		
		Apolice apo1 = new Apolice(null, 3000, "total", "12/2030", cThais);
		
		Infracao i1 = new Infracao(null,"Estacionamento proibido", 7, 150);
		Infracao i2 = new Infracao(null,"Cinto de seguranca", 5, 99);
		Infracao i3 = new Infracao(null,"Velocidade acima da permitida", 10, 2299);
		Infracao i4 = new Infracao(null,"Ultrapassagem em faixa ", 5, 99);
		Infracao i5 = new Infracao(null,"Sinal vermelho", 5, 99);
		
		Multa m1 = new Multa(null,"Corumba", 2020, ckenely, i3);
		Multa m2 = new Multa(null,"Ladario", 2023, ckenely, i5);
		Multa m3 = new Multa(null,"Corumba", 2021, cRodrigo, i3);
		Multa m4 = new Multa(null,"Campo Grande", 2020, cFabiola, i1);
		Multa m5 = new Multa(null,"Miranda", 2020, cRodrigo, i4);
		
		repositoryApolice.saveAll(Arrays.asList(apo1));
		repositoryCarro.saveAll(Arrays.asList(ckenely,cRodrigo,cThais,cFabiola));
		
		repositoryInfracao.saveAll(Arrays.asList(i1,i2,i3,i4,i5));
		repositoryMulta.saveAll(Arrays.asList(m1,m2,m3,m4,m5));
	}

}