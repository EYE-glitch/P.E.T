import java.time.LocalDate;

public class Expense {

    private String name;
    private double amount;
    private LocalDate date;
    private String category;

    // Constructor
    public Expense(String name, double amount, LocalDate date, String category) {
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return "Expense{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", category='" + category + '\'' +
                '}';
    }
}