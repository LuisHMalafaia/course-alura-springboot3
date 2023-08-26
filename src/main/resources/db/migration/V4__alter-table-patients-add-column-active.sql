alter table patients add active tinyint;
go
update patients set active = 1;