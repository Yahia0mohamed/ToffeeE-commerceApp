create table Users(
	customerID varchar(30) primary key,
	[name] varchar(30) not  null,
	[address] varchar(255),
	email varchar(60),
	[password] varchar(30),
	phoneNUM varchar(15)
);

create table items(
	itemID varchar(30) primary key,
	[name] varchar(30) not  null,
	price float not null,
	discountVal float,
	discounted bit,
	stored int,
	loyaltyPoints smallint
);

create table orders(
	customerID varchar(30) foreign key references Users(customerID),
	price float not null,
	delivered bit not null,
);

/*price=price*(discountVal*discounted)*/


select * from Users;