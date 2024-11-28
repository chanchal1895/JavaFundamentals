CREATE OR REPLACE PROCEDURE addProdRec
(p_Id IN Products.prdId%TYPE,
 p_Name IN Products.prdName%TYPE,
 p_Cost IN Products.prdCost%TYPE 
 )
AS

BEGIN
  INSERT INTO Products(prdId,prdName,prdCost)  values (p_Id,p_Name,p_Cost);
  commit;
EXCEPTION
  WHEN OTHERS THEN 
   ROLLBACK;
END;


-- run first this procedure -- u should get procedure compiled 
--another procedure 


CREATE OR REPLACE PROCEDURE getProductName (prd_no IN NUMBER, prd_name OUT VARCHAR) AS
BEGIN
   SELECT PRDNAME INTO prd_name
   FROM Products
   WHERE PrdId = prd_no;
END;

--to execute on cmd prompt 
variable gname varchar2(20)
execute getProductName(1112,:gname)
print gname 







