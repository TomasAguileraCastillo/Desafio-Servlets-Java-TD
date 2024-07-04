Desafío - Servlets
-


En este desafío validaremos nuestros conocimientos en la utilización de Servlets en conjunto
con JSP y el IDE Eclipse.

Para este desafío necesitarás aplicar todo lo aprendido en los bloques 1, 2 y 3 de esta unidad,
te aconsejamos mantener a mano dicho material en caso de cualquier duda.

Lee todo el documento antes de comenzar el desarrollo individual de este desafío, para
asegurarte de tener el máximo puntaje y enfocar bien los esfuerzos.

Tiempo asociado: 1 hora cronológica.

Descripción
-
Las operaciones matemáticas hacen parte de nuestro día a día, desde sumar cuantas
cucharadas de azúcar necesito para mi café, ordenar las facturas de mayor a menor valor y
multiplicar la cantidad de veces que podemos hacer una rutina. Por lo general para estas
operaciones matemáticas solemos tener nuestro celular o una calculadora, pero ¿podríamos
construir nuestra propia calculadora?

En este desafío vamos a desarrollar un nuevo proyecto Java Web Dinámico, en donde como
característica principal vamos a poder realizar operaciones matemáticas como:
1. Suma.
2. Resta.
3. Multiplicación.
4. División.
5. Ordenar el número.
6. Cuál es par e impar.


Para esto nos apoyaremos tanto de la utilización de vista JSP como elemento de
visualización de información, como así también los Servlets de Java para la captura de
información y retorno de valores respecto de la selección de usuario en cada operación
matemática.
Solo se podrán ingresar dos números enteros con los cuales realizaremos la operación
matemática, se debe validar que en efecto los valores ingresados sean números, en caso de
no ser número se redireccionará al usuario a una vista de error



Vista del formulario.

![image](https://github.com/TomasAguileraCastillo/Desafio-Servlets-Java-TD/assets/136927556/0ef3f14b-f361-4727-8d79-62e84a249e5f)


Aplicando los conceptos y herramientas aprendidas hasta ahora, generamos lo siguiente:

1. Un proyecto Java Web Dinámico desde el IDE Eclipse.
2. 1 archivo JSP de presentación para captura de valor de los números seleccionados.
3. Vinculación con Servlet para toma de request y posterior proceso de la operación
matemática dentro del Servlet.
4. Validar que la información ingresada en el formulario sea un número entero.
5. Validar que la información que llega al Servlet sea un número entero.
6. Generación de resultado de acuerdo a la operación matemática seleccionada.
7. Redireccionar a vista de error en caso de no ingresar números enteros.

¡Vamos que se puede!



Requerimientos
-

Mediante la utilización del IDE de desarrollo Eclipse, se debe crear un nuevo proyecto Web
Dinámico llamado “DesafioMiCalculadora”, este proyecto debe ser desplegado bajo el
servidor Web Apache Tomcat 9.

Una vez creado el proyecto, se debe crear la página “index.jsp”, la cual es el JSP de entrada
en donde se debe visualizar el formulario con los tipos de operaciones disponibles.

Se debe crear un Servlet en el cual se realiza la validación y se envía el resultado de la
operación matemática.

1. Crear un nuevo proyecto Java Web Dinámico de Nombre “DesafioMiCalculadora”.
(1 Punto)
2. Crear la estructura JSP correspondiente a la vista requerida, considerando el envío de
los datos hacia el Servlet haciendo uso del método POST.
(2 Puntos)
3. Crear y vincular el servlet necesario para entregar el resultado esperado por la
operación matemática. (1 servlet)
(2 Puntos)
4. Validar los datos en el formulario antes de pasarlos al servidor por medio de
validaciones HTML.
(2 Puntos)

5. Valida los datos obtenidos en el formulario por medio del Servlet y entrega el resultado
de la operación.
(3 Puntos)
¡Mucho éxito!
Consideraciones y recomendaciones
1. Se puede apoyar de los ejercicios anteriores a modo de consulta.
2. Recuerde tener previamente configurado su servidor tomcat dentro del IDE Eclipse.

   
 ¡Vamos con todo!


Imagenes del proyecto realizado 

![image](https://github.com/TomasAguileraCastillo/Desafio-Servlets-Java-TD/assets/136927556/2b02da5b-3f82-4883-a635-15baa2c10971)

![image](https://github.com/TomasAguileraCastillo/Desafio-Servlets-Java-TD/assets/136927556/8548a292-fde7-4c8e-9406-d836b67922a5)








