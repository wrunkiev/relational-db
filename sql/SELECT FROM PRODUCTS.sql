select * from products p
where p.cost_price = 50 and p.name = 'toy123';

select * from products p
where p.id = 1005 or p.cost_price < 50;

select * from products p
where p.id > 1005 and p.manufacturer_name = 'someManufacturer';

select * from products;

update products p set p.manufacturer_name = 'china' where p.name = 't-shirt';

delete from products p where p.id < 1050;



























