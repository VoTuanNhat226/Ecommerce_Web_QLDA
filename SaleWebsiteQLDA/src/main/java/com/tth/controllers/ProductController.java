/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tth.controllers;

import com.tth.pojo.Product;
import com.tth.services.BrandService;
import com.tth.services.CategoryService;
import com.tth.services.ProductService;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author tongh
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService prodService;

    @Autowired
    private CategoryService cateService;
    
    @Autowired
    private BrandService brandService;

    @GetMapping("/products")
    public String createView(Model model) {
        model.addAttribute("product", new Product());
        return "products";
    }

    @PostMapping("/products")
    public String createProduct(@ModelAttribute(value = "product") @Valid Product p,
            BindingResult rs, @RequestParam List<MultipartFile> image) {
        if (!rs.hasErrors()) {
            try {
                //p.setCreatedDate(new Date());
                this.prodService.addOrUpdate(p, image);
                return "redirect:/";
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }

        return "products";
    }

    @GetMapping("/products/{productId}")
    public String updateView(Model model, @PathVariable(value = "productId") int id) {
        model.addAttribute("product", this.prodService.getProductById(id));

        return "products";
    }
}
