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
                