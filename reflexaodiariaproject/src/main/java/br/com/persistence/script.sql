drop database  if exists pensamentodiario;
create database pensamentodiario;
use pensamentodiario;

create table usuario(id int primary key not null AUTO_INCREMENT,
nome varchar(255)not null,
email varchar(255)not null,
senha varchar(255)not null,
adm boolean not null DEFAULT false
); 

create table pensamento(id int primary key not null AUTO_INCREMENT,
nome varchar(255) not null,
conteudo long varchar not null,
data date not null,
usuarioid int ,
FOREIGN KEY (usuarioid) REFERENCES usuario(id)
);



insert into usuario values (1,'teste','teste@email','123',false);
insert into usuario  (nome,email,senha,adm) values ('teste2','teste@email','123',false);

insert into pensamento values (1,'primeiropensamento2','orem ipsum dolor sit amet, consectetur adipiscing elit. Nulla feugiat tellus eget justo placerat, at accumsan eros pulvinar. Nam at turpis tellus. Sed a mi in tortor vehicula sollicitudin nec ut metus. Pellentesque vitae posuere diam. Fusce ex magna, scelerisque eu cursus et, egestas nec metus. Sed quis lacus dolor. Quisque posuere dui vel tortor efficitur, ut ornare purus mattis. Aliquam ut pretium nisl. Pellentesque pulvinar suscipit condimentum.',NOW(),1);
insert into pensamento values (2,'primeiropensamento2','orem ipsum dolor sit amet, consectetur adipiscing elit. Nulla feugiat tellus eget justo placerat, at accumsan eros pulvinar. Nam at turpis tellus. Sed a mi in tortor vehicula sollicitudin nec ut metus. Pellentesque vitae posuere diam. Fusce ex magna, scelerisque eu cursus et, egestas nec metus. Sed quis lacus dolor. Quisque posuere dui vel tortor efficitur, ut ornare purus mattis. Aliquam ut pretium nisl. Pellentesque pulvinar suscipit condimentum.',NOW(),2);


