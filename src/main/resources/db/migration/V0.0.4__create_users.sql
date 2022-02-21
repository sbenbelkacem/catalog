CREATE TABLE IF NOT EXISTS people
(
    username varchar(64) primary key,
    role     varchar(64)
);

insert into people (username, role) values ('msadod', 'ADMIN');
insert into people (username, role) values ('mchekini', 'WRITER');
insert into people (username, role) values ('sbenbelkacem', 'READER');
