select epe.name as Employee
from Employee as epe 
left join Employee as mng
on epe.managerid = mng.id 
where epe.salary > mng.salary ;