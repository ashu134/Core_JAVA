DESC employees;
SET SERVEROUTPUT ON;

DECLARE 
V_TYPE employees.JOB_ID%TYPE;
V_TYPE2 V_TYPE%TYPE; -- REFERANCE THE VARIABLE 
BEGIN
V_TYPE:= 'IT';
V_TYPE2:='MECHANICAL';
dbms_output.PUT_LINE(V_TYPE||' '||V_TYPE2);
END;