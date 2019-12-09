package com.test.zhuxinkai.controller;

import com.test.zhuxinkai.Consts;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class UploadController {

    String suffix;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
/*
 当访问网页采用/bookupload采用get方法时，重定向到bookupload.html，在bookupload.html中使用了form post 方法。
 从而防止了用户使用get方法导致的报错。

 */

    @GetMapping("/bookupload")
    public void upload(HttpServletResponse resp) {
        try {
            resp.sendRedirect("bookupload.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

// post 方法注释
    @PostMapping ("/bookupload")
/*
upload 方法中定义了两个参数， MultipartFile 对象，和 HttpServletRequest 对象。其中的MultipartFile 对象，需要在
html 中指定enctype="multipart/form-data" 相应错误： 提交的对象不是一个Multiapart 对象。

 */
    public String upload(@RequestParam("bookuploadFile") MultipartFile uploadfile, HttpServletRequest req)  {
        String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
        System.out.println(uploadfile);
    /*
    realPath :D:\\文档\\GitHub\\JAVA2\\parenttest\\static\\uploadFile\\
     */

        String format = sdf.format(new Date());
        /*format: 2019-12-07
        File(D:\\文档\\GitHub\\JAVA2\\parenttest\\static\\uploadFile\\2019-12-07)

         */

        File folder = new File(realPath + format);
            if(!folder.isDirectory()){
                //如果文件夹不存在，则新建文件夹。
                folder.mkdirs();
            }
                //获取上传的文件名
            String oldName = uploadfile.getOriginalFilename();
            //对上传的文件类型做判断
            suffix = oldName.substring(oldName.lastIndexOf(".")+1,oldName.length());
             if(!(Consts.IMG_TYPE_DMG.equals(suffix.toUpperCase()) ||
                     Consts.IMG_TYPE_GIF.equals(suffix.toUpperCase()) ||
                     Consts.IMG_TYPE_JPEG.equals(suffix.toUpperCase()) ||
                     Consts.IMG_TYPE_JPG.equals(suffix.toUpperCase()) ||
                     Consts.IMG_TYPE_PNG.equals(suffix.toUpperCase()) ||
                     Consts.IMG_TYPE_SVG.equals(suffix.toUpperCase())))


{
                return "文件类型不符";
            }
             /*
             获得新文件名。新文件名由UUID.randomUUID() ,加上旧文件的扩展名形成。
              */
            String newName = UUID.randomUUID().toString() +
                    oldName.substring(oldName.lastIndexOf("."),oldName.length());
        try {
            //文件保存操作。
            uploadfile.transferTo(new File(folder,newName));
            String filePath = req.getScheme() + "://" + req.getServerName() +":"+
                    req.getServerPort() + "/uploadFile/" + format+"/" + newName;

            //上传成功后，return 一个超链接。关于文件路径的。
            return "<a href="+filePath+">"+filePath+"</a>";

        } catch (IOException e) {
            e.printStackTrace();
        }

return "上传失败";
    }

}
