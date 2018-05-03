  <form>
    <div id="search-box">
      <div class="row mb-4">
        <div class="col-12 col-lg-8">
          <div id="cotizacion-buscar-auto">
            <h5 class="title-section">Buscar vehiculo ingresado</h5>
            <div class="row">
              <div class="col-3">
                <div class="form-group">
                  <!--<label for="exampleFormControlSelect1">Patente</label>-->
                  <input aria-describedby="basic-addon2" aria-label="Recipient's username" class="form-control form-control-sm" placeholder="Patente" type="text"> <small class="form-text text-muted" id="emailHelp"></small>
                </div>
              </div>
              <div class="col-6">
                <div class="form-group">
                  <!--<label for="exampleFormControlSelect1">RUT Cliente</label>-->
                  <!--<input type="email" class="form-control form-control-sm" id=""  placeholder="Ej:15.588.115-1">-->
                  <div class="input-group">
                    <input aria-describedby="basic-addon2" aria-label="Recipient's username" class="form-control form-control-sm" placeholder="RUT" type="text">
                    <div class="input-group-append">
                      <button class="btn btn-outline-secondary btn-sm" data-target="#exampleModal" data-toggle="modal" type="button">+</button>
                    </div>
                  </div><!--<small id="emailHelp" class="form-text text-muted">Estas son las marcas con las que trabajamos.</small>-->
                  <!-- Modal -->
                </div>
              </div>
              <div class="col-3">
                <button class="btn btn-primary btn-sm btn-block" type="button">Buscar</button>
              </div>
            </div>
          </div>
        </div>
        <div class="col-12 col-lg-4">
          <div id="cotizacion-estado">
            <h5 class="title-section">Estado de la cotizacion</h5>
            <div class="row">
              <div class="col-6">
                <button class="btn btn-primary btn-sm w-100" type="button"><i class=" fas fa-times"></i> Rechazado</button>
              </div>
              <div class="col-6">
                <button class="btn btn-primary btn-sm w-100" type="button"><i class="fas fa-check"></i> Aprobado</button>
              </div>
              <div class="col-12">
                <button class="btn btn-secondary btn-sm w-100 mt-2" disabled type="button"><i class="fas fa-file-alt"></i> Generar orden de trabajo</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div id="search-list-box">
      <div>
        <table class="table">
          <thead class="thead-dark">
            <tr>
              <th scope="col">#</th>
              <th scope="col">Patente</th>
              <th scope="col">Descripcion</th>
              <th scope="col">Rut Cliente</th>
              <th scope="col">Total</th>
              <th scope="col">Estado</th>
              <th scope="col"></th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">3</th>
              <td>FLDS52</td>
              <td>Reparacion de frenos</td>
              <td>15588115-1</td>
              <td>$80.345</td>
              <td>En Espera</td>
              <td><button type="button" class="btn btn-primary btn-sm" data-target="#cotizacionresume" data-toggle="modal">Editar</button></td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>FLDS52</td>
              <td>Reparacion de frenos</td>
              <td>15588115-1</td>
              <td>$80.345</td>
              <td>Aprobado</td>
              <td><button type="button" class="btn btn-primary btn-sm" data-target="#cotizacionresume" data-toggle="modal">Editar</button></td>
            </tr>
            <tr>
              <th scope="row">1</th>
              <td>FLDS52</td>
              <td>Reparacion de frenos</td>
              <td>15588115-1</td>
              <td>$80.345</td>
              <td>Rechazado</td>
              <td><button type="button" class="btn btn-primary btn-sm" data-target="#cotizacionresume" data-toggle="modal">Editar</button></td>
            </tr>
          </tbody>
        </table>
        <jsp:include page="modal_cotizacionresume.jsp" flush="true"></jsp:include>
      </div>
    </div>
  </form>