<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html xmlns:form="http://www.w3.org/1999/html">

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Registration Form</title>
    <style>
        .error {color:red}
    </style>
</head>
<body>
    <p>Fill Out the form. Asterick(*) means required</p>

    <form:form action="/processForm" modelAttribute="customer">

       First Name: <form:input path="firstName"/>
        <br><br>

        Last Name (*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>

        <br><br>

        Free Passes:<form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>

        <br><br>

        Postal Code:<form:input path="postalCode"/>
        <form:error path="postalCode" cssClass="error"/>

        <br><br>

        Course Code:<form:input path="courseCode"/>
        <form:error path="courseCode" cssClass="error"/>

        <input type="submit" value="Submit">

    </form:form>
</body>
</html>