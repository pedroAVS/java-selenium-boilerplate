package io.mb.oneweb.java.selenium.framework.cucumber;

import io.mb.oneweb.java.selenium.framework.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(
        classes = Application.class)
@SpringBootTest
public abstract class SpringTest {}
