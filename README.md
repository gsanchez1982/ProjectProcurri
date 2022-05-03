# ProjectProcurri
 Proyecto de TecMilenio para la empresa Procurri
 
 Elaborado por Guillermo Sánchez Estrada, matricula 2911468.
 
 == Resumen Ejecutivo ==
 
 Empresa: Procurri, S. de RL. de C.V.
 
 Área: Administración y Contabilidad
 
 Justificación del proyecto y Problemática a Mitigar:
 El alumno labora en la empresa. Como parte de sus labores, se detectó que toma mucho tiempo la elaboración de reportes que liguen documentos de venta de productos y servicios, con su compra de inventarios en Estados Unidos, relacionando el proceso comercial en cada operación. 
 Por este motivo, se pretende automatizar la generación de este reporte del proceso comercial, para poder relacionar cada documento de orden de compra y factura, en la venta y en la adquisición de mercancías o servicios tercerizados.
 
 Descripción del Proyecto:
 Desarrollo de una Aplicación Web desarrollada en Java que pueda generar una tabla en donde cada fila sea una operación comercial ("deal"), y cada columna sea uno de los documentos que componen cada operación:
 - Venta al cliente (Orden de Compra del cliente "OC")
 - Compra al Proveedor (Orden de compra al proveedor "PO")
 - Factura al cliente (Sales Invoice)
 - Factura del Proveedor (Vendor Invoice)
 
 Solución:
 Aplicación Web desarrollada en Java, basada en Spring Boot, que automatice la elaboración y despliegue de una tabla donde se relacionen los cuatro documentos. Además, se podrán crear nuevos "deals", con su información relevante, editarlos, y borrarlos. Finalmente, podrá haber un campo de consulta para buscar cada deal usando un número de PO como referencia (llave).
 
 Arquitectura:
 - Hosting de la app y de la base de datos en Heroku
 - desarrollo en NetBeans con Github
 - Base de Datos PostgreSQL
 - Aplicación en Java usando estructura Spring Boot con Thymeleaf. 

 == Instalación y Uso ==
 
 El usuario final no necesitará instalar la aplicación. Será accesible por web usando cualquier navegador. Para este propósito, la aplicación será desarrollada en Java usando la estructura Spring Boot, y desplegada en Heroku. 
 
 Cada usuario requerirá de un nombre de usuario y una contraseña. Estos le serán proporcionados por el desarrollador de manera individual y confidencial. No habrá manera de generar nuevos usuarios desde la aplicación. Esto con el fin de proteger la seguridad de la información de la empresa.
 
 Al arrancar la aplicación, el usuario deberá ingresar su usuario y contraseña para poder generar una sesión, y acceder a la aplicación. 
 
 Una vez dentro de la aplicación, habrá una vista de una tabla con todas las operaciones ("deals") del año en curso. Habrá ligas a metodos para consultar tablas de años anteriores, crear una nueva operación (adicionarla a la tabla), o buscar una operación usando un número de PO. Finalmente, en la misma tabla habrá una columna que contengan ligas a dos acciones que se pueden realizar en cada fila (operación comercial, o "deal"): editar los datos de la fila, o eliminar la fila.
