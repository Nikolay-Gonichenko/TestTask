create table title
(
    code        varchar primary key,
    description varchar,
    theme       varchar
);

create table position
(
    id   varchar primary key,
    name varchar
);

create table author
(
    id          varchar primary key,
    last_name     varchar,
    name        varchar,
    second_name varchar,
    position_id varchar
        constraint author_position_fk
            references position(id)
);

insert into title(code, description, theme)
values ('A1', 'Официальное письмо марсианам от жителей Земли', 'Добыча полезных ископаемых'),
       ('A2', 'Официальное письмо народу Татуина от землян ', 'Озеленение пустыни'),
       ('A3', 'Официальное письмо воганам от жителей Земли', 'Расширение межзвездной навигации');

insert into position(id, name)
values ('7432234555', 'Старший научный сотрудник по добыче полезных ископаемых'),
       ('3676545567', 'Директор департамента озеленения пустынь'),
       ('6575677888', 'Главный инженер по строительству межзвездных автострад'),
       ('9655677677', 'Руководитель отдела взаимодействия с внеземными цивилизациями');

insert into author(id, last_name, name, second_name, position_id)
values ('ISO_639-1', 'Иванов', 'Иван', 'Иванович', '7432234555'),
       ('ISO_965-44', 'Сидорова', 'Наталья', 'Николаевна', '3676545567'),
       ('ISO_139-5', 'Петров', 'Перт', 'Петрович', '6575677888'),
       ('ISO_8568-5', 'Плюшкина', 'Ирина', '', '7432234555');