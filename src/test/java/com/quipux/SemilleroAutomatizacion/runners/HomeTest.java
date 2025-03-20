package com.quipux.SemilleroAutomatizacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/home.feature",
        glue = {"com.quipux.SemilleroAutomatizacion"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class HomeTest {
}
