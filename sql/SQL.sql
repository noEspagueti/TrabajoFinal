use SistemaVentasAM;

create table Cliente (
	DNI char(8) not null,
	Nombres varchar(30) not null,
	Apellidos varchar(30) not null,
	Telefono char(9) ,
	Correo varchar(30),
	Direccion varchar(50) not null,
	Provincia varchar(35) not null,
	primary key(DNI)
)


create table Empleado(
	EmpleadoID int  not null,
	PuestoID int,
	Nombres varchar(30) not null,
	Apellidos varchar(30) not null,
	DNI char(8) not null,
	Telefono char(9),
	Direccion varchar(50),
	Distrito varchar(30),
	FechaNacimiento date,
	primary key(EmpleadoID),
	foreign key (PuestoID) references PuestoSalario(IDPuesto)
);

alter table Empleado	
add  FechaNacimiento date

	create table UsuarioEmpleado(
		numCred int not null,
		EmpleadoID int,
		Usuario varchar(25),
		Password varchar(50),
		primary key(numCred),
		foreign key (EmpleadoID) references Empleado(EmpleadoID)
		on delete set null
	);


	
	create table DocumentoVenta(
		CodDoc varchar(6) not null,
		TipoDoc char(7),
		OrdenRemision varchar(11),
		RazonSocial varchar(50),
		RUC varchar(11),
		fechaEmision Date,
		primary key(CodDoc)
	);



	create table Ordenes (
	 OrdenID int  not null,
	 DNI_Cliente char(8),
	 EmpleadoID int ,
	 CodDoc varchar(6) not null,
	 primary key(OrdenID),
	 foreign key(DNI_Cliente)references Cliente(DNI)
	 on delete cascade on update cascade ,
	 foreign key (CodDoc) references DocumentoVenta(CodDoc)
	 on delete cascade on update cascade ,
	 foreign key (EmpleadoID) references Empleado(EmpleadoID)
	 on delete cascade on update cascade 
	);



	create table Productos(
		ProductoID int  not null,
		NombreProduc varchar(50),
		Medida varchar(20),
		Color varchar(20),
		PrecioUnit money,
		primary key (ProductoID)
	);


	create table detalleOrdenes(
		OrdenID int not null,
		ProductoID int,
		CantidadPedidos int,
		PrecioTotal money,
		foreign key (OrdenID) references Ordenes(OrdenID)
		on delete cascade on update cascade ,
		foreign key (ProductoID) references Productos(ProductoID)
		on delete cascade on update cascade 
	);


	
	create table PuestoSalario(
	 IDPuesto int  not null,
	 Puesto varchar(25) not null,
	 SalarioEmpleado money,
	 primary key(IDPuesto)	
	);


	create table VentasDiarias(
		IDVenta int  not null,
		VentaTotalDiaria int not null,
		fecha date not null,
		primary key(IDVenta)
	);



	create table ReporteEmpleado (
		IDReporte int not null,
		CantidadVentasEmpleados int null,
		CantidadVendidas money null,
		primary key(IDReporte)
	);


	create table DetalleVentaReporte(
		IDVenta int not null,
		IDReporte int not null,
		EmpleadoID int not null,
		foreign key (IDVenta) references VentasDiarias(IDVenta)
		on delete cascade on update cascade,
		foreign key(IDReporte) references ReporteEmpleado(IDReporte)
		on delete cascade on update cascade,
		foreign key (EmpleadoID) references Empleado(EmpleadoID)
		on delete cascade on update cascade
	);






	select * from Empleado
	delete Empleado
	insert into Empleado 
	values(1,1,'Yahaira','Bejar','75481234','997785254','Jr. Huanuco N°50','La Victoria','1992-12-28'),
	(2,2,' Andrés','Huaman','40785256','986695854','Calle José Arquímedes','Surco','1890-03-04'),
	(3,2,'Almendra','Jimenez','75610785','978462143','Av. Los Ciruelos','San Juan de Lurigancho','1993-05-03');



	select * from puestosalario
	delete PuestoSalario
	insert into puestosalario (IDPuesto,Puesto,SalarioEmpleado)
	values(1,'Gerente de Operaciones',2500.00),
	(2,'Vendedor',1800.00)


	select * from UsuarioEmpleado


	insert into UsuarioEmpleado
	values(1,1,'admin1','admin'),(2,2,'admin2','admin2'),(3,3,'admin3','admin3')


	select * from Cliente

	insert into Cliente
	values ('75610782','Miguel Angelo','Silva Gómez','997748525','angelo@mail.com','Calle Los Alamos N°12','Lima'),
	('84532954','Susan Mishell ','Espinoza Ramos','978854239','susan@mail.com','Calle Las Cantuarias','Lima'),
	('78054658','Danny Hiram','Gómez Silvera','974852654','danny@mail.com','Calle Quetín Vidal Mz D','Lima'),
	('75610324','Mery susan','Hinostroza R.','924532456','mery@mail.com','Calle José Penza','Cajamarca'),
	('85456523','Juan Pablo','Escobar rojas','924565321','pablo@mail.com','Calle Los ángeles n°12','Cuzco')


	select * from DocumentoVenta

	insert into DocumentoVenta
	values('abcde','Factura','T001-00001','Mayorista Textiles S.A.C.','12345678999','2018-05-12'),
	('abcdf','Factura','T001-00002','Importadores Maestro S.A.C.','78954612387','2020-05-12'),
	('abcdg','Factura','T001-00003','Almohadas Import S.A.C.','96385274178','2020-08-18'),
	('abcdh','Factura','T001-00004','Almohadas Peruvian S.A.C.','74185296332','2020-08-20'),
	('abcdi','Factura','T001-00005','Import Red S.A.C.','98765432112','2022-08-20');


	select * from Ordenes
	select * from Empleado
	
	insert into Ordenes
	values (1,'75610782',1,'abcde'),(2,'84532954',1,'abcdf'),(3,'78054658',2,'abcdg'),
	(4,'75610324',2,'abcdh'),(5,'85456523',3,'abcdi');


	select * from Productos
	insert into Productos
	values(1,'Almohada Punto','40cmx60cm','Blanco',12.0),
	(2,'Almohada Punto Grande','50cmx70cm','Negro',17.0),
	(3,'Almohada Popelina','45cmx65cm','Blanco',10.0),
	(4,'Almohada Punto','40cmx60cm','Blanco',12.0),
	(5,'Almohada Económica','40cmx60cm','Blanco',8.0),
	(6,'Almohada Canon','45cmx60cm','Blanco',13.0),
	(7,'Almohada Punto','40cmx60cm','Blanco',12.0),
	(8,'Almohada Punto medio','45cmx65cm','Blanco',15.0),
	(9,'Almohada Punto Grande','50cmx70cm','Plomo',17.0),
	(10,'Almohada Popelina','45cmx65cm','Blanco',10.0),
	(11,'Almohada Popelina','45cmx65cm','Blanco',10.0);


	----------------------
	select * from detalleOrdenes
	select * from Ordenes

	insert into detalleOrdenes
	values(1,1,30,360),(1,2,20,340),(2,3,40,400),(2,4,10,120),(3,5,50,400),
	(4,6,20,260),(4,7,10,120),(5,8,10,150),(5,9,10,100),(5,10,10,100),(5,11,10,100);


	--------

	select distinct a.*,b.EmpleadoID, c.CantidadPedidos,d.fechaEmision from Ordenes a
	inner join Empleado b on(a.EmpleadoID = b.EmpleadoID)
	inner join detalleOrdenes c on(c.OrdenID = a.OrdenID)
	inner join DocumentoVenta d on(d.CodDoc = a.CodDoc)

	


	select * from VentasDiarias
	insert into VentasDiarias
	values (1,50,'2018-05-12'),
	(2,50,'2020-05-12'),
	(3,50,'2020-08-18'),
	(4,30,'2020-08-20'),
	(5,10,'2022-08-20');
	


	select * from ReporteEmpleado


	
	select  a.*,b.EmpleadoID, c.CantidadPedidos,d.fechaEmision, c.PrecioTotal from Ordenes a
	inner join Empleado b on(a.EmpleadoID = b.EmpleadoID)
	inner join detalleOrdenes c on(c.OrdenID = a.OrdenID)
	inner join DocumentoVenta d on(d.CodDoc = a.CodDoc)

