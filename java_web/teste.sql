use aranoua_java_web;

-- criar tabela
create table pessoa2(
id int auto_increment primary key,
nome varchar(255) not null,
email varchar(255) not null unique
);

-- mostrar tabelas
show tables;

-- inserir
insert into pessoa2
(nome, email)
values
('Alysson', 'alysson.gabriel61@gmail.com'),
('Gabriel', 'gabriel28@gmail.com');

-- listar
select id, nome, email from pessoa2;

-- alterar
update pessoa2
set nome = 'Lucas'
where id = 2;

-- deletar
delete from pessoa2
where id = 2;