<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>README</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style type="text/css">
	a{text-decoration:none;}
</style>
</head>
<body>
<div class="container">
	<div class="mt-2">
		<h1>Bugtracker API</h1> <hr>
	</div>
	<div>
		<p class="lead">BugTracker is a simple REST API built for issue tracking that helps to track and fix bugs quickly.<br>
		API is built using <span class="text-primary">Springboot & Hibernate</span>.</p>
		<p class="text-muted">Note - First request takes some time to restart instance on server and for POST requests user postman API client</p>
		
		 <hr>
	</div>

	<div class="endpoints">
	<h4 class="">REST endpoints and examples</h4>
	<div>
		<P class="text-capitalize">1. get all projects</P>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/projects" target="_blank">https://bugtracker41.herokuapp.com/projects</a>
	</div> <br>
	<div>
		<p class="text-capitalize">2. get individual project</p>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/projects/1" target="_blank">https://bugtracker41.herokuapp.com/projects/1</a>
	</div><hr>
	<div>
		<P class="text-capitalize">3. get all employees</P>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/employees" target="_blank">https://bugtracker41.herokuapp.com/employees</a>
	</div> <br>
	<div>
		<P class="text-capitalize">4. add new employees</P>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/register?firstName=Peter&lastName=Capaldi&email=peter@gmail.com&password=123456&projectId=1" target="_blank">https://bugtracker41.herokuapp.com/register?firstName=Peter&lastName=Capaldi&email=peter@gmail.com&password=123456&projectId=1</a>
	</div> <br>
	<div>
		<P class="text-capitalize">5. validate employee credentials</P>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/login?email=marcus@gmail.com&password=123456" target="_blank">https://bugtracker41.herokuapp.com/login?email=marcus@gmail.com&password=123456</a>
	</div><hr>
	<div>
		<P class="text-capitalize">6. get all tickets</P>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/tickets" target="_blank">https://bugtracker41.herokuapp.com/tickets</a>
	</div> <br>
	<div>
		<P class="text-capitalize">7. get all tickets of an individual project</P>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/projects/1/tickets" target="_blank">https://bugtracker41.herokuapp.com/projects/1/tickets</a>
	</div> <br>
	<div>
		<P class="text-capitalize">8. create new ticket for a project</P>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/projects/1/createTicket?title=creating new ticket &description=testing create ticket endpoint&createdBy=Holsten&assignedTo=&projectId=1&employeeId=4" target="_blank">https://bugtracker41.herokuapp.com/projects/1/createTicket?title=creating new ticket &description=testing create ticket endpoint&createdBy=Holsten&assignedTo=&projectId=1&employeeId=4</a>
	</div> <br>
	<div>
		<P class="text-capitalize">9. get individual ticket by ticket id</P>
		<span class="text-muted">Example - </span> <a href="https://bugtracker41.herokuapp.com/tickets/1">https://bugtracker41.herokuapp.com/tickets/1</a>
	</div><hr>
</div>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</body>
</html>