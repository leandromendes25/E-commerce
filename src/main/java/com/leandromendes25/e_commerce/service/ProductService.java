package com.leandromendes25.e_commerce.service;

import com.leandromendes25.e_commerce.dto.request.ProductRequestDTO;
import com.leandromendes25.e_commerce.dto.response.ProductResponseDTO;
import com.leandromendes25.e_commerce.exception.ProductAlreadyExsitsException;
import com.leandromendes25.e_commerce.mapper.ProductMapper;
import com.leandromendes25.e_commerce.model.Product;
import com.leandromendes25.e_commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository prdRepository;
    @Autowired
    private ProductMapper prdMapper;
    public ProductResponseDTO registerNewProduct(ProductRequestDTO data){
    prdRepository.findByName(data.name()).ifPresent((product) -> {throw new ProductAlreadyExsitsException();});
    Product newProduct = prdMapper.toProduct(data);
    var newProductSaved = prdRepository.save(newProduct);
    return prdMapper.toProductResponseDTO(newProductSaved);
    }
    public List<ProductResponseDTO> findAll(){
        List<Product> listOfProducts = prdRepository.findAll();
        return prdMapper.toListOfProductsResponseDTO(listOfProducts);
    }
}
