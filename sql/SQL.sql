use SistemaVentasAM

create table Cliente (
	DNI char(8),
	Nombres varchar(30),
	Apellidos varchar(30),
	Telefono char(9),
	Correo varchar(30),
	Direccion varchar(50),
	Provincia varchar(35),
	primary key(DNI)
)


create table Empleado(
	EmpleadoID int identity(1,1),
	Puesto varchar(30),
	Nombres varchar(30),
	Apellidos varchar(30),
	DNI char(8),
	Telefono char(9),
	primary key(EmpleadoID)
	);


		create table UsuarioEmpleado(
		numCred int identity(1,1),
		EmpleadoID int,
		Usuario varchar(25),
		Password varchar(50),
		primary key(numCred),
		foreign key (EmpleadoID) references Empleado(EmpleadoID)
	);


	
	create table DocumentoVenta(
		CodDoc char(5),
		TipoDoc char(7),
		OrdenRemision varchar(11),
		RazonSocial varchar(50),
		RUC varchar(11),
		fechaEmision Date,
		primary key(CodDoc)
	);

	create table Ordenes (
	 OrdenID int identity(1,1),
	 DNI_Cliente char(8),
	 EmpleadoID int ,
	 CodDoc char(5)
	 primary key(OrdenID),
	 foreign key(DNI_Cliente)references Cliente(DNI),
	 foreign key (CodDoc) references DocumentoVenta(CodDoc)
	);



	create table Productos(
		ProductoID int identity(1,1),
		NombreProduc varchar(50),
		Descripcion varchar(80),
		Medida varchar(20),
		Color varchar(20),
		PrecioUnit money,
		primary key (ProductoID),

	);


	create table detalleOrdenes(
		OrdenID int primary key,
		ProductoID int,
		CantidadPedidos int,
		PrecioTotal money,
		foreign key (OrdenID) references Ordenes(OrdenID),
		foreign key (ProductoID) references Productos(ProductoID)
	);

