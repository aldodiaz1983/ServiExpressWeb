<%-- 
    Document   : reserva
    Created on : 15-04-2018, 16:51:08
    Author     : aldito
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="head.jsp" flush="true"></jsp:include>
    <body>
    <jsp:include page="menucliente.jsp" flush="true"></jsp:include>
        <div class="container reserva" style="max-width:800px;">
            <div class="box">
                <h2 class="title-head">Reserva de horas</h2>
                <div class="alert alert-primary" role="alert">
                    Gracias por preferirnos. Uno de nuestros ejecutivos se pondra en contacto con ud.
                </div>
                <form action="SReserva">
                    <div class="row">
                        <div class="col-12 col-lg-6">
                            <h4 class="title-section">
                                Ingrese los datos de su vehiculo
                            </h4>
                            <div class="form-group">
                                <label for="exampleFormControlSelect1">Ingrese marca</label>
                                <select class="form-control" name="marca" id="exampleFormControlSelect1">
                                    <option selected disabled hidden>Seleccione</option>
                                <c:forEach var="m" items="${marcas}" >
                                    <option value="${m.marcaId}"><c:out value="${m.nombreMarca}"/></option>
                                </c:forEach>
                            </select>
                            <small id="emailHelp" class="form-text text-muted">Estas son las marcas con las que trabajamos.</small>
                        </div>
                        <div class="form-group">
                            <label for="exampleFormControlSelect1">Ingrese modelo</label>
                            <select name="modelo" class="form-control" id="exampleFormControlSelect1">
                                <option selected disabled hidden>Seleccione</option>
                                <c:forEach var="mo" items="${modelos}">
                                    <option value="${mo.modeloId}"><c:out value="${mo.nombreModelo}"/></option>
                                </c:forEach>
                            </select>
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        <div class="form-group">
                            <label for="exampleFormControlSelect1">Ingrese año</label>
                            <input class="form-control" name="annio" maxlength="4">
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>

                        <div class="form-group">
                            <label for="exampleFormControlTextarea1">¿Cuales son los sintomas de su vehiculo?</label>
                            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                        </div>


                    </div>
                    <div class="col-12 col-lg-6">
                        <h4 class="title-section">
                            Ingrese disponibilidad horaria
                        </h4>
                        <div class="form-group">
                            <label for="exampleFormControlSelect1">Ingrese fecha tentativa</label>
                            <div class="row">
                                <div class="col-6">
                                    <select name="dia" class="form-control" id="exampleFormControlSelect1">
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
                                <div class="col-6">
                                    <select name="mes" class="form-control" id="exampleFormControlSelect1">
                                        <option value="04">Abril</option>
                                        <option value="05">Mayo</option>
                                        <option value="06">Junio</option>
                                        <option value="07">Julio</option>
                                        <option value="08">Agosto</option>
                                    </select>
                                </div>
                            </div>

                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>

                        <div class="form-group">
                            <label for="exampleFormControlSelect1">Ingrese una hora que le acomode</label>
                            <div class="row">
                                <div class="col-6">
                                    <select name="hora" class="form-control" id="exampleFormControlSelect1">
                                        <option value="09">09</option>
                                        <option value="10">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                        <option value="13">13</option>
                                        <option value="14">14</option>
                                        <option value="15">15</option>
                                        <option value="16">16</option>
                                        <option value="17">17</option>
                                    </select>
                                </div>
                                <div class="col-6">
                                    <select name="minutos" class="form-control" id="exampleFormControlSelect1">
                                        <option value="00">00</option>
                                        <option value="15">15</option>
                                        <option value="30">30</option>
                                        <option value="45">45</option>
                                    </select>
                                </div>
                            </div>

                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        <button type="submit"class="btn btn-primary mr-3">Enviar</button>
                    </div>

                </div>
            </form>

        </div>

    </div>




    <jsp:include page="footer.jsp" flush="true"></jsp:include>
