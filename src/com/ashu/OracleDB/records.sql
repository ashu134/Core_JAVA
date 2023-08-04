
declare 
    r_emp employees%rowtype;
begin
--Record process only one data at a time 
    select * into r_emp from employees where employee_id=101;
    dbms_output.put_line(r_emp.first_name);
    r_emp.first_name :='Aashutosh kumar';
    dbms_output.put_line(r_emp.first_name);
end;

-- Put record in loop you can get as many data you want 
declare 
    r_emp employees%rowtype;
begin
for i in 1..10 loop
    select * into r_emp from employees where employee_id=101+i;
    dbms_output.put_line(r_emp.first_name);
    r_emp.first_name :='Aashutosh kumar';
    dbms_output.put_line(r_emp.first_name);
    end loop;
end;

--User defined Records
/
declare 
    type t_emp is record (first_name varchar(50),
                        last_name employees.last_name%type,
                        sal employees.salary%type);
    r_emp t_emp;
begin
    r_emp.first_name := 'Aashutosh';
    r_emp.last_name := 'kumar';
    r_emp.sal := '30000';
    select first_name,last_name,salary into r_emp from employees where employee_id=100;
    dbms_output.put_line(r_emp.first_name ||' '|| r_emp.last_name || ' has salary '|| r_emp.sal);
end;