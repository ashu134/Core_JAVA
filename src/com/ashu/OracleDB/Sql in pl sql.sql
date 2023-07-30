set serveroutput on;
declare 
    V_name Varchar(20);
    v_empid employees.employee_id%type;
    v_salary employees.salary%type;
begin 
    select first_name, salary into v_name,v_salary from employees where employee_id=100;
    dbms_output.put_line('Employee '|| v_name || ' has Salary '|| v_salary);
end;