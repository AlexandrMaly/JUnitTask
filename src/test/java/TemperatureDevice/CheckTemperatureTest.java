package TemperatureDevice;

import org.junit.jupiter.api.*;
import Exception.TemperatureException;

import static org.junit.jupiter.api.Assertions.*;

class CheckTemperatureTest {

    CheckTemperature checkTemperature;

    @BeforeEach
    void setUp() {
        checkTemperature = new CheckTemperature();
    }

    @Test
    @DisplayName("Test if device operates at normal temperature.")
    void testIfDeviceOperatesAtNormalTemperature() {
        assertDoesNotThrow(() -> checkTemperature.checkTemperature(20),
                "An exception occurred at normal temperature.");
    }

    @Test
    @DisplayName("Test if device throws exception at low temperature.")
    void testIfDeviceThrowsExceptionAtLowTemperature() {
        assertThrows(TemperatureException.class, () -> checkTemperature.checkTemperature(-15),
                "No exception was thrown at low temperature.");
    }

    @Test
    @DisplayName("Test if device throws exception at high temperature.")
    void testIfDeviceThrowsExceptionAtHighTemperature() {
        assertThrows(TemperatureException.class, () -> checkTemperature.checkTemperature(40),
                "No exception was thrown at high temperature.");
    }

    @Test
    @DisplayName("Test if device operates at marginal low temperature.")
    void testIfDeviceOperatesAtMarginalLowTemperature() {
        assertDoesNotThrow(() -> checkTemperature.checkTemperature(-10),
                "An exception occurred at normal temperature.");
    }
    @Test
    @DisplayName("Test if device operates at marginal high temperature.")
    void testIfDeviceOperatesAtMarginalHighTemperature() {
        assertDoesNotThrow(() -> checkTemperature.checkTemperature(35),
                "An exception occurred at normal temperature.");
    }

    @AfterEach
    void tearDown() {
        checkTemperature = null;
    }

}