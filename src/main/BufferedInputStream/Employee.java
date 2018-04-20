package main.BufferedInputStream;

public abstract class Employee {
    private String name;
    private String address;
    private int num;
    public  abstract double computePay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "huhu";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = 520;
    }
}
