package com.example.baitapbai10.controller;
import com.example.baitapbai10.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "dskh", urlPatterns = "/dskh")
public class CustomerController extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ServletException, IOException {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("Son Tung", "5-7-1994", "Thai Binh", "https://vcdn1-giaitri.vnecdn.net/2023/05/05/son-tung-mmw-2824-1683249980.jpg?w=460&h=0&q=100&dpr=2&fit=crop&s=UgjiejW8r8KPLxwgK2vOdg"));
        list.add(new Customer("Ho Quang Hieu", "20-9-1983", "Dak Lak", "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTwsgjxQL9KnyQJ6kXMH6jLtsspv_2xsm_mDhhN00TnI-IEvQwA"));
        list.add(new Customer("Ngo Kien Huy", "29-6-1988", "Ho Chi Minh", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwSkuXipyMOJVtoJ2T72KQrMl5v-yyM1T92T_TrMXhzZlxtgXi"));
        list.add(new Customer("Truong giang", "20-4-1983", "Ho Chi Minh", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTu2tPOiCtHTNuFl6jsuh1M_ZgSwVBFSLv37IfIm4hbTAcbjwY1"));
        request.setAttribute("list", list);
        request.getRequestDispatcher("danhsach.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){}

}
