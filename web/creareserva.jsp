<%-- 
    Document   : creareserva
    Created on : 15-04-2018, 19:04:00
    Author     : aldito
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="head.jsp" flush="true"></jsp:include>
    <body>
        <jsp:include page="menuempleado.jsp" flush="true"></jsp:include>
         <div class="container reserva" >
             <div class="box">
                <h2 class="title-head">Crear reserva de horas</h2>
                <!--<div class="alert alert-primary" role="alert">
                    Uno de nuestros ejecutivos se pondra ne contacto con ud.
                </div>-->
                 <form action="SCreateReserva" method="POST">
                <div class="row">
                    <div class="col-12 mb-4">
                        <div class="card">
                            <div class="card-header" id="headingOne">
                              <h5 class="mb-0">
                                <button class="btn btn-link btn-sm" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                  Mostrar solicitudes pendientes
                                </button>
                              </h5>
                            </div>
                            

                            <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                              <div class="card-body">
                                <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Cliente</th>
      <th scope="col">Fecha</th>
      <th scope="col">Hora</th>
      <th scope="col">Telefono</th>
      <th scope="col">Mail</th>
      <th scope="col">Asignar</th>
    </tr>
  </thead>
  <tbody>
      <c:forEach var="sr" items="${SesReserva}">
    <tr>
      <th scope="row"><c:out value="${sr.reservaId}"/></th>
      <td><c:out value="${sr.clienteIdCliente.usuarioIdUsuario.nombre}"/> <c:out value="${sr.clienteIdCliente.usuarioIdUsuario.appaterno}"/></td>
      <td><c:out value="${sr.fechaReservada}"/> </td>
      <td><c:out value="${sr.horaReservada}"/></td>
      <td><c:out value="${sr.clienteIdCliente.usuarioIdUsuario.telefono}"/></td>
      <td><c:out value="${sr.clienteIdCliente.usuarioIdUsuario.correo}"/></td>
      <td>
          <div class="row">
              <div class="col-6">
                  <button type="submit" value="login" name="boton-user-input" class="btn btn-primary btn-sm"><i class="fas fa-link"></i></button>
              </div>
              <div class="col-6">
                  <button type="submit" value="login" name="boton-user-input" class="btn btn-primary btn-sm"><i class="fas fa-trash-alt"></i></button>
              </div>
          </div>
      </td>
    </tr>
     </c:forEach>

  </tbody>
