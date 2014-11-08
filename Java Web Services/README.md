#Java Web Services#

Servi�o Web em Java de um CRUD baseado em SOAP.

##Criando o banco de dados##

A classe `CreateSchemaSample.java` o schema do banco deve ser criado.

    % java br.com.ws.config.CreateSchemaSample  
	
A classe `SampleDAO.java` popula dados b�sicos para teste na tabela `person`.	

    % java br.com.ws.config.SampleDAO
	
##Publicando o Servi�o##

Depois de criado o SEI(Service Endpoint Interface), classe onde esta registrado os m�todos que ir�o ser diponilizados para os clientes do Web Service, a classe `PersonServicePublisher` torna o servi�o disponivel.
Execute o comando 

    % java br.com.ws.service.PersonServicePublisher
	
##Criando os artefatos do servi�o com `wsgen`##
O publicador ainda n�o tem acesso as classe necess�rias para gerar o WSDL, para isso execute o utilit�rio `wsgen`.

    %\bin>wsgen -cp . br.com.ws.service.PersonServiceImpl -wsdl	
	
##Escrevendo o cliente do servi�o##

    %\bin>wsimport -keep -d . -p br.com.ws.service.client http://localhost:9876/personservice?wsdl
	
##Executando o servi�o##

Neste exemplo estamos utilizando o cliente tamb�m feito em Java.
Implementamos na classe `PersonClient.java` apenas o m�todo `list` que retorna uma lista de objetos de `person`.

	java br.com.ws.service.PersonClient

	Person [SERVICE] [anoNascimento=1829, cidadeNascimento=Ceara, id=1, nome=Jose de Alencar]
	Person [SERVICE] [anoNascimento=1857, cidadeNascimento=Sao Luis, id=2, nome=Aluisio de Azevedo]
	Person [SERVICE] [anoNascimento=1839, cidadeNascimento=Rio de Janeiro, id=3, nome=Machado de Assis]
	Person [SERVICE] [anoNascimento=1908, cidadeNascimento=Rio de Janeiro, id=4, nome=Guimaraes Rosa]	