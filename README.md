# spring-mvc-jdbc
Software Architecture, Design Patterns in Spring 

### Prerequisites
- Spring Tool Suite
- Apache Tomcat 8.0.43

### Installing

#### Database
Create a database name "assignment3"  
Create a table as follow;
```  
CREATE TABLE `assignment3`.`pattern` ( `ID` INT UNSIGNED NOT NULL AUTO_INCREMENT , `name` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL , `group` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL , `implementation` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL , PRIMARY KEY (`ID`)) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_bin;
```

### How to run
1. Run Tomcat server.

2. Run XAMPP, start Apache and MySQL modules.

3. Open URL http://localhost:8080/assignment3/


### References
* [Spring 4 MVC+Apache Tiles 3 Example](http://websystique.com/springmvc/spring-4-mvc-apache-tiles-3-annotation-based-example/)
* [How to setup tomcat with Eclipse](http://websystique.com/misc/how-to-setup-tomcat-with-eclipse/)
