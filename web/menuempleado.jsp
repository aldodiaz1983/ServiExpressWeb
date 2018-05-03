<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">SERVIEXPRESS</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
            <a class="nav-item nav-link active" href="index.jsp">Home <span class="sr-only">(current)</span></a>
            <a class="nav-item nav-link" href="creareserva.jsp">Reservas</a>      
            <a class="nav-item nav-link" href="cotizacion.jsp">Cotizaciones</a>
            <a class="nav-item nav-link" href="facturacion.jsp">Facturacion</a>
            <a class="nav-item nav-link" href="insumos.jsp">Insumos</a>
            <a class="nav-item nav-link" href="clientes.jsp">Clientes</a>
        </div>
    </div>
    <form class="form-inline my-2 my-lg-0" action="SLogout">
        <!--<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">-->
        <label class="form-control mr-sm-2">Bienvenido: <c:out value="${usuario.nombre}"/> <c:out value="${usuario.appaterno}"/></label>
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Cerrar sesion</button>
    </form>
</nav>
