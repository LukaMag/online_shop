create table clothes
(
    id      bigint           not null
        constraint shoes_pkey
            primary key,
    color   varchar(255),
    price   double precision not null,
    release date,
    sex     varchar(255),
    size    varchar(255),
    type    varchar(255)
);

alter table clothes
    owner to postgres;