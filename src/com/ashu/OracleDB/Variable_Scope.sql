SET DEFINE OFF;
BEGIN <<OUTER>>
DECLARE
    v_outer VARCHAR2(20) := 'Aashutosh kumar';
    V_NUM NUMBER :=11;
BEGIN
    DECLARE 
    V_INNER VARCHAR2(30):='AASHU';
    V_NUM NUMBER:=12;
    BEGIN
        DBMS_OUTPUT.PUT_LINE('INNER_VARIABLE '|| V_INNER);
        dbms_output.put_line('OUTER BLOCK VARIABLE: ' || v_outer);
        dbms_output.put_line('OUTER BLOCK NUMBER: '||V_NUM);
        dbms_output.put_line('INNER BLOCK VARIABLE: '||OUTER.V_NUM);
    END;
    dbms_output.put_line(v_outer);
    --DBMS_OUTPUT.PUT_LINE('INNER_VARIABLE '|| V_INNER); --CANNOT ACCESS INNER VARIABLE
    dbms_output.put_line('OUTER BLOCK VARIABLE: '||V_NUM);
END;
END OUTER;
/
--BIND VARIABLE

VARIABLE VAR_TEXT VARCHAR2(20);
VARIABLE B_NUM NUMBER;
/
DECLARE 
    V_TEXT VARCHAR2(30);
BEGIN 
    :VAR_TEXT := 'HELLO PL/SQL';
    :B_NUM := 1001;
    V_TEXT := :VAR_TEXT;
   -- DBMS_OUTPUT.PUT_LINE(V_TEXT);
  --  DBMS_OUTPUT.PUT_LINE(:VAR_TEXT);
END;
PRINT VAR_TEXT;


-- Use RUN SCRIPTS(F5) not run STATEMENT(CTRL+ENT)
VARIABLE VAR_ID NUMBER; 
BEGIN
    :VAR_ID := '100';
END;

PRINT :VAR_ID;

SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID= :VAR_ID;

 VARIABLE   v_in_min_salary number;
