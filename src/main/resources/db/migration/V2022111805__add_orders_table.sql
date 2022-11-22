create table orders
(
    id              bigserial                           not null
        constraint orders_pk
            primary key,
    user_id         bigserial                           not null
        constraint orders___fk_user_id
            references users
            on update cascade on delete cascade,
    cloth_id        bigserial                           not null
        constraint orders___fk_cloth_id
            references clothes
            on update cascade on delete cascade,
    qty             bigint                              not null,
    action_datetime timestamp default CURRENT_TIMESTAMP not null
);

alter table orders
    owner to postgres;

