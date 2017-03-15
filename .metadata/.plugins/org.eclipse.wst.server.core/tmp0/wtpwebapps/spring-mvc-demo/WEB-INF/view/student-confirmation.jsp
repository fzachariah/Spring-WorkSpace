<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>Student Application Form</title>
</head>
<body>


The Student is confirmed ${student.firstName } ${student.lastName } ${student.country }

<br><br>

Student: ${student.favoriteLanguage }


<br><br>

Operating Systems
<ul>
<c:forEach var="temp" items="${student.operatingSystems}">
<li> ${temp} </li>
</c:forEach>
</ul>
</body>
</html>