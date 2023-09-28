package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.IProductService;
import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dao.ProductDAO;
import com.campusdual.appmazing.model.dto.ProductDTO;
import com.campusdual.appmazing.model.dto.dtopmapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
@Lazy
public class ProductService implements IProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public ProductDTO queryProduct(ProductDTO productDTO) {

        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        return ProductMapper.INSTANCE.toDTO(this.productDAO.getReferenceById(product.getId()));

    }

    @Override
    public List<ProductDTO> queryAllProducts() { return ProductMapper.INSTANCE.toDTOList(productDAO.findAll()); }

    @Override
    public int insertProduct(ProductDTO productDTO) {

        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        this.productDAO.saveAndFlush(product);
        return product.getId();

    }

    @Override
    public int updateProduct(ProductDTO productDTO) { return this.insertProduct(productDTO); }

    @Override
    public int deleteProduct(ProductDTO productDTO) {

        int id = productDTO.getId();
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        this.productDAO.delete(product);
        return id;

    }

}