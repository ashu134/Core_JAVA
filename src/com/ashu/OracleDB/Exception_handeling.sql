
declare
    too_high_salary exception;   --Exception Declaration 
    v_salary_check PLS_INTEGER;
begin 
    select salary into v_salary_check from employees where employee_id=100;
    if v_salary_check > 20000 then 
        raise too_high_salary;   -- Raise exception 
    end if;
    dbms_output.put_line('The salary is too high');
    EXCEPTION                    --Handling Exception 
    when too_high_salary then
    dbms_output.put_line('The salary is too high');
end;
/

--Raise_application_Error procedure

declare
    too_high_salary exception;   --Exception Declaration 
    v_salary_check PLS_INTEGER;
begin 
    select salary into v_salary_check from employees where employee_id=100;
    if v_salary_check > 20000 then 
        --raise_application_error(-20111,'Salary of employee is too high'); -- Raise exception
        raise too_high_salary;
    end if;
    --dbms_output.put_line('The salary is too high');
    EXCEPTION                    --Handling Exception 
    when too_high_salary then
    dbms_output.put_line('The salary is too high');
    raise_application_error(-20111,'the Salary of employee is too high');
end;
/
declare
 v_name varchar2(5);
begin
 select first_name into v_name from employees where employee_id = 100;
 dbms_output.put_line('Hello'||v_name);
exception
 when no_data_found then
  dbms_output.put_line('There is no employee with the selected id');
 end exception;
end;









