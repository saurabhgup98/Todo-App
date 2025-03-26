<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Document</title>

    <link href="webjars\bootstrap\5.3.3\css\bootstrap.min.css" rel="stylesheet" />
</head>
<body>
    <div class="container">
        <div class="">Your todos are </div>
        <table class="table">
            <thead>
                <tr>
                    <th>id</th>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>is Done?</th>
                </tr>
            </thead>
            <body>
              <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                <tr>
              </c:forEach>
            </body>
        </table>
        <a href="add-todo" class="btn btn-success">Add Todo</a>

    </div>

    <script src="webjars\bootstrap\5.3.3\js\bootstrap.min.js"></script>
    <script src="webjars\jquery\3.6.4\jquery.min.js"></script>

</body>
</html>