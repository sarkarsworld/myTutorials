<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Hello World Application in JSF</title>
</head>
<body>
<f:view>
<h:panelGrid border="0" cellpadding="2" cellspacing="2">
<h:outputText
value="Welcome #{helloWorldJSFManagedBean.userFormView.userName} !"></h:outputText>
<h:outputText
value="This is our first Hello World JSF Web Application."></h:outputText>
</h:panelGrid>
</f:view>
</body>
</html>