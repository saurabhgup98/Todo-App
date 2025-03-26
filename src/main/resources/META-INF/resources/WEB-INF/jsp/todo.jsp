<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add Todo Page</title>

    <link href="webjars\bootstrap\5.3.3\css\bootstrap.min.css" rel="stylesheet" />
</head>
<body>
    <div class="container">
        <h1>Enter Todo Details</h1>
        <form:form method="post" modelAttribute="todo">
            <form:input type="text" name="description" path="description"/>
            <button class="btn btn-success">Add</button>
        </form>
    </div>

    <script src="webjars\bootstrap\5.3.3\js\bootstrap.min.js"></script>
    <script src="webjars\jquery\3.6.4\jquery.min.js"></script>

</body>
</html>