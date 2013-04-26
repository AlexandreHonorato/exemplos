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
	<div>
		<s:property value="endereco.logradouro" />
	</div>
	<div>	
		<s:property value="endereco.rua" />
	</div>
	<div>	
		<s:property value="endereco.numero" />
	</div>
	<div>	
		<s:property value="endereco.bairro" />
	</div>	
	<div>	
		<s:property value="endereco.cidade" />
	</div>	
	<div>	
		<s:property value="endereco.estado" />
	</div>	
	
	<div>
		<a href="<s:url action="endereco"/>">Voltar</a>
	</div>
</body>
</html>