/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tth.services.impl;

import com.tth.pojo.Brand;
import com.tth.repositories.BrandRepository;
import com.tth.services.BrandService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tongh
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepo;
    
    @Override
    public List<Brand> getBrands() {
        return this.brandRepo.getBrands();
    }

    @Override
    public Brand getBrandgoryById(int id) {
        return this.brandRepo.getBrandgoryById(id);
    }

}
