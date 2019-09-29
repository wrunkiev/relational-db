-- количество фильмов снятых каждым режисером (Director)
select
count(*) count_of_films,
m.director
from
movie m,
movie_stat ms
where
m.id = ms.movie_id
group by m.director;

-- количество DOMESTIC_SALES и INTERNATIONAL_SALES для каждого режиссера (Director)
select
count(*) count_of_domestic,
count(*) count_Of_int,
m.director
from
movie m,
movie_stat ms
where
m.id = ms.movie_id
group by m.director;

-- выборка всех фильмов от самый новых до самых старых по убыванию
select
*
from
movie m,
movie_stat ms
where
m.id = ms.movie_id
order by m.year desc

-- выборка с таблицы MOVIE_STAT с наибольшими INTERNATIONAL_SALES по убыванию
select
*
from
movie_stat ms
order by ms.international_sales desc



