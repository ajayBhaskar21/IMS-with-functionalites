package com.example.InventoryManagement1.service;
import java.util.List;
import com.example.InventoryManagement1.model.Inventory;
import com.example.InventoryManagement1.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public void addProduct(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

    public List<Inventory> getProductsInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getProductsInventoryById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public Inventory updateProductsInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public void deleteProductsInventoryBasedOnId(Long id) {
        inventoryRepository.deleteById(id);
    }

    public List<Inventory> getProductsInventoryBasedOnRatings(double ratings) {
        return inventoryRepository.findProductsBasedOnRatings(ratings);
    }

    public List<Inventory> getProductsInventoryBasedOnItemsSold(long itemsSold) {
        return inventoryRepository.findProductsBasedOnItemsSold(itemsSold);
    }

    public List<Inventory> getProductsInventoryBasedOnStock(long stock) {
        return inventoryRepository.findProductsBasedOnStock(stock);
    }

    public List<Inventory> getProductsInventoryBasedOnRevenueGenerated(double revenueGenerated) {
        return inventoryRepository.findProductsBasedOnRevenueGenerated(revenueGenerated);
    }
}
