package com.campusdual.appmazing.model.dto.dtopmapper;

import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

// Con esto se genera el archivo target/generated-sources/annotations/com/campusdual/appmazing/model/dto/dtopmapper/ProductMapperImpl.java.

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);

    List<ProductDTO> toDTOList(List<Product> products);

    Product toEntity(ProductDTO productDTO);

}