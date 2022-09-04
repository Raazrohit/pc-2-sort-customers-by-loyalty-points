package com.jap.customers;


import java.util.*;

public class CustomerService {
    // This method returns the customer's loyalty points in sorted order
public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator){
    List<Integer> integerList = new ArrayList<>();
    Collections.sort(customerList,loyaltyPointComparator);
    Iterator<Customer> iterator = customerList.iterator();
    while(iterator.hasNext()){
        integerList.add(iterator.next().getLoyaltyPoints());
    }
    return integerList;
}

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        List<Customer>customerList = new ArrayList<>();
        customerList.add(new Customer(1101,"Tara","Female",true,"Austin",123));
        customerList.add(new Customer(5242,"Sam","Male",false,"Denver",112));
        customerList.add(new Customer(1105,"Raynold","Gay",true,"London",420));
        customerList.add(new Customer(1008,"sash","Female",true,"Berlin",113));
    }
}
