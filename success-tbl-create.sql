use arivana;

create table Success (
ID 			integer		primary key auto_increment,
ColumnName	integer	not null,
Roll		integer		not null,
Successful	boolean		not null default false,
Critical	boolean		not null default false
);