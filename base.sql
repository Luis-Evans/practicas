create database login;

use login;

create table tabla (
	usere nvarchar(50),
    pass nvarchar(50)
);

insert into tabla values ('angel', 2016090301);

select * from tabla where usere = 'angel' and pass = 2016090301;