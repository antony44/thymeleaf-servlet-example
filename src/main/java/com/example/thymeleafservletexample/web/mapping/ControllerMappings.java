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
package com.example.thymeleafservletexample.web.mapping;

import java.util.HashMap;
import java.util.Map;

import com.example.thymeleafservletexample.web.controller.Controller;
import com.example.thymeleafservletexample.web.controller.HomeController;
import com.example.thymeleafservletexample.web.controller.OrderDetailsController;
import com.example.thymeleafservletexample.web.controller.OrderListController;
import com.example.thymeleafservletexample.web.controller.ProductCommentsController;
import com.example.thymeleafservletexample.web.controller.ProductListController;
import com.example.thymeleafservletexample.web.controller.SubscribeController;
import com.example.thymeleafservletexample.web.controller.UserProfileController;
import org.thymeleaf.web.IWebRequest;


public class ControllerMappings {

    private static final Map<String, Controller> CONTROLLER_BY_URL;

    static {
        CONTROLLER_BY_URL = new HashMap<>();
        CONTROLLER_BY_URL.put("/", new HomeController());
        CONTROLLER_BY_URL.put("/product/list", new ProductListController());
        CONTROLLER_BY_URL.put("/product/comments", new ProductCommentsController());
        CONTROLLER_BY_URL.put("/order/list", new OrderListController());
        CONTROLLER_BY_URL.put("/order/details", new OrderDetailsController());
        CONTROLLER_BY_URL.put("/subscribe", new SubscribeController());
        CONTROLLER_BY_URL.put("/userprofile", new UserProfileController());
    }


    private ControllerMappings() {
    }


    public static Controller resolveController(final IWebRequest request) {
        final var path = request.getPathWithinApplication();
        return CONTROLLER_BY_URL.get(path);
    }
}
