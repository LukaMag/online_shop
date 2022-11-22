insert into categories(category, "category_desc")
values ('Headbands','Using by some gangs'),
       ('Dress','Using by ladies, sometimes gentlemen'),
       ('Crocks','The greatest investigation of human civilization');

insert into suppliers(supplier, supplier_desc)
values ('Gucci','Using by luxury and royal persons'),
       ('H&M','Using by average humans'),
       ('Crocks','The greatest investigation of human civilization, those likes everyone');


insert into clothes(name, size,color,category_id, sex, price, release, supplier_id)
values ('Gucci Lady Dress','m','red',2,'female',2500.00,'2021-01-08',1),
       ('H&M Man HeadBand','l','black',1,'male',25.00,'2021-10-28',2),
       ('Crocks ExtraGenius','42','ultimate',3,'uni',145.00,'2021-12-16',3);

insert into users(name, last_name, phone, address, born)
values ('John','Doe','+996788146525','st Chuy 46/2','1995-12-25'),
       ('Phillip','Jackson','+996708781022','st Krylov 4','1978-02-05'),
       ('Sara','Smith','+996550107894','st Oblomova 78/14','2002-10-01');

insert into orders(user_id, cloth_id, qty)
values (1,2,4),
       (2,1,25),
       (3,3,1),
       (2,1,4);