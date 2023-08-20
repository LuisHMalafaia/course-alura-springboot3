alter table medics add active tinyint;
go
update medics set active = 1;