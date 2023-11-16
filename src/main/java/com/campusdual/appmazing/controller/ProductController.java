package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.IProductService;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public String testController() { return "Product controller works!"; }

    @PostMapping
    public String testController (@RequestBody String name) { return "Product controller works!, " + name; }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod() { return "Product controller method works!"; }

    @PostMapping(value = "/get")
    public ProductDTO queryProduct (@RequestBody ProductDTO product) { return this.productService.queryProduct(product); }

    @GetMapping(value = "/getAll")
    public List<ProductDTO> queryAllProducts() { return this.productService.queryAllProducts(); }

    @PostMapping(value = "/add")
    public int insertProduct (@RequestBody ProductDTO product) { return this.productService.insertProduct(product); }

    @PutMapping(value = "/update")
    public int updateProduct (@RequestBody ProductDTO product) { return this.productService.updateProduct(product); }

    @PostMapping(value = "/delete")
    public int deleteProduct (@RequestBody ProductDTO product) { return this.productService.deleteProduct(product); }

    @PutMapping(value = "/buy")
    public int buyProduct (@RequestBody ProductDTO productDTO) { return this.productService.buyProduct(productDTO, 5); }

    @DeleteMapping(value = "/buyAndShowPrice")
    public BigDecimal buyAndShow (@RequestBody ProductDTO productDTO) {

        int quantity = 5;
        this.productService.buyProduct(productDTO, quantity);
        return this.productService.calculateTotalPrice(productDTO, quantity);

    }

}