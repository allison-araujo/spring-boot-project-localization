create table tb_city(
        id_city bigint not null primary key,
        name varchar(50) not null,
        qty_population bigint

 );

 insert into tb_city
    (id_city,name,qty_population)
 values
    (1,'Corumba',123962),
    (2,'Ladario', 10000),
    (3,'fortelaze',8000000)


