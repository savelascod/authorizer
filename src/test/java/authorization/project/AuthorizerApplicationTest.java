package authorization.project;

import authorization.project.delegate.contract.IAuthorizerDelegate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit and integration test cases for {@link AuthorizerApplication}
 */
@SpringBootTest
class AuthorizerApplicationTest {

    /**
     * Dependency loading
     */
    @Autowired
    private IAuthorizerDelegate authorizerDelegate;

    /**
     * Class Under Test
     */
    private AuthorizerApplication authorizerApplication;

    @BeforeEach
    public void setUp() {
        authorizerApplication = new AuthorizerApplication(authorizerDelegate);
    }

    @Test
    public void contextLoads() {
        assertNotNull(authorizerDelegate);
    }

}
