public class Admin extends User {
    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void handleDisputes() {
        System.out.println("Handled disputes!");
    }
    public void manageUsers(){
        System.out.println("Managed Users!");
    }
    public void monitorTransactions(){
        System.out.println("Monitored Transactions!");
    }
    public void configurePlatformSettings(){
        System.out.println("Configuring Platform Settings!");
    }
}
