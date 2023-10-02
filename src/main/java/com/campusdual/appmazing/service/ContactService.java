package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.IContactService;
import com.campusdual.appmazing.api.IProductService;
import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.dao.ContactDAO;
import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.dto.dtopmapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ContactService")
@Lazy
public class ContactService implements IContactService {

    @Autowired
    private ContactDAO contactDAO;

    @Autowired
    private IProductService productService;

    @Override
    public ContactDTO queryContact(ContactDTO contactDTO) {

        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        return ContactMapper.INSTANCE.toDTO(this.contactDAO.getReferenceById(contact.getId()));

    }

    @Override
    public List<ContactDTO> queryAllContacts() { return ContactMapper.INSTANCE.toDTOList(contactDAO.findAll()); }

    @Override
    public int insertContact(ContactDTO contactDTO) {

        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        this.contactDAO.saveAndFlush(contact);
        return contact.getId();

    }

    @Override
    public int updateContact(ContactDTO contactDTO) { return this.insertContact(contactDTO); }

    @Override
    public int deleteContact(ContactDTO contactDTO) {

        int id = contactDTO.getId();
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        this.contactDAO.delete(contact);
        return id;

    }

}