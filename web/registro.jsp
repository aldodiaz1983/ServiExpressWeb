
<jsp:include page="head.jsp" flush="true"></jsp:include>
    <body>

        <div class="container">
            <div class="box registro-box">
                <h2>Registrese</h2>
                <form name="registro_cliente" action="SRegistroUsuario" method="POST">
                    <div class="form-group row">
                        <label for="rut-user-input" class="col-5 col-form-label">RUT</label>
                        <div class="col-7">
                            <input class="form-control" type="text" value="" placeholder="ej:15.588.115-1" name="rut-user-input">
                            <small id="emailHelp" class="form-text text-muted">Incluya guión y digito verificador</small>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="nombre-user-input" class="col-5 col-form-label">Nombre</label>
                        <div class="col-7">
                            <input class="form-control" type="text" placeholder="Andres" name="nombre-user-input">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="appaterno-user-input" class="col-5 col-form-label">Ap. Paterno</label>
                        <div class="col-7">
                            <input class="form-control" type="text" placeholder="Reyes" name="appaterno-user-input">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="apmaterno-user-input" class="col-5 col-form-label">Ap. Materno</label>
                        <div class="col-7">
                            <input class="form-control" type="text" placeholder="Saavedra" name="apmaterno-user-input">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="fecha-user-input" class="col-5 col-form-label">Fecha de Nacimiento</label>
                        <div class="col-7">
                            <input class="form-control" type="date" name="fecha-user-input">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="mail-user-input" class="col-5 col-form-label">Correo</label>
                        <div class="col-7">
                            <input class="form-control" type="text" placeholder="usuario@mail.com" name="mail-user-input">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="pass-user-input" class="col-5 col-form-label">Contraseña</label>
                        <div class="col-7">
                            <input class="form-control" type="password" value="" placeholder="******" name="pass-user-input">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="nombre-user-input" class="col-5 col-form-label" >Telefono</label>
                        <div class="col-7">
                            <input class="form-control" type="text"  maxlength="9" placeholder="555 55 55" name="tel-user-input">
                        </div>
                    </div>
                    <div class="form-group row" hidden>
                        <label for="empresa-user-input" class="col-5 col-form-label">Rut Empresa</label>
                        <div class="col-7">
                            <input class="form-control" type="text" placeholder="99999999-0" name="empresa-user-input">
                        </div>
                    </div>
            </div>



            <!--aqui quede-->                
            <button type="submit" value="registrar" name="boton-user-input" class="btn btn-primary mr-3">Registrar</button>
            <a href="index.jsp">Cancelar</a>

        </form>
    </div>
</div>
<jsp:include page="footer.jsp" flush="true"></jsp:include>
