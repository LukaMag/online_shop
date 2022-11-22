create table suppliers
(
    id            bigserial not null
        constraint suppliers_pk
            primary key,
    supplier      varchar   not null,
    supplier_desc varchar
);

alter table suppliers
    owner to postgres;

