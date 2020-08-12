<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
<title>Question Submission Info</title>
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700">
<script>
	function validateForm() {
		var x = document.forms["quesinfo"]["questype"].value;
		if (x == "") {
			alert("Question Type must be filled out");
			return false;
		}
	}
</script>
</head>

<body>
	<nav
		class="navbar navbar-dark navbar-expand-lg fixed-top bg-white portfolio-navbar gradient">
		<div class="container">
			<a class="navbar-brand logo" href="#">Question Submission</a>
		</div>
	</nav>
	<main class="page hire-me-page">
		<section class="portfolio-block hire-me">
			<div class="container">
				<div class="heading">
					<h2>Question Info</h2>
				</div>
				<form method="post" action="GetQues.do" name="quesinfo"
					onsubmit='return validateForm()'>
					<div class="form-group">
						<label>Name</label><input class="form-control" type="text"
							name="name" required>
					</div>
					<div class="form-group">
						<label>E-mail</label><input class="form-control" type="email"
							name="email" required>
					</div>
					<div class="form-group">
						<label>Question Type:</label>
						<div class="form-check">
							<input class="form-check-input" type="radio" id="formCheck-1"
								name="questype" value="mcq" required><label
								class="form-check-label" for="formCheck-1">MCQ</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" id="formCheck-2"
								name="questype" value="tf" required><label
								class="form-check-label" for="formCheck-2">True/False</label>
						</div>
					</div>
					<div class="form-group">
						<label>Question Difficulty:</label>
						<div class="form-check">
							<input class="form-check-input" type="radio" id="formCheck-3"
								name="quesdiff" value="easy" required><label
								class="form-check-label" for="formCheck-3">Easy</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" id="formCheck-4"
								name="quesdiff" value="medium" required><label
								class="form-check-label" for="formCheck-4">Medium</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" id="formCheck-5"
								name="quesdiff" value="hard" required><label
								class="form-check-label" for="formCheck-5">Hard</label>
						</div>
					</div>
					<div class="form-group">
						<button class="btn btn-primary btn-block" type="submit">Next</button>
					</div>
				</form>
			</div>
		</section>
	</main>
</body>

</html>