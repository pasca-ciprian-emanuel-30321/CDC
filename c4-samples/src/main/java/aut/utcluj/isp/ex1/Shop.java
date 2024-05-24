package aut.utcluj.isp.ex1;

import java.util.Objects;

public class Shop {
    private String name;
    private String city;

    // Constructor with name and city parameters
    public Shop(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Constructor with only name parameter, city is set to an empty string
    public Shop(String name) {
        this.name = name;
        this.city = "";
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Overriding equals method to compare Shop objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Shop shop = (Shop) obj;
        return Objects.equals(name, shop.name) &&
                Objects.equals(city, shop.city);
    }

    // Overriding toString method to return the shop info
    @Override
    public String toString() {
        return "Shop: " + name + " City: " + city;
    }
}
