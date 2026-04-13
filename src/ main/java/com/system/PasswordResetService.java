package com.system;
import java.util.HashMap;
import java.util.Map;

public class PasswordResetService {
    private Map<String, String> otpStore = new HashMap<>();

    public void generateOtp(String email, String otp) {
        otpStore.put(email, otp);
    }

    public boolean resetPassword(String email, String inputOtp, String newPassword) {
        if (otpStore.containsKey(email) && otpStore.get(email).equals(inputOtp)) {
            otpStore.remove(email); // OTP used
            return true;
        }
        return false;
    }
}
