package com.exam.controller;

import com.exam.entity.Phone;
import com.exam.service.PhoneService;

import java.io.IOException;
import java.util.logging.Logger;

public class SavePhoneController extends javax.servlet.http.HttpServlet {
    private static Logger LOGGER = Logger.getLogger(PhoneService.class.getSimpleName());

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        String priceStr = request.getParameter("price");
        String description = request.getParameter("description");

        float price = 0;
        try {
            price = Float.parseFloat(priceStr);
        } catch (Exception e) {
        }

        Phone phone = Phone.Builder.aPhone()
                .withId(id)
                .withName(name)
                .withBrand(brand)
                .withPrice((long) price)
                .withDescription(description)
                .build();

        PhoneService phoneService = new PhoneService();
        phoneService.save(phone);
        request.getRequestDispatcher("ok").forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.getRequestDispatcher("/addphone.jsp").forward(request, response);
    }
}
