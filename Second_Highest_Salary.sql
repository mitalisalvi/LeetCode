Select max(Salary) As SecondHighestSalary
From Employee 
Where Salary < (Select max(Salary) From Employee  );