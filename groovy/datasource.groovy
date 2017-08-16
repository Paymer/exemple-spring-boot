package cotisations.groovy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@Grab(group='mysql', module='mysql-connector-java', version='5.1.41')
class DataSourceConfig {
@Bean
public DataSource dataSource() {
DriverManagerDataSource dataSource = new DriverManagerDataSource();
dataSource.setDriverClassName("com.mysql.jdbc.Driver");
dataSource.setUrl("jdbc:mysql://localhost:3306/sirh-paie?useSSL=false");
dataSource.setUsername("root");
dataSource.setPassword("");
return dataSource;
}
}