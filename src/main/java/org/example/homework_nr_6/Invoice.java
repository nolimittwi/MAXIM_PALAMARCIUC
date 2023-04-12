package org.example.homework_nr_6;
public class Invoice {
    private String model;
    private String description;
    private int quantity;
    private double cost;

    public Invoice(String model, String description, int quantity, double cost) {
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0){
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0){
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }
    public double getAmount(){
            return quantity*cost;

        }
    public void printResult(){
        System.out.println(getAmount());
    }

}