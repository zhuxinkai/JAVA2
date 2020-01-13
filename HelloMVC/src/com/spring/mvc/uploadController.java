package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.SimpleFormatter;

/**
 * <h3>HelloMVC</h3>
 * <p>文件上传</p>
 *
 * @author : zhuxinkai
 * @date : 2020-01-09 20:13
 **/
@Controller

@RequestMapping("/upload")
public class uploadController {

    @RequestMapping("/file.form")
    public String upload(HttpServletRequest request) throws IOException {

        //MultipartFile mf = (MultipartFile) request;
       //将HttpServletRequest 强制转换成  MultipartHttpServletRequest
        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
        //获取文件。 MultipartFile , 通过input type="file" name="pic" 进行指定
        MultipartFile mf = mr.getFile("pic");
        //将获取的文件装换成字节数组。 里面存放的Ascil码值
        byte[] bf = mf.getBytes();
        //获取以日期为开头的文件名。
        String fileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());

        // 不带参数的nextInt() 会生成所有有效的整数。  带参数的nextInt(int x) 则会生成一个范围在0-x（不包含x）内的任意正整数。
        //循环三次，每次加一个一位数。固定生成了三位随机码。
        Random random = new Random();
        for (int i = 0; i<3;i++){
            fileName = fileName + random.nextInt(10);

        }

        //获取原文件名
        String oriFileName = mf.getOriginalFilename();
        //获取原文件名后缀。
        String suffix = oriFileName.substring(oriFileName.lastIndexOf("."));
        //获取Session 的真实路径。
        String realPath = request.getSession().getServletContext().getRealPath("/");
        //生成新的对象FileOutputStream
        OutputStream out = new FileOutputStream(realPath+"/upload/"+fileName+suffix);
        //将字节数组写入。
        out.write(bf);

        out.close();
        return "success";







    }

    @RequestMapping("/frontfile.form")
    public String frontfile(){
        return "upload";
    }


}
