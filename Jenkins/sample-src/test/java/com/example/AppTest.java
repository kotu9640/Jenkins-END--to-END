// Unit Test Class
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testApp() {
        SampleApplication app = new SampleApplication();
        assertNotNull(app);
    }
}