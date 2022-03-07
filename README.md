# MicroServer

# 💻 Built With
* [Maven](https://maven.apache.org) - Project Management tool
* [Apache Derby](https://db.apache.org/derby/) - Relational Database
* [JUnit5](https://junit.org/junit5/docs/current/user-guide/) - Testing Framework
* [Spring boot](https://spring.io/projects/spring-boot) - Microservice

# Dependencies 
```
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
  </dependency>

  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
  </dependency>
  
  <!-- https://mvnrepository.com/artifact/org.apache.derby/derby -->
  <dependency>
    <groupId>org.apache.derby</groupId>
    <artifactId>derby</artifactId>
    <version>10.14.2.0</version>
    <scope>test</scope>
  </dependency>

  <!-- https://mvnrepository.com/artifact/org.apache.derby/derbyclient -->
  <dependency>
    <groupId>org.apache.derby</groupId>
    <artifactId>derbyclient</artifactId>
    <version>10.13.1.1</version>
  </dependency>
 </dependencies>
```
# Derby Connection 
    public static Connection getConnection(){
        String dbURL = "jdbc:derby://localhost:1527/data/realEstate2021;create=true;user=realEstate;password=pwd1234";
        Connection conn = null;


        try {
            conn = DriverManager.getConnection(dbURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
