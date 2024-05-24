package aut.utcluj.isp.ex2;

import java.util.Objects;

public class OnlineShop extends Shop {
    private String webAddress;

    // Constructor with name, city, and webAddress parameters
    public OnlineShop(String name, String city, String webAddress) {
        super(name, city);
        this.webAddress = webAddress;
    }

    // Getter for webAddress
    public String getWebAddress() {
        return webAddress;
    }

    // Overriding toString method to include webAddress
    @Override
    public String toString() {
        return super.toString() + " Web address: " + webAddress;
    }
}