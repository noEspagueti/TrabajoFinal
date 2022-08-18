use SistemaVentasAM

select * from Cliente
select fechaEmision from DocumentoVenta
order by 1
select * from Productos
select * from Ordenes
order by 1
select * from detalleOrdenes
order by 1

delete DocumentoVenta
where ruc ='bb'

DELETE Productos
WHERE ProductoID = 13

delete Cliente
where DNI = 'bb'

exec mostrarListaVentas


select * from VentasDiarias

delete VentasDiarias
where IDVenta between 6 and 7


select * from UsuarioEmpleado


select * from Empleado
select * from PuestoSalario