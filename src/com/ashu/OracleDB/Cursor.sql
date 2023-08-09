declare 
    cursor c_emps is 
    select first_name, Last_name, DEPARTMENT_NAME from employees 
        join DEPARTMENTS using (DEPARTMENT_ID)
        where department_id between 1 and 100;
    v_first_name employees.first_name%TYPE;
    v_last_name employees.last_name%TYPE;
    dept departments.department_name%type;
begin
 open c_emps;
 for i in 1..20 loop
 fetch c_emps into v_first_name,v_last_name,dept;
 dbms_output.put_line(i||'. '||v_first_name || ' '||v_last_name||' - '||dept);
 end loop;
 close c_emps;
end;

--Cursor With records
/
declare 
    type r_emps is record (
    v_first_name employees.first_name%TYPE,
    v_last_name employees.last_name%TYPE
    --dept departments.department_name%type
    );
    v_emps r_emps;
    cursor c_emps is select first_name,last_name from employees;
begin
 open c_emps;
 --for i in 1..20 loop
 fetch c_emps into v_emps;
 dbms_output.put_line(v_emps.v_first_name || ' '||v_emps.v_last_name);
 --end loop;
 close c_emps;
end;

/
--Best use of cursor with records 
declare
    cursor c_emps is select first_name,last_name from employees;
    v_emps c_emps%rowtype;
begin
    open c_emps;
    fetch c_emps into v_emps;
    dbms_output.put_line(v_emps.first_name||' '||v_emps.last_name);
    close c_emps;
end;
/


