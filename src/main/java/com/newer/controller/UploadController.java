package com.newer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class UploadController {
    public Map<String,Object> upload(MultipartFile upload, HttpServletResponse response) {
        Map<String,Object> map = new HashMap<>();
        if(upload != null) {
            String oName = upload.getOriginalFilename();

        }
    }
}
