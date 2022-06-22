use SistemaVentasAM



-- DOCUMENTO DE VENTA
/*CREANDO PROCEDIMIENTO ALMACENADO*/

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




select * from DocumentoVenta
order by OrdenRemision

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

	insert into UsuarioEmpleado
	values(12,'admin1','admin'),(13,'admin2','admin2'),(14,'admin3','admin3')


	CREATE PROCEDURE mostrarUsuarios 
		AS BEGIN 
		 SELECT a.Usuario , a.Password FROM UsuarioEmpleado a;
	END;

	exec mostrarUsuarios

	use SistemaVentasAM

	select * from UsuarioEmpleado


	select * from Cliente

	select * from DocumentoVenta