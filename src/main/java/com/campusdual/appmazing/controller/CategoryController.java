package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.ICategoryService;
import com.campusdual.appmazing.model.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Para probar este método, abrimos un navegador web y escribimos la dirección: http://localhost:30030/contact

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String testController() { return "Contact controller works!"; }

    @PostMapping
    public String testController(@RequestBody String name) { return "Contact controller works, " + name + "!"; }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod() { return "Contact controller method works!"; }

    @PostMapping(value = "/get")
    public CategoryDTO queryCategory(@RequestBody CategoryDTO categoryDTO) { return this.categoryService.queryCategory(categoryDTO); }

    @GetMapping(value = "/getAll")
    public List<CategoryDTO> queryAllCategories() { return this.categoryService.queryAllCategories(); }

    @PostMapping(value = "/add")
    public int insertCategory(@RequestBody CategoryDTO category) { return this.categoryService.insertCategory(category); }

    @PutMapping(value = "/update")
    public int updateCategory(@RequestBody CategoryDTO category) { return this.categoryService.updateCategory(category); }

    @PostMapping(value = "/delete")
    public int deleteCategory(@RequestBody CategoryDTO category) { return this.categoryService.deleteCategory(category); }

}