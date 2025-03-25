class Email {
    private String[] emails = new String[100]; 
    private int count = 0; 
    private boolean isDuplicate(String email) {
        for (int i = 0; i < count; i++) {
            if (emails[i].equals(email)) {
                return true;
            }
        }
        return false;
    }
    public void addEmail(String email) {
        if (isDuplicate(email)) {
            System.out.println("This email is already saved: " + email);
        } else {
            if (count < emails.length) {
                emails[count] = email;
                count++;
                System.out.println("Email added successfully: " + email);
            } else {
                System.out.println("Storage is full. Cannot add more emails.");
            }
        }
    }
    public void displayEmails() {
        if (count == 0) {
            System.out.println("No emails saved.");
        } else {
            System.out.println("Saved emails:");
            for (int i = 0; i < count; i++) {
                System.out.println(emails[i]);
            }
        }
    }

    public static void main(String[] args) {
        Email emailManager = new Email();
        String[] testEmails = {
            "user1@example.com",
            "user2@example.com",
            "user1@example.com",
            "user3@example.com",
            "user4@example.com",
            "user2@example.com"  
        };
        for (String email : testEmails) {
            emailManager.addEmail(email);
        }
        emailManager.displayEmails();
    }
}
