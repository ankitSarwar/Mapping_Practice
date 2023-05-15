package com.example.Mapping.Practice.service;

import com.example.Mapping.Practice.model.Address;
import com.example.Mapping.Practice.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepository addressRepository;

    @Autowired
    public AddressService(IAddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(String.valueOf(id));
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Long id, Address updatedAddress) {
        Optional<Address> existingAddress = addressRepository.findById(String.valueOf(id));
        if (existingAddress.isPresent()) {
            Address address = existingAddress.get();
            address.setLandmark(updatedAddress.getLandmark());
            address.setZipcode(updatedAddress.getZipcode());
            address.setDistrict(updatedAddress.getDistrict());
            address.setState(updatedAddress.getState());
            address.setCountry(updatedAddress.getCountry());
            return addressRepository.save(address);
        }
        return null;
    }

    public void deleteAddress(Long id)
    {
        addressRepository.deleteById(String.valueOf(id));
    }
}