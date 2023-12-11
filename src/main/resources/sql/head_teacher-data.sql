INSERT INTO head_teacher(first_name,last_name,middle_name,login,password) VALUES
('Куликова', 'Татьяна', 'Владимировна', 'kulikovaTV', '12345678'),
('Алексеева', 'Надежда', 'Ивановна', substr(md5(random()::text), 0, 9) , substr(md5(random()::text), 0, 9)),
('Ильина', 'Галина', 'Дмитриевна', substr(md5(random()::text), 0, 9) , substr(md5(random()::text), 0, 9)),
('Титова', 'Ксения', 'Валентиновна', substr(md5(random()::text), 0, 9) , substr(md5(random()::text), 0, 9)),
('Максимова', 'Наталья', 'Александровна', substr(md5(random()::text), 0, 9) , substr(md5(random()::text), 0, 9));