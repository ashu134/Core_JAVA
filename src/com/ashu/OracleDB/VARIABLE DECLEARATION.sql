Declare
    v_name VARCHAR2 (20) NOT NULL DEFAULT 'Aashutosh kumar';
    V_NUMBER NUMBER(10,2):=100.45;
    v_NUMBER1 PLS_INTEGER:=200.77;
    V_BINRY BINARY_INTEGER:=900;
    V_DATE DATE NOT NULL:=SYSDATE;
    V_DATE1 TIMESTAMP WITH TIME ZONE NOT NULL:=SYSTIMESTAMP;
begin

v_name:='AASHU KUMAR';
DBMS_OUTPUT.PUT_LINE(V_NAME|| ' IS MY NAME');
DBMS_OUTPUT.PUT_LINE('NUMBER IS: '|| V_NUMBER ||' AND PLS_INTEGER IS '||v_number1);
DBMS_OUTPUT.PUT_LINE('bINARY NUMBER IS: ' ||v_binry);
V_DATE:='25-OCT-23';
DBMS_OUTPUT.PUT_LINE('SYSDATE IS: '||V_DATE);
DBMS_OUTPUT.PUT_LINE('LOCAL SYSDATE IS: '||V_DATE1);
END;