</table>
                              </div>
                            </div>
                          </div>
                        
                    </div>
                    
                    <div class="col-12 col-lg-8">
                        <h5 class="title-section">
                           Disponibilidad horaria 
                        </h5>
                            <form>
                                <div class="select-date">
                                    
                                    <div class="col-12 col-lg-4">
                                        <h6>Seleccione fecha</h6>
                                    </div>
                                    <div class="col-4">
                                        <select class="form-control form-control-sm" id="exampleFormControlSelect1">
                                            <option>15</option>
                                            <option>16</option>
                                            <option>17</option>
                                            <option>18</option>
                                            <option>19</option>
                                            <option>20</option>
                                            <option>21</option>
                                            <option>22</option>
                                            <option>23</option>
                                            <option>24</option>
                                            <option>25</option>
                                            <option>26</option>
                                            <option>27</option>
                                            <option>28</option>
                                            <option>29</option>
                                            <option>30</option>
                                            <option>31</option>
                                          </select>
                                    </div>
                                    <div class="col-4">
                                        <select class="form-control form-control-sm" id="exampleFormControlSelect1">
                                            <option>Abril</option>
                                            <option>Mayo</option>
                                            <option>Junio</option>
                                            <option>Julio</option>
                                            <option>Agosto</option>
                                        </select>
                                    </div>
                            </div>
                                <div class="chedule">
                            <div class="row">
                                <div class="col-3">
                                    
                                    <h6 class="head-chedule">Horas</h6>
                                    <div class="info-hora hora1">
                                         9:00 hrs
                                     </div>
                                     <div class="info-hora hora2">
                                         9:30 hrs
                                     </div>
                                     <div class="info-hora hora3">
                                         10:00 hrs
                                     </div>
                                    <div class="info-hora hora1">
                                         10:30 hrs
                                     </div>
                                     <div class="info-hora hora2">
                                         11:00 hrs
                                     </div>
                                     <div class="info-hora hora3">
                                         11:30 hrs
                                     </div>
                                    <div class="info-hora hora1">
                                         12:00 hrs
                                     </div>
                                     <div class="info-hora hora2">
                                         12:30 hrs
                                     </div>
                                     <div class="info-hora hora3">
                                         14:00 hrs
                                     </div>
                                    <div class="info-hora hora3">
                                         14:30 hrs
                                     </div>
                                    <div class="info-hora hora3">
                                         15:00 hrs
                                     </div>
                                    <div class="info-hora hora3">
                                         15:30 hrs
                                     </div>
                                    <div class="info-hora hora3">
                                         16:00 hrs
                                     </div>
                                    <div class="info-hora hora3">
                                         16:30 hrs
                                     </div>
                                    <div class="info-hora hora3">
                                         17:00 hrs
                                     </div>
                                    <div class="info-hora hora3">
                                         17:30 hrs
                                     </div>
                                </div>
                                <div class="col-3">
                                    <h6 class="head-chedule">Juan Perez</h6>
                                    <div class="hora hora1 available">
                                         Disponible
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3">
                                         Agendado
                                     </div>
                                    <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3">
                                         Agendado
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3 available">
                                         Disponible
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                    <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3">
                                         Agendado
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3 available">
                                         Disponible
                                     </div>
                                    
                                </div>
                                 <div class="col-3">
                                     <h6 class="head-chedule">Ruben Zapata</h6>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3 available">
                                         Disponible
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3">
                                         Agendado
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3 available">
                                         Disponible
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3">
                                         Agendado
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                    
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                    
                                </div>
                                 <div class="col-3">
                                     <h6 class="head-chedule">Kevin Amigo</h6>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3">
                                         Agendado
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3 available">
                                         Disponible
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3 available">
                                         Disponible
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3">
                                         Agendado
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                     <div class="hora hora2">
                                         Agendado
                                     </div>
                                     <div class="hora hora3 available">
                                         Disponible
                                     </div>
                                     <div class="hora hora1">
                                         Agendado
                                     </div>
                                </div>

                            </div>
                                    </div>
                                
                            </form>
                        </h4>
                     
                        
                       
                        
                    </div>
                    <div class="col-12 col-lg-4">
                        <h5 class="title-section">
                            Ingrese los datos
                        </h5>
                        <div class="form-group">
                            <label for="exampleFormControlSelect1">RUT Cliente</label>
                            <!--<input type="email" class="form-control form-control-sm" id=""  placeholder="Ej:15.588.115-1">-->
                            <div class="input-group">
                                <input type="text" class="form-control form-control-sm" placeholder="Ej:15.588.115-1" aria-label="Recipient's username" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                  <button class="btn btn-outline-secondary" type="button" data-toggle="modal" data-target="#exampleModal"> + </button>
                                </div>
                              </div>
                            <!--<small id="emailHelp" class="form-text text-muted">Estas son las marcas con las que trabajamos.</small>-->
                            
                            <!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Ingresar nuevo cliente</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
        <button type="button" class="btn btn-primary">Guardar</button>
      </div>
    </div>
  </div>
</div>
                        </div>
                        <div class="form-group">
                            <label for="exampleFormControlSelect1">Asigne mecanico</label>
                            <select class="form-control form-control-sm" id="exampleFormControlSelect1">
                              <option>Seleccione</option>
                              <option>Juan Perez</option>
                              <option>Pedro Espinoza</option>
                              <option>Raul Gallegos</option>
                            </select>
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        <div class="form-group">
                            <!--<label for="exampleFormControlSelect1">Asigne hora</label>-->
                            <select class="form-control form-control-sm" id="exampleFormControlSelect1">
                              <option>Horas disponibles</option>
                              <option>13:00</option>
                              <option>13:30</option>
                            </select>
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        
                        <div class="form-group">
                            <label for="exampleFormControlSelect1">Datos vehiculo</label>
                            <select class="form-control form-control-sm" id="exampleFormControlSelect1">
                              <option>Marca</option>
                              <option>2</option>
                              <option>3</option>
                              <option>4</option>
                              <option>5</option>
                            </select>
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        <div class="form-group">
                            <!--<label for="exampleFormControlSelect1">Ingrese modelo</label>-->
                            <select class="form-control form-control-sm" id="exampleFormControlSelect1">
                              <option>Modelo</option>
                              <option>2</option>
                              <option>3</option>
                              <option>4</option>
                              <option>5</option>
                            </select>
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        <div class="form-group">
                            <!--<label for="exampleFormControlSelect1">Ingrese año</label>-->
                            <select class="form-control form-control-sm" id="exampleFormControlSelect1">
                              <option>Año</option>
                              <option>2</option>
                              <option>3</option>
                              <option>4</option>
                              <option>5</option>
                            </select>
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        
                        <div class="form-group">
                            <label for="exampleFormControlTextarea1">¿Cuales son los sintomas de su vehiculo?</label>
                            <textarea class="form-control form-control-sm" id="exampleFormControlTextarea1" rows="3"></textarea>
                        </div>
                        
                        <button type="submit" value="login" name="boton-user-input" class="btn btn-primary mr-3">Reservar</button>
                        <button type="button" class="btn btn-primary"><i class="fas fa-envelope"></i> Notificar</button>
                        
                        
                    </div>
                        
                    </div>
                    </form>
                    
                </div>
                 
             </div>
             
        

        
<jsp:include page="footer.jsp" flush="true"></jsp:include>
