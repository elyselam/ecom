package com.elysecodes.ecommerce.dao;

import com.elysecodes.ecommerce.entity.Product;
import com.elysecodes.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//collectionResourceRel = "name of json entry"
//path: /product-category
@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
