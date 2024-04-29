package com.example.InventoryManagement1.repository;
import java.util.List;
import com.example.InventoryManagement1.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    @Query(value = "SELECT * FROM inventory WHERE ratings > :ratings", nativeQuery = true)
    List<Inventory> findProductsBasedOnRatings(@Param("ratings") double ratings);

    @Query(value = "SELECT * FROM inventory WHERE items_sold > :itemsSold", nativeQuery = true)
    List<Inventory> findProductsBasedOnItemsSold(long itemsSold);

    @Query(value = "SELECT * FROM inventory WHERE stock > :stock", nativeQuery = true)
    List<Inventory> findProductsBasedOnStock(long stock);

    @Query(value = "SELECT * FROM inventory WHERE revenue_generated > :revenueGenerated", nativeQuery = true)
    List<Inventory> findProductsBasedOnRevenueGenerated(double revenueGenerated);
}
