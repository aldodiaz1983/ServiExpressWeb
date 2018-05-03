                <form>
                    
                    
                    <div id="cotizacion-datos-personales" class="mb-4">
                        <h5 class="title-section">
                            Cotizacion Nº 4
                        </h5>
                        <div class="row">
                            <div class="col-12 col-lg-4">
                                <div class="form-group">
                                    <label for="exampleFormControlSelect1">Patente</label>
                                    <input type="text" class="form-control form-control-sm" placeholder="flds52" aria-label="Recipient's username" aria-describedby="basic-addon2">
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
                            
                             <div class="col-12 col-lg-4 align-bottom">
                                <button type="button" class="btn btn-primary btn-sm mt-4 btn-block" data-toggle="modal" data-target="#exampleModal">Editar datos cliente</button> 
                                
                            </div>
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
                                    <label for="exampleFormControlSelect1">Telefono</label>
                                    <input type="text" class="form-control form-control-sm" placeholder="+56 9 555 55 55" aria-label="Recipient's username" aria-describedby="basic-addon2" readonly>
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>
                                
                            </div>
                            
                        </div>
                    </div>
                    
                    
                    <div id="cotizacion-servicios-prestados" class="mb-4">
                        <h5 class="title-section">
                            Servicios solicitados
                        </h5>
                        <div class="row">
                            <div class="col-12">
                                <div class="form-group">
                                    <label for="exampleFormControlSelect1">Servicio a cotizar</label>
                                    <!--<input type="email" class="form-control form-control-sm" id=""  placeholder="Ej:15.588.115-1">-->
                                    <div class="input-group">
                                        <input type="text" class="form-control " placeholder="Ej:Reparacion de frenos" aria-label="Recipient's username" aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                          <button class="btn btn-outline-secondary " type="button" data-target="#agregar-nuevo-input"> + </button>
                                        </div>
                                    </div>
                                </div>                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-12">
                                <table class="table">
                                    <thead>
                                      <tr>
                                        <th scope="col">#</th>
                                        <th scope="col" style="width:40px;">Cant</th>
                                        <th scope="col" style="width:250px;">Articulo o servicio</th>
                                        <th scope="col">Id</th>
                                        <th scope="col">Precio</th>
                                        <th scope="col">Importe</th>
                                        <th scope="col"></th>
                                      </tr>
                                    </thead>
                                    <tbody>
                                      <tr>
                                        <th scope="row">1</th>
                                        <td><input type="text" class="form-control form-control-sm" placeholder="0" aria-label="Recipient's username" aria-describedby="basic-addon2"></td>
                                        <td><input type="text" class="form-control form-control-sm" placeholder="Ej:Balatas de carbon" aria-label="Recipient's username" aria-describedby="basic-addon2"></td>
                                        <td><input type="text" class="form-control form-control-sm" placeholder="000000" aria-label="Recipient's username" aria-describedby="basic-addon2" readonly></td>
                                        <td><input type="text" class="form-control form-control-sm" placeholder="$000.000" aria-label="Recipient's username" aria-describedby="basic-addon2" readonly></td>
                                        <td><input type="text" class="form-control form-control-sm" placeholder="$000.000" aria-label="Recipient's username" aria-describedby="basic-addon2" readonly></td>
                                        <td><button type="button" class="btn btn-primary btn-sm"><i class="fas fa-plus-square"></i></button></td>
                                      </tr>

                                    </tbody>
                                  </table>
                            </div>

                        </div>
                        
                        
                    </div>
                    <div class="row border-top pt-3 pb-3">
                            <div class="col-3">
                                <p>Fecha: <strong>19 Abril 2018</strong></p>
                            </div>
                            <div class="col-3">
                                <p>Vigencia: <strong>19 Mayo 2018</strong></p>
                            </div>
                            <div class="col-6 text-right">
                                <button type="button" class="btn btn-primary "><i class="fas fa-save"></i> Crear</button>
                                <button type="button" class="btn btn-primary"><i class="fas fa-file-alt"></i> Imprimir</button>
                                <button type="button" class="btn btn-primary"><i class="fas fa-envelope"></i> Enviar</button>
                            </div>
                        </div>
                    <div class="row border-top pt-3">
                        <div class="col-12">
                            <div class="alert alert-primary" role="alert">
                                Para confirmar el servicio pongase en contacto con nosotros al telefono: +56 9 8 123 34 56
                            </div>
                        </div>
                    </div>
                    
                    
                    
                    
                </form>
