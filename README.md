# Recruitment Tool

This project is to be used at recruitment fairs.  This project has two purposes.
- The first purpose is open this project on a laptop or tablet so that any potential employee can leave their contact info.
- The second purpose is there is an managemet page for HR and recruiters to pull up those signups and contact them about future employment.


## Authors
- John Steele
- https://www.github.com/johnsteeleprogramming
## Tech Stack

**Client:** HTML, CSS, JavaScript, BootStrap

**Server:** Spring Boot, Java, MySQL, Thymeleaf


## Run Locally

Clone the project

```bash
  git clone https://https://github.com/johnsteeleprogramming/RecruitmentTool/
```
- Run the SQL script 'recruitment_tool_sql_script.sql' in MySQL.
- Once the programming is running locally, there are two components.

**SignUps** In a browser, go to localhost:8080.  Signups can submit their contact info.

**Recruiters** In a browser, go to localhost:8080/admin.  There is login credentials required.  There is a page with signups listed and options to edit, delete, export, email, and send to another program using APIs.  There are many other options as well.
