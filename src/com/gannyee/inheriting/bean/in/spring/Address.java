package com.gannyee.inheriting.bean.in.spring;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-05
 **/
public class Address {

    private String addressLine1, city, state, country;

    public Address(String addressLine1, String city, String state, String country) {
        super();
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return addressLine1 + " " + city + " " + state + " " + country;
    }

}
