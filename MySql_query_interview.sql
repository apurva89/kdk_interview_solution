-- MySql Db Queries:-

CREATE table int_numbers (num integer);

insert into int_numbers values (7);
insert into int_numbers values (15);
insert into int_numbers values (3);
insert into int_numbers values (0);
insert into int_numbers values (10);
insert into int_numbers values (19);
insert into int_numbers values (14);

SELECT * from int_numbers;

-- Query to sort numbers based on 1's in binary representation:-

SELECT a.finalNum from (
	SELECT num as finalNum, BIN(num), LENGTH(REPLACE(BIN(num), '0', '')) as countBit from int_numbers
	) as a 
order by a.countBit desc, a.finalNum desc;