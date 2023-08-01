package com.azure.aad.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {
    @GetMapping(value = "/login_redirect", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @PreAuthorize("hasAuthority('APPROLE_Admin')")
    public String loginMessage() {

       return "<html>\n" +
               "<body bgcolor=\"#5f9ea0\">\n" +
               "<h1 style=\"color:white;\">\n" +
               "\n" +
               "    Successfully logged in using Azure Entra ID\n" +
               "</h1>\n" +
               "</body>\n" +
               "</html>";
    }
}