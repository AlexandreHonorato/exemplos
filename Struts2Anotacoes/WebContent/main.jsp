<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Valores para calcular</title>
</head>
<body>
	<s:form action="calculator!calculate" method="post">
		<s:textfield label="Montante Inicial" name="request.ammount" />
		<s:textfield label="Numero de parcelas"
			name="request.numberOfParcels" />
		<s:textfield label="Juros %" name="request.interest" />
		<s:submit />
	</s:form>
</body>
</html>