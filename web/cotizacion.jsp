<jsp:include page="head.jsp" flush="true"></jsp:include>
    <body>
        <jsp:include page="menuempleado.jsp" flush="true"></jsp:include>
         <div class="container reserva">
             <div class="box">
                 
                <h2 class="title-head">Cotizacion de servicios</h2>
                
                
                <ul class="nav nav-tabs mb-4" id="myTab" role="tablist">
                    <li class="nav-item">
                      <a class="nav-link active" id="profile-tab" data-toggle="tab" href="#search-quotation" role="tab" aria-controls="profile" aria-selected="false">Cotizaciones</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link " id="home-tab" data-toggle="tab" href="#add-quotation" role="tab" aria-controls="home" aria-selected="true">Nueva Cotizacion</a>
                    </li>

                  </ul>
                  <div class="tab-content" id="myTabContent">
                      <div class="tab-pane fade show active" id="search-quotation" role="tabpanel" aria-labelledby="profile-tab">
                          <jsp:include page="search-quotation.jsp" flush="true"></jsp:include>
                      </div>
                      <div class="tab-pane fade " id="add-quotation" role="tabpanel" aria-labelledby="home-tab">
                          <jsp:include page="add-quotation.jsp" flush="true"></jsp:include>                          
                      </div>
                      
                  </div>
                

             </div>
         </div>
        <jsp:include page="footer.jsp" flush="true"></jsp:include>
