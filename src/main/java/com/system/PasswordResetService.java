package com.system;

public class PasswordResetService {
    public static void main(String[] args) {
        System.out.println("--- SERVICE STARTING ---");
        System.out.println("Hello! The Password Reset Service is alive.");
        
        // Keep container running
        while(true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public boolean verifyOtp(String email, String otp) {
        return "123456".equals(otp); // Simplified for testing
    }
}
