package com.campusdual.appmazing.model.dto.dtopmapper;

// Con esto se genera el archivo target/generated-sources/annotations/com/campusdual/appmazing/model/dto/dtopmapper/ContactMapperImpl.java.

import com.campusdual.appmazing.model.Category;
import com.campusdual.appmazing.model.dto.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO toDTO(Category category);

    List<CategoryDTO> toDTOList(List<Category> categories);

    Category toEntity(CategoryDTO categoryDTO);

}