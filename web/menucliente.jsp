
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">SERVIEXPRESS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link" href="#">Reservar hora</a>
      <a class="nav-item nav-link" href="#">Mis reservas</a>
      <a class="nav-item nav-link" href="#">Mi perfil</a>
    </div>
  </div>
  <form class="form-inline my-2 my-lg-0" action="SLogout">
      <!--<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">-->
      <label class="form-control mr-sm-2">Binevenido <c:out value="${usuario.nombre}"/> <c:out value="${usuario.appaterno}"/></label>
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Cerrar sesion</button>
  </form>
</nav>
