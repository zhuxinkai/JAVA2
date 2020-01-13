<%--
  Created by IntelliJ IDEA.
  User: ZXK
  Date: 2020/1/3
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${person.id}</h3><br>
<h3>${person.name}</h3><br>
<h3>${person.address}</h3><br>
<h3>${person.gender}</h3><br>
<h3>${test}</h3>
<!--从拦截器中进行追加的数据。
Map<String,Object> map = modelAndView.getModel();
        map.put("test","appending something.....");
        -->
<h3>${1/0}</h3>


</body>
</html>
