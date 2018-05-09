<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World Example In JSF Application</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:panelGrid border="0" cellpadding="2" cellspacing="2">
				<h:outputText>Your Good Name :</h:outputText>
				<h:inputText
					value="#{helloWorldJSFManagedBean.userFormView.userName}"></h:inputText>
			</h:panelGrid>
			<h:panelGroup style="text-align:center;">
				<h:commandButton value="Show Welcome Note" type="submit"
					action="welcomePage"></h:commandButton>
			</h:panelGroup>
		</h:form>
	</f:view>
</body>
</html>