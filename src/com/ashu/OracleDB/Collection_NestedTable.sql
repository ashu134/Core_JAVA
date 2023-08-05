declare 
    type e_list is table of varchar2(50);
    t_emps e_list;
begin
    t_emps := e_list('ashutosh','Kumar','verma','Aurangabad','Bihar');
    t_emps.extend; -- Before Assigning New value need to extend the record first
    t_emps(6) := 'Jamhor'; -- Assigned new value 
    for i in 1..t_emps.last() loop
     DBMS_OUTPUT.PUT_LINE(t_emps(i));
     end loop;
end;
/

declare 
    type e_list is table of employees.first_name%TYPE;
    t_emps e_list :=e_list();
    idx PLS_INTEGER := 1;
    c integer := 0;
begin
    for i in 100..110 loop
    t_emps.extend; -- Before Assigning New value need to extend the record first
    select first_name into t_emps(idx) from employees where employee_id= i; 
    c :=c+1;
    DBMS_OUTPUT.PUT_LINE(c||' '||t_emps(idx));
    idx :=idx+1;
    end loop;
    t_emps.DELETE(1);  -- data deleted at index 1
    
    for x in 1..t_emps.count() loop
    if(t_emps.exists(x)) then -- Exists function will check if elements are present then it will print 
     DBMS_OUTPUT.PUT_LINE(t_emps(x));
    else
     DBMS_OUTPUT.PUT_LINE('No data Found at index '|| x);
    end if;
     end loop;
end;