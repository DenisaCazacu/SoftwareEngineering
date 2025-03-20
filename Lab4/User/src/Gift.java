public class Gift {
    final String id;
    String name;
    float price;
    float contributedAmount;

    public Gift(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.contributedAmount = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getContributedAmount() {
        return contributedAmount;
    }

    public void setContributedAmount(float contributedAmount) {
        this.contributedAmount = contributedAmount;
    }

    public boolean addContribution(float amount) {
        if (contributedAmount + amount > price) {
            System.out.println("Contributed amount is greater than price");
            return false;
        } else {
            contributedAmount += amount;
            return true;
        }
    }
}
