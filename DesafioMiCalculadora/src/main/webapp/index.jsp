<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Calculadora Basica con Servlet</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
	<body data-bs-theme="dark" >
		<div class="container"  >
			<div class="col-6 p-5 d-block" >
				<form name="formulario" method ="post" action="/DesafioMiCalculadora/calcular">
				<h3 class="p-3">Calculadora</h3>
						<div class="mb-3">
					 		<input	type="number" 
					 				class="form-control" 
					 				id="numero1" 
					 				name="numero1" 
					 				placeholder="Número 1" 
					 				min="1"
					 				required > 
						</div>
						<div class="mb-3">						 
							<input 	type="number" 
									class="form-control" 
									id="numero2" 
									min="1"
									name="numero2" 
									placeholder="Número 2" 
									required >
						</div>
						<div class="mb-3">
							<select class="form-select" id="" name="operacion" required>
								<option value="1">Sumar</option>
								<option value="2">Restar</option>
								<option value="3">Multiplicar</option>
								<option value="4">Dividir</option>
								<option value="5">Ordenar el número</option>
								<option value="6">Cuál es par e impar</option>
							</select>
						</div>
						
						 
						<div class="mb-3 d-grid" >
							<button type="submit" class="btn btn-info text-light" >Calcular</button> 
						</div>
						
						
				</form>
			</div>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
			crossorigin="anonymous"></script>
	
	</body>
</html>