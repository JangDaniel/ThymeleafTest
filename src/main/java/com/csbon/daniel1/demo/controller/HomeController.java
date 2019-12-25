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
package com.csbon.daniel1.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csbon.daniel1.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request, HttpServletResponse response, Model model) {
        User user = new User("daniel", "Jang", "South Korea", 48);
        request.getSession(true).setAttribute("user", user);


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar cal = Calendar.getInstance();
        model.addAttribute(cal);
//        model.addAttribute("today", dateFormat.format(cal.getTime()));
        model.addAttribute("today", Calendar.getInstance());
        model.addAttribute("users",
                Map.of(1, new User("daniel", "Jang", "South Korea", 48),
                        2, new User("Kevin", "Michael", "USA", 20)));
        model.addAttribute("usersList",
                Arrays.asList(new User("1", "1name", "KOR", 10),
                            new User("2", "2name", "CHINA", 20)));
        return "home";
    }

}
