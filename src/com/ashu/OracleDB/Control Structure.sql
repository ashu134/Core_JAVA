declare 
    v_age number :=19;
begin
    if v_age<20 then
        dbms_output.put_line('My age is less than 20');
    elsif v_age=30 then
        dbms_output.put_line('My age is 30');
    else 
        dbms_output.put_line('My age is greater than 20');
    end if;
end;

--CASE statement

declare 
    JOB_NAME varchar2(30):= 'IT SUPPORT';
    increment number;
begin
    increment := case job_name
                when 'IT SUPPORT' then 1.25
                when 'IS SECURITY' then 1.75
                else 1.00
                end;
dbms_output.put_line('your salary increase = '|| increment);
end;

-- Search case statement 
declare 
    JOB_NAME varchar2(30):= 'IS SECURITY';
    increment number;
begin
    increment := case 
                when job_name='IT SUPPORT' then 1.25
                when job_name='IS SECURITY' or job_name='SUPPORT' then 1.75
                else 1.00
                end;
dbms_output.put_line('your salary increase = '|| increment);
end;

--Basic Loop

declare 
    v_counter number(2) := 1;
begin
    loop
        dbms_output.put_line('my counter is: '||V_counter);
        v_counter := v_counter+1;
    exit when v_counter > 5;
    end loop;
end;

--While Loop
/
Declare 
 v_num number(2) :=0;
BEGIN
    while v_num < 10 loop
    dbms_output.put_line('my Number is: '||v_num);
    v_num := v_num+1;
    end loop;
end;
 
--For loop

Declare
    my_num number(2) :=0;
begin
    for i in 1..10 loop
    dbms_output.put_line('loop: '||i);
    end loop;
end;

begin
    for i in reverse 1..11 loop
    dbms_output.put_line('loop: '||i);
    end loop;
end;
        
























                