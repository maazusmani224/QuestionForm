<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Question Submission MCQ</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:300,400,700">
</head>

<body>
    <nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-white portfolio-navbar gradient">
        <div class="container"><a class="navbar-brand logo" href="#">Question Submission</a></div>
    </nav>
    <main class="page hire-me-page">
        <section class="portfolio-block hire-me">
            <div class="container">
                <div class="heading">
                    <h2>Question</h2>
                </div>
                <form method="post" action="Submit.do">
                <input type="hidden" name="name" value="<% out.print(request.getParameter("name"));%>">
                <input type="hidden" name="email" value="<% out.print(request.getParameter("email"));%>">
                <input type="hidden" name="questype" value="<% out.print(request.getParameter("questype"));%>">
                <input type="hidden" name="quesdiff" value="<% out.print(request.getParameter("quesdiff"));%>">
                    <div class="form-group"><label>Question</label><textarea class="form-control" name="ques" required></textarea><label>Option a</label><input class="form-control" type="text" name="opta" required><label>Option b</label><input class="form-control" type="text" name="optb" required><label>Option c</label>
                        <input class="form-control" type="text" name="optc" required><label>Option d</label><input class="form-control" type="text" name="optd" required></div>
                    <div class="form-group"><label>Correct Option</label>
                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-1" name="corrans" value="a" required><label class="form-check-label" for="formCheck-1">a</label></div>
                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-2" name="corrans" value="b" required><label class="form-check-label" for="formCheck-2">b</label></div>
                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-3" name="corrans" value="c" required><label class="form-check-label" for="formCheck-3">c</label></div>
                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-4" name="corrans" value="d" required><label class="form-check-label" for="formCheck-4">d</label></div>
                    </div>
                    <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Submit</button></div>
                </form>
            </div>
        </section>
    </main>

</body>

</html>