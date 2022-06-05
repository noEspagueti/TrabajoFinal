CREATE DATABASE SistemaVentasAM

use SistemaVentasAM

create table CredencialesUsuarios(
	IdCredencial int not null identity(1,1) primary key,
	Usuario nvarchar(15) not null,
	PassWord varchar(15) not null,
	estado varchar(15) not null
)

select * from CredencialesUsuarios