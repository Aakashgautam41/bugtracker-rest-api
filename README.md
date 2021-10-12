# Bugtracker API

BugTracker is a simple REST API built for issue tracking that helps to track and fix bugs quickly.

API is built using ```Springboot``` & ```Hibernate```.

Note - First request takes some time to restart instance on the server and for POST requests use postman API client.


## REST endpoints and examples

1. Get All Projects - https://bugtracker41.herokuapp.com/projects

2. Get Individual Project - https://bugtracker41.herokuapp.com/projects/1

3. Get All Employees - https://bugtracker41.herokuapp.com/employees

4. Add New Employees - https://bugtracker41.herokuapp.com/register?firstName=Peter&lastName=Capaldi&email=peter@gmail.com&password=123456&projectId=1

5. Validate Employee Credentials - https://bugtracker41.herokuapp.com/login?email=marcus@gmail.com&password=123456

6. Get All Tickets - https://bugtracker41.herokuapp.com/tickets

7. Get All Tickets Of An Individual Project - https://bugtracker41.herokuapp.com/projects/1/tickets

8. Create New Ticket For A Project - https://bugtracker41.herokuapp.com/projects/1/createTicket?title=creating new ticket &description=testing create ticket endpoint&createdBy=Holsten&assignedTo=&projectId=1&employeeId=4

9. Get Individual Ticket By Ticket Id - https://bugtracker41.herokuapp.com/tickets/1 
