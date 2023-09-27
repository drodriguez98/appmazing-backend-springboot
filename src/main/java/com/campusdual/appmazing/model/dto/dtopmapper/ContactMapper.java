package com.campusdual.appmazing.model.dto.dtopmapper;

import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.dto.ContactDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

// Con esto se genera el archivo target/generated-sources/annotations/com/campusdual/appmazing/model/dto/dtopmapper/ContactMapperImpl.java.

@Mapper
public interface ContactMapper {

    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    ContactDTO toDTO(Contact contact);

    List<ContactDTO> toDTOList(List<Contact> contacts);

    Contact toEntity(ContactDTO contactDTO);

}