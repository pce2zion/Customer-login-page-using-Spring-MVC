<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello World - Input Form</title>
</head>
<body>
    <form action="processFormVersionThree" method="GET">
        <label  for="studentName">Name:</label>
        <input

                type="text"
                id="studentName"
               name="studentName"
<%--                the name attribute above, is going o be used as the model
name attribute for binding--%>
               placeholder="Enter name"
        > <br><br>
<!--        <button>Submit</button>-->
        <input type="submit">

    </form>

</body>
</html>