declare 
    type e_list is table of employees.first_name%type
    index by PLS_INTEGER;
    emps e_list;
begin
    FOR x in 100..110 loop
        select first_name into emps(x) from employees where employee_id =x;
    end loop;
    for i in emps.first()..emps.last() loop 
    DBMS_OUTPUT.PUT_LINE(emps(i));
    end loop;
end;
/



declare 
    type e_list is table of employees.first_name%type
    index by PLS_INTEGER;
    emps e_list;
begin
    emps(100) :='Aashutosh';
    emps(120) :='Kumar';
    for i in emps.first()..emps.last() loop 
    if(emps.exists(i)) then
    DBMS_OUTPUT.PUT_LINE(emps(i));
    else
    DBMS_OUTPUT.PUT_LINE('No data at index '|| i);
    end if;
    end loop;
end;
/

--We can use while loop 


declare 
    type e_list is table of employees.first_name%type
    index by PLS_INTEGER;
    emps e_list;
    idx number;
begin
    emps(100) :='Aashutosh';
    emps(120) :='Kumar';
    idx := emps.first();
    while idx is not null loop
    DBMS_OUTPUT.PUT_LINE(emps(idx));
    --DBMS_OUTPUT.PUT_LINE('No data at index '|| i);
    idx := emps.next(idx);
    end loop;
end;

--With Records
/
declare 
    type e_list is table of employees%rowtype index by employees.email%type;
    --index by PLS_INTEGER;
    emps e_list;
    num number;
begin
    FOR x in 100..110 loop
        select * into emps(x) from employees where employee_id =x;
    end loop;
-------------
    num := emps.first;
    while num is not null loop
        DBMS_OUTPUT.PUT_LINE(emps(num).first_name);
        num :=emps.next(num);
    end loop;
-------------------
-- Second Way to do this 
    for k in emps.first..emps.last loop
        DBMS_OUTPUT.PUT_LINE('Duplicate '||emps(k).first_name);
    end loop;
end;

