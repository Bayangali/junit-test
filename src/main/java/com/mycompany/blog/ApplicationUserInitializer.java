package com.mycompany.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class ApplicationUserInitializer implements CommandLineRunner {
    private final ApplicationUserRepository applicationUserRepository;
    private Logger logger = LoggerFactory.getLogger(ApplicationUser.class);

    public ApplicationUserInitializer(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        applicationUserRepository.saveAll(
                List.of(
                        new ApplicationUser("duke"),
                        new ApplicationUser("github"),
                        new ApplicationUser("actions")
                ));
        logger.info("Successfully initialized default application user");
    }
}
