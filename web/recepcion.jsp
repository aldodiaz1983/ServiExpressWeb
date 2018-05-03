

<jsp:include page="head.jsp" flush="true"></jsp:include>
    <body>
        <jsp:include page="menuempleado.jsp" flush="true"></jsp:include>
         <div class="container reserva">
             <div class="box">
                <h2 class="title-head">Recepcion</h2>
                <div class="alert alert-primary" role="alert">
                    La patente ingresada no cuenta con una reserva, intente buscar por Rut del cliente
                </div>
                
                 <div id="search-box">
                    <div class="row mb-4">
                      <div class="col-12 col-lg-12">
                        <div id="cotizacion-buscar-auto">
                          <h5 class="title-section">Buscar reserva</h5>
                          <div class="row">
                            <div class="col-3">
                              <div class="form-group">
                                <!--<label for="exampleFormControlSelect1">Patente</label>-->
                                <input aria-describedby="basic-addon2" aria-label="Recipient's username" class="form-control form-control-sm" placeholder="Patente" type="text"> <small class="form-text text-muted" id="emailHelp"></small>
                              </div>
                            </div>
                            <div class="col-6">
                                <div class="form-group">
                                  <input aria-describedby="basic-addon2" aria-label="Recipient's username" class="form-control form-control-sm" placeholder="RUT" type="text">
                                </div>
                            </div>
                            <div class="col-3">
                              <button class="btn btn-primary btn-sm btn-block" type="button">Buscar</button>
                            </div>
                          </div>
                        </div>
                      </div>
                      
                    </div>
                  </div>
                 <div id="reserva-hora" class="mb-4">
                        <h5 class="title-section">
                           Hora Solicitada
                        </h5>
                        <p>Lunes 24 Marzo 2018 las 13:30 hrs</p>
                 </div>
                
                <div id="reserva-datos-personales" class="mb-4">
                        <h5 class="title-section">
                           Datos del solicitante
                        </h5>
                        <div class="row">
                            <div class="col-12 col-lg-4">
                                <div class="form-group">
                                    <label for="exampleFormControlSelect1">Nombre</label>
                                    <input type="text" class="form-control form-control-sm" placeholder="Nombre" aria-label="Recipient's username" aria-describedby="basic-addon2" readonly>
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>                                
                            </div>
                             <div class="col-12 col-lg-4">
                                <div class="form-group">
                                    <label for="exampleFormControlSelect1">Apellido</label>
                                    <input type="text" class="form-control form-control-sm" placeholder="Apellido" aria-label="Recipient's username" aria-describedby="basic-addon2" readonly>
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>                                
                            </div>
                             <div class="col-12 col-lg-4">
                                 <div class="form-group">
                                    <label for="exampleFormControlSelect1">Rut</label>
                                    <input type="text" class="form-control form-control-sm" placeholder="Sin puntos ni guiones" aria-label="Recipient's username" aria-describedby="basic-addon2">
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>
                                
                            </div>
                            <div class="col-12 col-lg-4">
                                <div class="form-group">
                                    <label for="exampleFormControlSelect1">Mail</label>
                                    <input type="text" class="form-control form-control-sm" placeholder="+56 9 555 55 55" aria-label="Recipient's username" aria-describedby="basic-addon2" readonly>
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>                                
                            </div>
                            
                             <div class="col-12 col-lg-4">
                                 <div class="form-group">
                                    <label for="exampleFormControlSelect1">Telefono</label>
                                    <input type="text" class="form-control form-control-sm" placeholder="+56 9 555 55 55" aria-label="Recipient's username" aria-describedby="basic-addon2" readonly>
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>
                                
                            </div>
                            
                            <div class="col-12 col-lg-4 align-bottom">
                                <button type="button" class="btn btn-primary btn-sm mt-4 btn-block" data-toggle="modal" data-target="#exampleModal">Editar datos cliente</button> 
                                
                            </div>
                            
                        </div>
                    </div>
                
                <div id="reserva-estado-vehiculo" class="mb-4">
                        <h5 class="title-section">
                           Estado del vehiculo
                        </h5>
                        <div class="form-group">
                          <label for="exampleFormControlTextarea1">Ingrese descripción del estado en que recibe el vehiculo</label>
                          <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                        </div>
                 </div>
                <div class="row">
                    <div class="col-12  align-right">
                        <button type="button" class="btn btn-primary ">Ingresar Vehiculo al Taller</button> 
                    </div>
                </div>
             </div>
         </div>
         

<jsp:include page="footer.jsp" flush="true"></jsp:include>

