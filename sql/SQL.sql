use SistemaVentasAM

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
	EmpleadoID int identity(1,1) not null,
	Puesto varchar(30) not null,
	Nombres varchar(30) not null,
	Apellidos varchar(30) not null,
	DNI char(8) not null,
	Telefono char(9),
	primary key(EmpleadoID)
	);


		create table UsuarioEmpleado(
		numCred int identity(1,1) not null,
		EmpleadoID int,
		Usuario varchar(25),
		Password varchar(50),
		primary key(numCred),
		foreign key (EmpleadoID) references Empleado(EmpleadoID)
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
	 OrdenID int identity(1,1) not null,
	 DNI_Cliente char(8),
	 EmpleadoID int ,
	 CodDoc varchar(6) not null,
	 primary key(OrdenID),
	 foreign key(DNI_Cliente)references Cliente(DNI),
	 foreign key (CodDoc) references DocumentoVenta(CodDoc),
	 foreign key (EmpleadoID) references Empleado(EmpleadoID)
	);



	create table Productos(
		ProductoID int identity(1,1) not null,
		NombreProduc varchar(50),
		Descripcion varchar(80),
		Medida varchar(20),
		Color varchar(20),
		PrecioUnit money,
		primary key (ProductoID),

	);


	create table detalleOrdenes(
		OrdenID int primary key not null,
		ProductoID int,
		CantidadPedidos int,
		PrecioTotal money,
		foreign key (OrdenID) references Ordenes(OrdenID),
		foreign key (ProductoID) references Productos(ProductoID)
	);



	create table inventario (
		IDinventario int identity(1,1) not null,
		ProductoID int ,
		Cant_Stock int,
		primary key(IDinventario),
		foreign key (ProductoID) references Productos(ProductoID)
	);

	/*
	alter table Empleado
	add  direccion varchar(40), distrito varchar(40),cumpleanio date

	alter table Empleado
	drop column Puesto;
	
	select * from Empleado 
	
	alter table Empleado
	add IDPuesto int references PuestoSalario(IDPuesto)
	
	*/

	select * from Empleado 


	
	create table PuestoSalario
	(
	 IDPuesto int identity(1,1) not null,
	 Puesto varchar(25) not null,
	 SalarioEmpleado money,
	 primary key(IDPuesto)	
	);


	create table VentasDiarias(
		IDVenta int identity(1,1) not null,
		VentaTotalDiaria money not null,
		fecha date not null,
		primary key(IDVenta)
	);



	create table ReporteEmpleado (
		IDReporte int identity(1,1) not null,
		CantidadVentasEmpleados money null,
		CantidadVendidas int null,
		primary key(IDReporte)
	);


	create table DetalleVentaReporte(
		IDVenta int not null,
		IDReporte int not null,
		EmpleadoID int not null,
		foreign key (IDVenta) references VentasDiarias(IDVenta),
		foreign key(IDReporte) references ReporteEmpleado(IDReporte),
		foreign key (EmpleadoID) references Empleado(EmpleadoID)
	);



	select * from Empleado

	insert into Empleado
	values('Betsy Yahaira','Bejar','75481234','997785254','Jr. Huanuco N°50','La Victoria','1992-12-28',1),
	('Carlos Andrés','Huaman','40785256','986695854','Calle José Arquímedes','Surco','1890-03-04',2),
	('Almendra','Jimenez','75610785','978462143','Av. Los Ciruelos','San Juan de Lurigancho','1993-05-03',2);



	select * from puestosalario

	insert into puestosalario (Puesto,SalarioEmpleado)
	values('Gerente Operaciones',2500.00),
	('Vendedor',1800.00)