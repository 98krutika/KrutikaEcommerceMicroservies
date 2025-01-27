package com.krutika.inventoryservice.controller;

import com.krutika.inventoryservice.dto.InventoryResponse;
import com.krutika.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/sku-code/{skuCode}")
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String>skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
