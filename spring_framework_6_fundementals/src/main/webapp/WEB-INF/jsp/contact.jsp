<%@ page contentType="text/html; ISO-8859-1" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
    <body>
        <h1>Registration</h1>
        <form:form modelAttribute="contact">
            <table>
                <tr>
                    <td>
                        First Name:
                    </td>
                    <td>
                        <form:input path="firstName" />
                    </td>
                        
                </tr>
                <tr>
                    <td>
                        Last Name:
                    </td>
                    <td>
                        <form:input path="lastName" />
                    </td>
                        
                </tr>
                <tr>
                    <td>
                        Phone Number:
                    </td>
                    <td>
                        <form:input path="phoneNumber" />
                    </td>
                        
                </tr>
                <tr>
                    <td>
                        Email:
                    </td>
                    <td>
                        <form:input path="email" />
                    </td>
                        
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add Contact">
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>