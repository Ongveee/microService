package com.ongvee.productservice.service;

import com.ongvee.productservice.dto.ProductRequest;
import com.ongvee.productservice.model.Product;
import com.ongvee.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

//    @Autowired
//    public ProductRepository productRepository;

    private final ProductRepository productRepository;

//    public ProductService(ProductRepository productRepository){
//        this.productRepository= productRepository;
//    }

    public void createProduct(ProductRequest productRequest){

        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("adb",product.getId());


//        Product product1 = new Product()
//                .setDescription(productRequest.getDescription())

    }

}
