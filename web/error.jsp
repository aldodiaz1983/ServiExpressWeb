<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="head.jsp" flush="true"></jsp:include>
    <body>
        <div class="container">
            <div class="box box-exito">
                <h1>Ups! algo ha salido mal :(</h1>
                <%String mensaje =(String) request.getAttribute("mensaje") ;%>
                <p><%=mensaje%></p>
                <button type="button" name="back" class="btn btn-primary" onclick="history.back()">back</button>
            </div>
        </div>
    </body>
</html>
