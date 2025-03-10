/*
 * =============================================================================
 *
 *   Copyright (c) 2011-2016, The THYMELEAF team (http://www.thymeleaf.org)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package org.example.thymeleafservletexample.domain.services;

import java.util.List;

import org.example.thymeleafservletexample.domain.entities.Product;
import org.example.thymeleafservletexample.domain.entities.repositories.ProductRepository;


public class ProductService {


    public ProductService() {
        super();
    }


    public List<Product> findAll() {
        return ProductRepository.getInstance().findAll();
    }


    public Product findById(final Integer id) {
        return ProductRepository.getInstance().findById(id);
    }

}
