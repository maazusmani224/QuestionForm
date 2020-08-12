<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Question Submission TF</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:300,400,700">
    <link rel="stylesheet" href="assets/css/pikaday.min.css">
</head>

<body>
    <nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-white portfolio-navbar gradient">
        <div class="container"><a class="navbar-brand logo">Question Submission</a></div>
    </nav>
    <main class="page hire-me-page">
        <section class="portfolio-block hire-me">
            <div class="container">
                <div class="heading">
                    <h3>QUESTION</h3>
                </div>
                <form method="post" action="Submit.do">
                <input type="hidden" name="name" value="<% out.print(request.getParameter("name"));%>">
                <input type="hidden" name="email" value="<% out.print(request.getParameter("email"));%>">
                <input type="hidden" name="questype" value="<% out.print(request.getParameter("questype"));%>">
                <input type="hidden" name="quesdiff" value="<% out.print(request.getParameter("quesdiff"));%>">
                    <div class="form-group"><label>Question</label><textarea class="form-control" name="ques" required></textarea></div>
                    <div class="form-group"><label>Correct Answer</label>
                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-1" name="corrans" value="true" required><label class="form-check-label" for="formCheck-1">True</label></div>
                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-2" name="corrans" value="false" required><label class="form-check-label" for="formCheck-2">False</label></div>
                    </div>
                    <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Submit</button></div>
                </form>
            </div>
        </section>
    </main>
</body>

</html>