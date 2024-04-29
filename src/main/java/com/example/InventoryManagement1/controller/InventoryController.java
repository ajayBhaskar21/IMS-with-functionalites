package com.example.InventoryManagement1.controller;

import com.example.InventoryManagement1.service.InventoryService;
import com.example.InventoryManagement1.model.Inventory;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
@Controller
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @PostMapping("/addToDB")
    public String addToDB(Inventory inventory) {

        inventoryService.addProduct(inventory);
        return "addSuccess";
    }

    @GetMapping("/productsInventory")
    public String displayProductsInventory(Model model, HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";

        List<Inventory> products = inventoryService.getProductsInventory();
        model.addAttribute("products", products);
        return "allProductsInventory";
    }

    @GetMapping("/editProductDetails/{id}/")
    public String editProductDetails(@PathVariable("id") Long id, Model model, HttpSession session){
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";

        Inventory inventory = inventoryService.getProductsInventoryById(id);

        if (inventory != null) {
            model.addAttribute("product", inventory);
        }
        return "updateProduct";
    }

    @PostMapping("/editProductDetails/{id}/update")
    public String updateProduct(@PathVariable("id") Long id, Inventory inventory) {
        Inventory existingProduct = inventoryService.getProductsInventoryById(id);
        System.out.println("Product : " + id +existingProduct.getId() + existingProduct.getProductName());
        if (existingProduct != null) {
            // user.setId(id);
            Inventory updatedProductInventory = inventoryService.updateProductsInventory(inventory);
            if (updatedProductInventory != null) {
                return "updateSuccess";
            }
        } else {
            System.out.println("product id not found");

        }
        return "error";
    }

    // @GetMapping("")

    @GetMapping("/delete/{id}/")
    public String deleteProduct(@PathVariable("id") Long id, HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";

        inventoryService.deleteProductsInventoryBasedOnId(id);
        return "deleteSuccess";
    }
    @PostMapping("/search")
    public String searchProduct(@RequestParam("id") Long id, Model model) {
        Inventory product = inventoryService.getProductsInventoryById(id);
        model.addAttribute("product", product);
        return "searchProductById";
    }

    @PostMapping("/searchProductBasedOnRatings")
    public String searchProductBasedOnRatings(@RequestParam("ratings") double ratings,Model model) {

        List<Inventory> products = inventoryService.getProductsInventoryBasedOnRatings(ratings);
        model.addAttribute("products", products);
        return "searchProductBasedOnRatings";
    }

    @PostMapping("/searchProductBasedOnItemsSold")
    public String searchProductBasedOnItemsSold(@RequestParam("itemsSold") long itemsSold,Model model) {

        List<Inventory> products = inventoryService.getProductsInventoryBasedOnItemsSold(itemsSold);
        model.addAttribute("products", products);
        return "searchProductBasedOnItemsSold";
    }

    @PostMapping("/searchProductByStock")
    public String searchProductByStock(@RequestParam("stock") long stock,Model model) {

        List<Inventory> products = inventoryService.getProductsInventoryBasedOnStock(stock);
        model.addAttribute("products", products);
        return "searchProductByStock";
    }

    @PostMapping("/searchProductByRevenueGenerated")
    public String searchProductByRevenueGenerated(@RequestParam("revenueGenerated") double revenueGenerated,Model model) {

        List<Inventory> products = inventoryService.getProductsInventoryBasedOnRevenueGenerated(revenueGenerated);
        model.addAttribute("products", products);
        return "searchProductByRevenueGenerated";
    }

}
