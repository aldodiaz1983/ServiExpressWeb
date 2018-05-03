
<%-- 
    Document   : index
    Created on : 08-04-2018, 18:30:17
    Author     : aldito
--%>
<jsp:include page="head.jsp" flush="true"></jsp:include>
    <body>
        <div class="container login" style="max-width:600px;">
            <div class="box login-box">
                <div class="cabecera">
                    <span>Taller Mecanico</span>
                    <h2>SERVIEXPRESS</h2>
                </div>

                <form action="SLogin">
                    <div class="form-group row">
                        <label for="log-mail" class="col-sm-5 col-form-label">Correo</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="log-mail" placeholder="micorreo@mail.com">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="log-pass" class="col-sm-5 col-form-label">Contraseña</label>
                        <div class="col-sm-7">
                            <input type="password" class="form-control" name="log-pass" placeholder="Password">
                        </div>
                    </div>

                    <button type="submit" class="btn btn-primary mr-3">Enviar</button>
                    <a class="btn btn-outline-secondary btn-sm" href="registro.jsp"> Registrase </a>
                    <a class="btn btn-outline-secondary btn-sm"   data-target="#recuperarclave" data-toggle="modal">Olvide mi contraseña</a>

                </form>
                <div class="row">

                </div>
            </div>
        </div>
    <jsp:include page="modal_recuperarclave.jsp" flush="true"></jsp:include>   
    <jsp:include page="footer.jsp" flush="true"></jsp:include>