insert into ReporteEmpleado
values (1,4,1220),(2,3,780),(3,2,450);

	delete ReporteEmpleado
	where IDReporte = 3

		
	select distinct a.*,b.EmpleadoID, c.CantidadPedidos,d.fechaEmision, c.PrecioTotal from Ordenes a
	inner join Empleado b on(a.EmpleadoID = b.EmpleadoID)
	inner join detalleOrdenes c on(c.OrdenID = a.OrdenID)
	inner join DocumentoVenta d on(d.CodDoc = a.CodDoc)

	select * from DetalleVentaReporte
	select * from VentasDiarias
	select * from ReporteEmpleado

	insert into DetalleVentaReporte
	values (1,1,1),(2,1,1),(3,2,2),(4,2,2),(5,3,3)


	select * from DetalleVentaReporte


	--	


	select * from Cliente
	select * from Ordenes
	select * from Empleado


	select (e.Nombres + '' + e.Apellidos) 'Nombre Cliente', e.DNI as'Documento de Indentidad',
	b.Nombres as 'Nombre Empleado',d.NombreProduc as 'Nombre pedido', c.CantidadPedidos	from Ordenes a 
	inner join Empleado b on(b.EmpleadoID = a.EmpleadoID)
	inner join detalleOrdenes c on(c.OrdenID = a.OrdenID)
	inner join Productos d on(d.ProductoID=c.ProductoID)
	inner join Cliente e on(e.DNI = a.DNI_Cliente)



	-- mostrar la cantidad de ventas de clientes y la cantidad de dinero total por nombre del empleado, se debe mostrar los nombres del empleado por orden alfabético


	select * from Empleado

	select * from Ordenes
	select * from detalleOrdenes

		select * from ReporteEmpleado

	select  a.Nombres
	,count(b.OrdenID) as 'cantidad de clientes',
	sum(c.PrecioTotal) as 'Dinero total'
	from Empleado a
	inner join Ordenes b on(b.EmpleadoID = a.EmpleadoID)
	inner join detalleOrdenes c on(c.OrdenID = b.OrdenID)
	group by a.Nombres
	order by 1

	go


	-- mostrar la cantidad de pedidos por cliente junto con sus nombres y documentos de dni y el dódico del documento de venta

	select * from Cliente
	
	select * from Ordenes
	select * from detalleOrdenes


	select a.Nombres,a.DNI, b.CodDoc as 'Cod. Documento Venta',sum(c.CantidadPedidos) as 'Cantidad de pedidos' from Cliente a
	inner join Ordenes b on(b.DNI_Cliente = a.DNI)
	inner join detalleOrdenes c on(c.OrdenID = b.OrdenID)
	group by a.Nombres , a.DNI , b.CodDoc




	delete Cliente where dni = 'aa'


	select * from Productos

	delete Productos
	where ProductoID between 12 and 13

	delete from DocumentoVenta


	select * from Ordenes


	select * from DocumentoVenta

	select * from Empleado