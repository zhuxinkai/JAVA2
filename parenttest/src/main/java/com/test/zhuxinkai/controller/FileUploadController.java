package com.test.zhuxinkai.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;


@RestController
public class FileUploadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadController.class);

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @PostMapping("/upload")

    public String upload(@RequestParam("uploadFile") MultipartFile file,HttpServletRequest req) {



        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String fileName = file.getOriginalFilename();
        String filePath = "E:\\";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            LOGGER.info("上传成功");
            return "上传成功";
        } catch (IOException e) {
            LOGGER.error(e.toString(), e);
        }
        return "上传失败！";
    }


}
