create table patients (
    id bigint identity not null,
    name varchar(255),
    email varchar(255),
    phone varchar(255),
    cpf varchar(255),
    cep varchar(255),
    city varchar(255),
    complement varchar(255),
    neighborhood varchar(255),
    number varchar(255),
    street varchar(255),
    uf varchar(255),
    primary key (id)
)