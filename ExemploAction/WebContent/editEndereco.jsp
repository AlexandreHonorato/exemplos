<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Endereço</title>
</head>
<body>
	<s:form action="endereco!save" namespace="/" >
		<s:select label="Logradouro" 
				name="endereco.logradouro" headerKey="-1"
				headerValue="Selecione logradouro" list="#{'Rua':'Rua', 'Avenida':'Av', 'Praca':'Praca'}"
				value="endereco.logradouro" />	
		<s:textfield label="Rua" name="endereco.rua" />
		<s:textfield label="Numero" name="endereco.numero" />
		<s:textfield label="Bairro" name="endereco.bairro" />
		<s:textfield label="Cidade" name="endereco.cidade" />
		<s:textfield label="Estado" name="endereco.estado" />
		<s:submit />
	</s:form>
</body>
</html>