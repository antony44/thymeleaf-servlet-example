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
package org.example.thymeleafservletexample.domain.entities;

import java.math.BigDecimal;

public class OrderLine {

    private Product product = null;

    private Integer amount = null;

    private BigDecimal purchasePrice = null;


    public OrderLine() {
        super();
    }


    public Product getProduct() {
        return this.product;
    }


    public void setProduct(final Product product) {
        this.product = product;
    }


    public Integer getAmount() {
        return this.amount;
    }


    public void setAmount(final Integer amount) {
        this.amount = amount;
    }


    public BigDecimal getPurchasePrice() {
        return this.purchasePrice;
    }


    public void setPurchasePrice(final BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

}
