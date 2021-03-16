package authorization.project;

import authorization.project.delegate.contract.IAuthorizerDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Application
 */
@Slf4j
@SpringBootApplication
public class AuthorizerApplication implements CommandLineRunner {

    /**
     * instance of
     */
    private final IAuthorizerDelegate authorizerDelegate;

    /**
     * Constructor with autowired dependencies
     */
    @Autowired
    public AuthorizerApplication(IAuthorizerDelegate authorizerDelegate) {
        this.authorizerDelegate = authorizerDelegate;
    }

    /**
     * Spring boot initializer method
     *
     * @param args -> Initialization arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(AuthorizerApplication.class, args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run(String... args) {
        authorizerDelegate.performActions();
    }
}
