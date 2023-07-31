create table employee_copy as select * from employees;

create sequence emp_id_seq start with 100 INCREMENT by 1;

Declare 
    V_emp_id PLS_INTEGER :=0;
Begin 
    FOR  i IN 1..10 LOOP
    INSERT INTO employee_copy 
    (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY)
    VALUES
    (emp_id_seq.NEXTVAL,'EMPLOYEE#'||emp_id_seq.NEXTVAL,'TEMP_EMP','ABC@GMAIL.COM',SYSDATE,'java PROG',10000);
    END LOOP;
END;
/
SELECT * FROM employee_copy;
/
dECLARE 
    V_SEQ_NUM NUMBER;
BEGIN 
    SELECT emp_id_seq.NEXTVAL INTO V_SEQ_NUM FROM employee_copy WHERE ROWNUM=1;
    v_seq_num := EMP_ID_SEQ.NEXTVAL;
    DBMS_OUTPUT.PUT_LINE(V_SEQ_NUM);
END;
/