<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

     <title> Student Registration Form </title>

</head>

<body>

<form:form action="processForm" modelAttribute="student">

 First Name: <form:input path="firstName"/>

 <br><br>

  Last Name: <form:input path="lastName"/>

  <br><br>
  Country: <form:select path="country">

    <form:options items="${student.countryOptions}" />

</form:select>

<br><br>

 Gender:
 male <form:radiobutton path="gender" value="male" />
  female <form:radiobutton path="gender" value="female" />

<br><br>
 operating Systems:
 Linux <form:checkbox path="operatingSystems" value="Linux" />
  MAC<form:checkbox path="operatingSystems" value="Mac OS" />
   MS Windows <form:checkbox path="operatingSystems" value="MS Window" />


<br><br>

  <input type="submit" value="Submit" />


</form:form>


</body>


</html>