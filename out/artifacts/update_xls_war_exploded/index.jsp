<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022-01-09
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form class="" method="post" action="${pageContext.request.contextPath}/update_shenbao" style="margin-top: 30px;margin-left: 70px">

    <div class="row">
      <div class="col-xs-3">
        <input type="text" class="form-control" placeholder="请填写：sheet月份，如:2021-4、2021-5、...." name="sheet_name" style="width: 300px">
        <font size="1px" color="red">注意分隔符是：[、] ，另外，最后一个结尾的sheet名称，不需要顿号结尾</font>
      </div>
    </div>

    <div class="div_submit">
      <div class="div_submit2">
        <input type="submit" value="开始更新" >
      </div>
    </div>
  </form>
  </body>
</html>
