package com.xx.fun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * Created by Alex on 2016/10/26.
 */
@Controller
public class FileUploadController {

    @RequestMapping("/fileUpload")
    public String fileUpload(){
        return "redirect:/";
    }

    @PostMapping("/")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes){
        System.out.println(file);
        redirectAttributes.addFlashAttribute(String.format("message", "You successfully upload %s !"), file.getOriginalFilename());
        return "redirect:/";
    }
}
