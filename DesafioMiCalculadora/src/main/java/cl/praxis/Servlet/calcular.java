package cl.praxis.Servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calcular")
public class calcular extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String resultado = null;
		int num1 = 0;
		int num2 = 0;
		int oper = 0;
		try {
			num1 = Integer.parseInt(request.getParameter("numero1"));
			num2 = Integer.parseInt(request.getParameter("numero2"));
			oper = Integer.parseInt(request.getParameter("operacion"));
		}catch (NumberFormatException e) {
			//Redireccionar a la pagina de error
			response.sendRedirect("errorcalc.html");
        }

		if(oper == 0) {
			response.sendRedirect("errorcalc.html");			
		}else if(oper == 1) {
			int suma = num1 + num2 ;
			resultado = String.valueOf(suma);			
		}else if(oper == 2) {
			int resta = num1 - num2 ; 
			resultado = String.valueOf(resta);
		}else if (oper == 3) {
			int multi = num1 * num2 ; 
			resultado = String.valueOf(multi);
		
		}else if(oper == 4) {
			int div = num1 / num2 ;
			resultado = String.valueOf(div);
		
		}else if(oper == 5) {

			String ordenar;
			if (num1 < num2) {
				resultado = "el orden de los numeros de menor a mayor es: primero el " + String.valueOf(num1) + " despues el "
						+ String.valueOf(num2);
			} else if (num2 < num1) {
				resultado = "el orden de los numeros de menor a mayor es: primero el " + String.valueOf(num2) + " despues el"
						+ String.valueOf(num1);
			} else {
				resultado = "Ambos numeros son iguales";
			}
			System.out.println(resultado);
			
		}else if(oper == 6)  {
			
			String parImpar1;
			String parImpar2;
			if (num1 % 2 == 0) {
				parImpar1 = "el primer numero ingresado es Par";
			} else {
				parImpar1 = "el primer numero ingresado es Impar";
			}
			if (num2 % 2 == 0) {
				parImpar2 = "el segundo numero ingresado es Par";
			} else {
				parImpar2 = "el segundo numero ingresado es Impar";
			}
			resultado = parImpar1 + " , " + parImpar2; 
			System.out.println(resultado);
		}
				
			//respuesta al archivo de respuesta 
			request.setAttribute("respuesta", resultado);
			RequestDispatcher rd;		
			rd = request.getRequestDispatcher("/respuesta.jsp");
			rd.forward(request, response);
				
	}
	
}
