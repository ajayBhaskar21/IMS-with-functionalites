package com.example.InventoryManagement1;


import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping("/home/")
    public String home2() {
        return "home";
    }

    @RequestMapping("/add")
    public String addProduct(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";
        return "addProduct";
    }
    @GetMapping("/searchProduct")
    public String searchProduct(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";
        return "searchProductHome";
    }

    @GetMapping("/searchProductById")
    public String searchProductById(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";
        return "searchProductById";
    }

    @GetMapping("/searchProductBasedOnRatings")
    public String searchProductByRatings(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";
        return "searchProductBasedOnRatings";
    }

    @GetMapping("/searchProductBasedOnItemsSold")
    public String searchProductBasedOnItemsSold(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";
        return "searchProductBasedOnItemsSold";
    }

    @GetMapping("/searchProductByStock")
    public String searchProductByStock(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";
        return "searchProductByStock";
    }

    @GetMapping("/searchProductByRevenueGenerated")
    public String searchProductByRevenueGenerated(HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";
        return "searchProductByRevenueGenerated";
    }

}
