
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<div>
    
    
    
    
<div class="card border-primary mb-3" style="max-width: 20rem;">
      <div class="btn-group">
  <button class="btn btn-secondary btn-lg dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
    Доход за месяц
  </button>
  <ul class="dropdown-menu">
    <li class="nav-item"><a class="text-white" href="listProducts">Январь</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Февраль</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Март</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Май</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Июнь</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Июль</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Август</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Сентябрь</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Октябрь</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Ноябрь</a></li>
    <li class="nav-item"><a class="text-white" href="listProducts">Декабрь</a></li>
  </ul>
</div>
    
  <div class="card-header">${month}</div>
  <div class="card-body">
      
    <p class="card-text">${monthIncome}€</p>
  </div>
</div>

<div class="card border-primary mb-3" style="max-width: 20rem;">
  <div class="card-header">Доход за все время</div>
  <div class="card-body">
    <p class="card-text">${allIncome}€</p>
  </div>
</div>
</div>