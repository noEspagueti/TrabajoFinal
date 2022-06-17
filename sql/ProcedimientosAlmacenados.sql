use SistemaVentasAM



-- DOCUMENTO DE VENTA
/*CREANDO PROCEDIMIENTO ALMACENADO*/

CREATE PROCEDURE insertarDocumento
(
	@Cod int,
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


exec insertarDocumento 1,'Factura','T001-000001','Mayoristas Almohadas S.A.C.','12345678977','2022-06-16';




INSERT INTO DocumentoVenta 
values ('a','Factura','T001-000001','Mayoristas Almohadas S.A.C.','12345678977','2022-06-16')


select * from DocumentoVenta;

delete from DocumentoVenta
where CodDoc = 1