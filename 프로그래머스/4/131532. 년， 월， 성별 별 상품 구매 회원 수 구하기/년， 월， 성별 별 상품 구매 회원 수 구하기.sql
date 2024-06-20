with a as
(

select year(b.sales_date) as YEAR  ,month(b.sales_date) as month,a.gender,count(distinct(user_id)) as users
from user_info a join ONLINE_SALE b using(user_id)
where a.gender is not null
group by 1,2,3

)

select * from a
order by a.year,a.month,a.gender asc