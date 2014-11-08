#Java Web Services#

Serviço Web em Java de um CRUD baseado em SOAP.

##Criando o banco de dados##

A classe `CreateSchemaSample.java` o schema do banco deve ser criado.

    % java br.com.ws.config.CreateSchemaSample  
	
A classe `SampleDAO.java` popula dados básicos para teste na tabela `person`.	

    % java br.com.ws.config.SampleDAO
	
##Publicando o Serviço##

Depois de criado o SEI(Service Endpoint Interface), classe onde esta registrado os métodos que irão ser diponilizados para os clientes do Web Service, a classe `PersonServicePublisher` torna o serviço disponivel.
Execute o comando 

    % java br.com.ws.service.PersonServicePublisher
	
##Criando os artefatos do serviço com `wsgen`##
O publicador ainda não tem acesso as classe necessárias para gerar o WSDL, para isso execute o utilitário `wsgen`.

    %\bin>wsgen -cp . br.com.ws.service.PersonServiceImpl -wsdl	
	
##Escrevendo o cliente do serviço##

    %\bin>wsimport -keep -d . -p br.com.ws.service.client http://localhost:9876/personservice?wsdl
	
##Executando o serviço##

Neste exemplo estamos utilizando o cliente também feito em Java.
Implementamos na classe `PersonClient.java` apenas o método `list` que retorna uma lista de objetos de `person`.

	java br.com.ws.service.PersonClient

	Person [SERVICE] [anoNascimento=1829, cidadeNascimento=Ceara, id=1, nome=Jose de Alencar]
	Person [SERVICE] [anoNascimento=1857, cidadeNascimento=Sao Luis, id=2, nome=Aluisio de Azevedo]
	Person [SERVICE] [anoNascimento=1839, cidadeNascimento=Rio de Janeiro, id=3, nome=Machado de Assis]
	Person [SERVICE] [anoNascimento=1908, cidadeNascimento=Rio de Janeiro, id=4, nome=Guimaraes Rosa]	