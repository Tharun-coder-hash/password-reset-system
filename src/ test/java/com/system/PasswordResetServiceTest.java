package com.system;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordResetServiceTest {
    @Test
    public void testInvalidOtpFails() {
        PasswordResetService service = new PasswordResetService();
        service.generateOtp("user@example.com", "123456");
        
        // Testing invalid OTP
        boolean result = service.resetPassword("user@example.com", "wrong-otp", "newPass123");
        assertFalse(result, "Reset should fail with an incorrect OTP.");
    }
}
