use SistemaVentasAM



-- DOCUMENTO DE VENTA
/*CREANDO PROCEDIMIENTO ALMACENADO*/
select * from DocumentoVenta

CREATE PROCEDURE insertarDocumento
(
	@Cod varchar(6),
	@TipoDoc char(7),
	@OrdenRemision varchar(11),
	@RazonSocial varchar(50),
	@Ruc varchar(11),
	@FechaEmision Date
)
AS BEGIN
	INSERT INTO DocumentoVenta 
	values (@Cod,@TipoDoc,@OrdenRemision,@RazonSocial,@Ruc,@FechaEmision);
END;





select * from Cliente

CREATE PROCEDURE insertarCliente 
(
	@dni varchar(8),
	@nom varchar(30),
	@ap varchar(30),
	@tele char(9),
	@Correo varchar(30),
	@Direccion varchar(50),
	@Provincia varchar(35)
	) AS BEGIN
		INSERT INTO Cliente
		VALUES (@dni,@nom,@ap,@tele,@Correo,@Direccion,@Provincia);
	END;


	select * from UsuarioEmpleado

	CREATE PROCEDURE mostrarUsuarios 
		AS BEGIN 
		 SELECT a.Usuario , a.Password FROM UsuarioEmpleado a;
	END;

	exec mostrarUsuarios







	select * from Empleado
	select * from PuestoSalario

	CREATE PROCEDURE mostrarDatosEmpleados
	 AS BEGIN
		select a.Nombres, a.Apellidos,b.Puesto , a.DNI,a.Telefono from Empleado a
		inner join PuestoSalario b on(a.PuestoID = b.IDPuesto);
	END;


	exec mostrarDatosEmpleados

	 






	/*
select a.NombreProduc , b.CantidadPedidos , a.Color , a. Medida,a.PrecioUnit,b.PrecioTotal,  
d.Nombres,d.Apellidos,d.Correo,d.Telefono,d.DNI,e.RazonSocial,e.RUC,e.TipoDoc,e.OrdenRemision,e.fechaEmision,
d.Direccion,d.Provincia, f.EmpleadoID,e.CodDoc
from Productos a
inner join detalleOrdenes b on(a.ProductoID = b.ProductoID)
inner join Ordenes c on(c.OrdenID = b.OrdenID)
inner join Cliente d on(c.DNI_Cliente = d.DNI)
inner join DocumentoVenta e on(c.CodDoc = e.CodDoc)
inner join Empleado f on(f.EmpleadoID = c.EmpleadoID)
;*/





CREATE PROCEDURE  insertarRegistro
(	
	@cod int,
	@nPro varchar(50),
	@med varchar(20),
	@Color varchar(20),
	@PrecioU money
) AS BEGIN
	INSERT INTO Productos
	values(@cod,@nPro,@med,@Color,@PrecioU);
	END;




CREATE PROCEDURE  ingresarOrden
(
@ordenID int,
@dni varchar(8),
@empladoId int,
@codDoc varchar(6)
)
AS BEGIN
INSERT INTO Ordenes (OrdenID,DNI_Cliente,EmpleadoID,CodDoc)
VALUES(@ordenID,@dni,@empladoId,@codDoc);
END;


exec ingresarOrden 6,'aa',1,'asdas';

select * from DocumentoVenta
select * from Productos
select * from Ordenes



select * from Cliente
select * from DocumentoVenta
select * from Ordenes
select * from Productos
select * from detalleOrdenes

delete Productos
where ProductoID =12

delete Productos
where ProductoID = 12


select * from detalleOrdenes
/*
CREATE PROCEDURE ingresoDeDatos
(
@codDoc varchar(6),
@TipoDoc char(7),
@OrdenRemision varchar(11),
@RazonSocial varchar(50),
@Ruc varchar(11),
@FechaEmision Date,

@ordenID int,
@dni varchar(8),
@empladoId int,


@nom varchar(30),
@ap varchar(30),
@tele char(9),
@Correo varchar(30),
@Direccion varchar(50),
@Provincia varchar(35),

@codPro int,
@nPro varchar(50),
@med varchar(20),
@Color varchar(20),
@PrecioU money,

@cantidadPedidos int,
@precioTotal money
)
AS BEGIN
INSERT INTO DocumentoVenta 
values (@codDoc,@TipoDoc,@OrdenRemision,@RazonSocial,@Ruc,@FechaEmision);

INSERT INTO Ordenes 
VALUES(@ordenID,@dni,@empladoId,@codDoc);

INSERT INTO Cliente
VALUES (@dni,@nom,@ap,@tele,@Correo,@Direccion,@Provincia);

INSERT INTO Productos
	values(@codPro,@nPro,@med,@Color,@PrecioU);

INSERT INTO detalleOrdenes
VALUES(@ordenID,@codPro,@cantidadPedidos,@precioTotal)

END;

*/


select * from detalleOrdenes


create procedure insertarDetalleOrdenes
(
@ordenId int,
@proID int,
@cantidad int,
@preTotal money
) as begin

insert into detalleOrdenes
	values(@ordenId,@proID,@cantidad,@preTotal);
end;


create procedure insertarVentaDiaria
(
	@idVen int,
	@ventaTotal money,
	@fecha date
)AS BEGIN
 INSERT INTO VentasDiarias
 values(@idVen,@ventaTotal,@fecha);
 END;



 create procedure insertarReporteEmpleado
 (
 @idReport int,
 @cantidadVentaporEmpleado int,
 @cantidadVendidad money
 ) as begin
 INSERT INTO ReporteEmpleado
	VALUES(@idReport,@cantidadVentaporEmpleado,@cantidadVendidad);
	END;




 select * from VentasDiarias
 select * from ReporteEmpleado
 select * from DetalleVentaReporte

 select a.EmpleadoID,c.PrecioTotal,c.ProductoID, d.fechaEmision from Empleado a
 inner join Ordenes b on(a.EmpleadoID = b.EmpleadoID)
 inner join DocumentoVenta d on(d.CodDoc = b.CodDoc)
 inner join detalleOrdenes c on(c.OrdenID = b.OrdenID)


 exec insertarVentaDiaria 6,2,'2022-06-27'
 exec insertarReporteEmpleado 4,2,680.00
 insert into DetalleVentaReporte
 values(6,4,1)


 go


 use SistemaVentasAM

	select * from Productos

	CREATE PROCEDURE eliminarProducto
	(
		@idPro int
	)
	AS BEGIN 
	DELETE Productos
	WHERE ProductoID = @idPro;
	END;


	select * from detalleOrdenes
	select * from Ordenes
	select * from Cliente

	go