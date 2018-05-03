<%-- 
    Document   : facturacion
    Created on : 16-04-2018, 0:10:19
    Author     : aldito
--%>
<jsp:include page="head.jsp" flush="true"></jsp:include>
    <body>
        <jsp:include page="menuempleado.jsp" flush="true"></jsp:include>
            
            <div class="container reserva" >
                <div class="box">
                    <h2 class="title-head">Registro de facturas y boletas</h2>
                    
                    <nav>
                        <div class="nav nav-tabs" id="nav-tab" role="tablist">
                          <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Ingresar documento</a>
                          <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Documentos emitidos</a>
                          <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Documentos anulados</a>
                        </div>
                      </nav>
                      <div class="tab-content" id="nav-tabContent">
                        <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                            <div class="row">
                                <div class="col-12 col-lg-3">
                                      <div class="form-check">
                                        <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                                        <label class="form-check-label" for="exampleRadios1">
                                          Boleta
                                        </label>
                                      </div>
                                      <div class="form-check">
                                        <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
                                        <label class="form-check-label" for="exampleRadios2">
                                          Factura
                                        </label>
                                      </div>

                                </div>
                                
                                <div class="col-12 col-lg-3">
                                    <div class="form-group">
                                    <label for="exampleFormControlSelect1">RUT Cliente</label>
                                    <!--<input type="email" class="form-control form-control-sm" id=""  placeholder="Ej:15.588.115-1">-->
                                    <div class="input-group">
                                        <input type="text" class="form-control form-control-sm" placeholder="Ej:15.588.115-1" aria-label="Recipient's username" aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                          <button class="btn btn-outline-secondary btn-sm" type="button" data-toggle="modal" data-target="#exampleModal"> + </button>
                                        </div>
                                      </div>
                                    <!--<small id="emailHelp" class="form-text text-muted">Estas son las marcas con las que trabajamos.</small>-->

                                        <!-- Modal -->
                                        <jsp:include page="agregarcliente.jsp" flush="true"></jsp:include>
                                           
                                    </div>
                                    
                                </div>
                                <div class="col-12 col-lg-3">
                                    <div class="form-group">
                                        <label for="exampleFormControlSelect1">Nº Cotizacion</label>
                                        <input type="text" class="form-control form-control-sm" placeholder="Ingrese numero de cotizacion" aria-label="Recipient's username" aria-describedby="basic-addon2">
                                        <small id="emailHelp" class="form-text text-muted"></small>
                                    </div>
                                    
                                </div>
                                <div class="col-12 col-lg-3 pt-4">
                                    <button type="button" class="btn btn-primary btn-sm"><i class="fas fa-eye"></i></button>                                    
                                    <button type="button" class="btn btn-primary btn-sm">Crear</button>
                                    <button type="button" class="btn btn-primary btn-sm"><i class="fas fa-print"></i></button>
                                    <button type="button" class="btn btn-primary btn-sm"><i class="fas fa-share-square"></i></button>
                                    
                                    
                                </div>
                            </div>
                        
                        </div>
                        <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">...2</div>
                        <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">...3</div>
                      </div>
                    
                </div>
            </div>
<jsp:include page="footer.jsp" flush="true"></jsp:include>
