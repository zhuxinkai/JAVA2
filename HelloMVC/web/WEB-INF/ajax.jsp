<%--
  Created by IntelliJ IDEA.
  User: ZXK
  Date: 2020/1/3
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../javascirpt/jquery-1.7.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#mybutton").click(function () {
                var mytest = $("#mytext").val();
                $.ajax({
                    url:"/test/ajaxback1.form",
                    type:"post",
                    data:{
                        name:mytest
                    },
                    success:function (responsText) {

                    alert(responsText);
                },
                error:function () {
                        alert("system  error");

                },


                    });

            });

        });



    </script>

</head>
<body>
<input type="text" id="mytext">
<input type="button" value="click" id="mybutton">

</body>
</html>
