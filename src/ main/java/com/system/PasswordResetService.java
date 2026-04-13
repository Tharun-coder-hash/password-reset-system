package com.system;

import java.util.HashMap;
import java.util.Map;

public class PasswordResetService {
    private Map<String, String> otpStore = new HashMap<>();

    public void generateOtp(String email, String otp) {
        otpStore.put(email, otp);
    }

    public boolean verifyOtp(String email, String inputOtp) {
        return otpStore.containsKey(email) && otpStore.get(email).equals(inputOtp);
    }

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Password Reset Service is now RUNNING...");
        System.out.println("========================================");

        // This keeps the Docker container running
        try {
            while (true) {
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Service interrupted.");
        }
    }
}
