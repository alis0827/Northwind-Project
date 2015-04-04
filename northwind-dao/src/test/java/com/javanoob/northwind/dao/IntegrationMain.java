package com.javanoob.northwind.dao;

import com.javanoob.northwind.domain.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigInteger;

/**
 * Created by ruel on 3/28/15.
 */
public class IntegrationMain {

    public static void main(String[] args) {
        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");

        EmpolyeeRepository empRepo = appContext.getBean(EmpolyeeRepository.class);
        ProductsRepository productsRepo = appContext.getBean(ProductsRepository.class);
        SuppliersRepository suppliersRepo = appContext.getBean(SuppliersRepository.class);
        OrdersRepository ordersRepo = appContext.getBean(OrdersRepository.class);
        OrderDetailsRepository orderDetailsRepo = appContext.getBean(OrderDetailsRepository.class);
        CustomersRepository custRepo = appContext.getBean(CustomersRepository.class);
        ShippersRepository shipperRepo = appContext.getBean(ShippersRepository.class);

        EmployeeRecord emp = empRepo.findOne(1);
        ProductsRecord prod = productsRepo.findOne(1);
        SuppliersRecord suppliers = suppliersRepo.findOne(1);
        OrdersRecord order = ordersRepo.findOne(10956);
        OrderDetailsRecord orderDetails = orderDetailsRepo.findOne(11077);
        CustomersRecord cust = custRepo.findOne("EASTC");
        ShippersRecord shipper = shipperRepo.findOne(1);

        System.out.println(emp.toString());
        System.out.println(prod.toString());
        System.out.println(suppliers.toString());
        System.out.println(order.toString());
        System.out.println(orderDetails.toString());
        System.out.println(cust.toString());
        System.out.println(shipper.toString());
    }
}
