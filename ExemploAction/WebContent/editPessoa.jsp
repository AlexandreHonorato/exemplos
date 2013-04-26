<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Editando</title>
</head>
<body>
	<s:form action="pessoa!save" namespace="/">
		<s:textfield label="Nome" name="pessoa.nome" />
		<s:textfield label="Data Nascimento" name="pessoa.dataNascimento" value="%{getText('format.date',{pessoa.dataNascimento})}" />		
		<s:textfield label="Cota" name="pessoa.cota"/> 
		<s:submit />
	</s:form>
</body>
</html>