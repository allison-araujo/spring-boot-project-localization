create table tb_city(
        id_city bigint not null primary key,
        name varchar(50) not null,
        qty_population bigint

 );

 insert into tb_city
    (id_city,name,qty_population)
 values
    (1,'Corumba',1239627878),
    (2,'Ladario', 130550000),
    (3,'fortelaze',800054000),
    (4,'Terenos',12645475),
    (5,'CG',1445555),
    (6,'Aquidauana',974687856),
    (7,'Porto Aquidauana',978784656),
    (8,'Porto velho',1000000);


