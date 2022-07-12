package br.com.pehenmo.postgres.poc.um.postgrespocum;

import br.com.pehenmo.postgres.poc.um.postgrespocum.audit.AuditAwareImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAware")
public class PostgresPocUmApplication {

	@Bean
	public AuditAwareImpl auditAware(){
		return new AuditAwareImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(PostgresPocUmApplication.class, args);
	}

}
