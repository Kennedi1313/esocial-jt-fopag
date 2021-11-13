/*
 * Autor: CDS
 * Descrição: Script de criação da base de dados do C7, utilizado pelo Conector TST.
 */

SET SERVEROUTPUT ON 
SET ECHO ON
SET VERIFY ON
SET FEEDBACK ON

DECLARE 
  usuario VARCHAR(100)           := 'c7';
  usuario_conector VARCHAR(100)  := 'c7_usuario';
  nome_table_space VARCHAR(100)  := 'tbs_c7';
  v_tableSpaceExists NUMBER      := 0;
  v_user_count NUMBER            := 0;                                    
  cnt NUMBER                     := 0;
  TYPE table_name IS TABLE OF VARCHAR2(300);

BEGIN
   
  DBMS_OUTPUT.PUT_LINE(LPAD(RPAD('INICIO', 30, '*'),54,'*'));

  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  DESCONECTANDO USUÁRIOS DO C7  --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');

  FOR r IN (SELECT sid,serial# FROM v$session WHERE username = UPPER (usuario))
  LOOP
    EXECUTE IMMEDIATE 'alter system kill session ''' || r.sid 
      || ',' || r.serial# || '''';
  END LOOP;

  FOR r IN (SELECT sid,serial# FROM v$session WHERE username = UPPER (usuario_aplicacao))
  LOOP
    EXECUTE IMMEDIATE 'alter system kill session ''' || r.sid 
      || ',' || r.serial# || '''';
  END LOOP;

  FOR r IN (SELECT sid,serial# FROM v$session WHERE username = UPPER (usuario_conector))
  LOOP
    EXECUTE IMMEDIATE 'alter system kill session ''' || r.sid 
      || ',' || r.serial# || '''';
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  APAGANDO TABLESPACE tbs_c7 --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');

  SELECT count(*) INTO v_tableSpaceExists FROM dba_tablespaces WHERE tablespace_name = UPPER(nome_table_space);
  
  IF v_tableSpaceExists > 0 THEN
      EXECUTE IMMEDIATE 'DROP TABLESPACE ' || nome_table_space || ' INCLUDING CONTENTS  CASCADE CONSTRAINTS';
  END IF;
  
  EXECUTE IMMEDIATE 'CREATE TABLESPACE ' || nome_table_space || '  DATAFILE ''tbs_c7.dat''  SIZE 500K REUSE
                    AUTOEXTEND ON NEXT 500K MAXSIZE 2500M';

    
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  APAGANDO USUÁRIO DO C7  --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');

  SELECT COUNT (1) INTO v_user_count FROM dba_users WHERE username =  UPPER (usuario);
  IF v_user_count != 0
  THEN
      EXECUTE IMMEDIATE ('DROP USER ' || UPPER (usuario) || ' CASCADE');
  END IF;

  --

  SELECT COUNT (1) INTO v_user_count FROM dba_users WHERE username =  UPPER (usuario_conector);
  IF v_user_count != 0
  THEN
      EXECUTE IMMEDIATE ('DROP USER ' || UPPER (usuario_conector) || ' CASCADE');
  END IF;
   

  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  CRIANDO USUÁRIOS DO C7  --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
   
  --
  EXECUTE IMMEDIATE 'CREATE USER ' || UPPER (usuario) || ' identified by mudar01';
  EXECUTE IMMEDIATE 'ALTER USER ' || UPPER (usuario) || ' ACCOUNT UNLOCK'; 
  EXECUTE IMMEDIATE 'GRANT CONNECT, RESOURCE TO ' || UPPER (usuario);
  EXECUTE IMMEDIATE 'GRANT INSERT ANY TABLE TO '  || UPPER (usuario) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT UPDATE ANY TABLE TO '  || UPPER (usuario) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT DELETE ANY TABLE TO '  || UPPER (usuario) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ANY TABLE TO '  || UPPER (usuario) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ANY SEQUENCE TO '  || UPPER (usuario) || ' WITH ADMIN OPTION';
  
  --
  EXECUTE IMMEDIATE 'CREATE USER ' || UPPER (usuario_aplicacao) || ' identified by mudar01';
  EXECUTE IMMEDIATE 'ALTER USER ' || UPPER (usuario_aplicacao) || ' ACCOUNT UNLOCK'; 
  EXECUTE IMMEDIATE 'GRANT CONNECT, RESOURCE TO ' || UPPER (usuario_aplicacao);
  EXECUTE IMMEDIATE 'GRANT INSERT ANY TABLE TO '  || UPPER (usuario_aplicacao) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT UPDATE ANY TABLE TO '  || UPPER (usuario_aplicacao) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT DELETE ANY TABLE TO '  || UPPER (usuario_aplicacao) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ANY TABLE TO '  || UPPER (usuario_aplicacao) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ANY SEQUENCE TO '  || UPPER (usuario_aplicacao) || ' WITH ADMIN OPTION';
  
  --
  EXECUTE IMMEDIATE 'CREATE USER ' || UPPER (usuario_conector) || ' identified by mudar01';
  EXECUTE IMMEDIATE 'ALTER USER ' || UPPER (usuario_conector) || ' ACCOUNT UNLOCK'; 
  EXECUTE IMMEDIATE 'GRANT CONNECT, RESOURCE TO ' || UPPER (usuario_conector);
  EXECUTE IMMEDIATE 'GRANT INSERT ANY TABLE TO '  || UPPER (usuario_conector) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT UPDATE ANY TABLE TO '  || UPPER (usuario_conector) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT DELETE ANY TABLE TO '  || UPPER (usuario_conector) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ANY TABLE TO '  || UPPER (usuario_conector) || ' WITH ADMIN OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ANY SEQUENCE TO '  || UPPER (usuario_conector) || ' WITH ADMIN OPTION';

  DBMS_OUTPUT.PUT_LINE('');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  CRIANDO AS TABELAS NA BASE DADOS  --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');

  --------------------------------------------------------
  --  DDL for Table C7T_1000_EMPREGADOR
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1000_EMPREGADOR ' );
  EXECUTE IMMEDIATE 
  'CREATE TABLE '|| usuario ||'.C7T_1000_EMPREGADOR (
    TP_INSC NUMBER(1,0),
    NR_INSC VARCHAR2(15),
    INI_VALID VARCHAR2(7),
    FIM_VALID VARCHAR2(7),
    NM_RAZAO VARCHAR2(100),
    CLASS_TRIB VARCHAR2(2),
    NAT_JURID VARCHAR2(4),
    IND_COOP NUMBER(1,0),
    IND_CONSTR NUMBER(1,0),
    IND_DES_FOLHA NUMBER(1,0),
    IND_OPT_REG_ELETRON NUMBER(1,0),
    IND_ENT_ED CHAR(1),
    IND_ETT CHAR(1),
    NR_REG_ETT NUMBER(30,0),
    IDE_MIN_LEI VARCHAR2(70),
    NR_CERTIF VARCHAR2(40),
    DT_EMIS_CERTIF DATE,
    DT_VENC_CERTIF DATE,
    NR_PROT_RENOV VARCHAR2(40),
    DT_PROT_RENOV DATE,
    DT_DOU DATE,
    PAG_DOU NUMBER(5,0),
    NM_CTT VARCHAR2(70),
    CPF_CTT VARCHAR2(11),
    FONE_FIXO VARCHAR2(13),
    FONE_CEL VARCHAR2(13),
    EMAIL VARCHAR2(60),
    NR_SIAFI VARCHAR2(6),
    IDE_EFR CHAR(1),
    CNPJ_EFR VARCHAR2(14),
    IND_ACORDO_ISEN_MULTA NUMBER(1,0),
    CNPJ_SOFT_HOUSE VARCHAR2(14),
    NM_RAZAO_SOFT_HOUSE VARCHAR2(100),
    NM_CONT_SOFT_HOUSE VARCHAR2(70),
    TELEFONE_SOFT_HOUSE VARCHAR2(13),
    EMAIL_SOFT_HOUSE VARCHAR2(60),
    IND_SIT_PJ NUMBER(1,0),
    IND_SIT_PF NUMBER(1,0),
    NOVA_VALIDADE_INI_VALID VARCHAR2(7),
    NOVA_VALIDADE_FIM_VALID VARCHAR2(7),
    CONSTRAINT C7T_1000_EMPREGADOR_PK PRIMARY KEY (NR_INSC)
  ) TABLESPACE ' || nome_table_space || '';

  --------------------------------------------------------
  --  DDL for Table C7T_1005_ESTABELECIMENTO
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1005_ESTABELECIMENTO ' );
  EXECUTE IMMEDIATE 
  'CREATE TABLE '|| usuario ||'.C7T_1005_ESTABELECIMENTO (
    TP_INSC NUMBER(1,0),
    NR_INSC VARCHAR2(15),
    ESTAB_TP_INSC NUMBER(1,0),
    ESTAB_NR_INSC VARCHAR2(15),
    INI_VALID VARCHAR2(7),
    FIM_VALID VARCHAR2(7),
    CNAE_PREP NUMBER(7,0),
    ALIQ_RAT NUMBER(1,0),
    FAP NUMBER(5,4),
    ALIQ_RAT_AJUST NUMBER(5,4),
    PROC_ADM_JUD_RAT_TP_PROC NUMBER(1,0),
    PROC_ADM_JUD_RAT_NR_PROC VARCHAR2(20),
    PROC_ADM_JUD_RAT_COD_SUSP NUMBER(14,0),
    PROC_ADM_JUD_FAP_TP_PROC NUMBER(1,0),
    PROC_ADM_JUD_FAP_NR_PROC VARCHAR2(20),
    PROC_ADM_JUD_FAP_COD_SUSP NUMBER(14,0),
    TP_CAEPF NUMBER(1,0),
    IND_SUBST_PATR_OBRA NUMBER(1,0),
    REG_PT NUMBER(1,0),
    CONT_APR NUMBER(1,0),
    NR_PROC_JUD VARCHAR2(20),
    CONT_ENT_ED CHAR(1),
    INFO_ENT_EDUC_NR_INSC VARCHAR2(15),
    CONT_PCD NUMBER(1,0),
    INFO_PCD_NR_PROC_JUD VARCHAR2(20),
    NOVA_VALIDADE_INI_VALID VARCHAR2(7),
    NOVA_VALIDADE_FIM_VALID VARCHAR2(7),
    CONSTRAINT C7T_1005_ESTABELECIMENTO_PK PRIMARY KEY (NR_INSC)
  ) TABLESPACE ' || nome_table_space || '';

  --------------------------------------------------------
  --  DDL for Table C7T_1010_RUBRICAS
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1010_RUBRICAS ' );
  EXECUTE IMMEDIATE
  'CREATE TABLE '|| usuario ||'.C7T_1010_RUBRICAS (	
    COD_RUBR VARCHAR2(30 BYTE), 
    IDE_TAB_RUBR VARCHAR2(8 BYTE), 
    INI_VALID VARCHAR2(7 BYTE), 
    FIM_VALID VARCHAR2(7 BYTE), 
    DSC_RUBR VARCHAR2(100 BYTE), 
    NAT_RUBR NUMBER(4,0), 
    TP_RUBR NUMBER(1,0), 
    COD_INC_CP VARCHAR2(2 BYTE), 
    COD_INC_IRRF VARCHAR2(2 BYTE), 
    COD_INC_FGTS VARCHAR2(2 BYTE), 
    COD_INC_SIND VARCHAR2(2 BYTE), 
    OBSERVACAO VARCHAR2(255 BYTE),
    CONSTRAINT C7T_1010_RUBRICAS_PK PRIMARY KEY (COD_RUBR)
  ) TABLESPACE ' || nome_table_space || '';

  --------------------------------------------------------
  --  DDL for Table C7T_1020_LOT_TRIBUTARIA
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1020_LOT_TRIBUTARIA ' );
  EXECUTE IMMEDIATE 
    'CREATE TABLE '|| usuario ||'.C7T_1020_LOT_TRIBUTARIA (
    COD_LOTACAO VARCHAR(60),
    INI_VALID VARCHAR2(7),
    FIM_VALID VARCHAR2(7),
    TP_LOTACAO VARCHAR2(2),
    LOTACAO_TP_INSC NUMBER(1,0),
    LOTACAO_NR_INSC VARCHAR2(15),
    FPAS NUMBER(4,0),
    COD_TERCS VARCHAR2(15),
    COD_TERCS_SUSP VARCHAR2(4),
    COD_TERC VARCHAR2(4),
    NR_PROC_JUD VARCHAR2(20),
    COD_SUSP NUMBER(14,0),
    TP_INSC_CONTRAT NUMBER(1,0),
    NR_INSC_CONTRAT VARCHAR2(15),
    TP_INSC_PROP NUMBER(1,0),
    NR_INSC_PROP VARCHAR2(15),
    NOVA_VALIDADE_INI_VALID VARCHAR2(7),
    NOVA_VALIDADE_FIM_VALID VARCHAR2(7),
    CONSTRAINT C7T_1020_LOT_TRIBUTARIA_PK PRIMARY KEY (COD_LOTACAO)
  ) TABLESPACE ' || nome_table_space || '';

  --------------------------------------------------------
  --  DDL for Table C7T_1030_CARGO
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1030_CARGO ' );
  EXECUTE IMMEDIATE 
  'CREATE TABLE '|| usuario ||'.C7T_1030_CARGO (
    COD_CARGO VARCHAR2(30),
    INI_VALID VARCHAR2(7),
    FIM_VALID VARCHAR2(7),
    NM_CARGO VARCHAR2(100),
    COD_CBO VARCHAR2(6),
    ACUM_CARGO NUMBER(1,0),
    CONTAGEM_ESP NUMBER(1,0),
    DEDIC_EXCL CHAR(1),
    NR_LEI VARCHAR2(12),
    DT_LEI DATE,
    SIT_CARGO NUMBER(1,0),
    NOVA_VALIDADE_INI_VALID VARCHAR2(7),
    NOVA_VALIDADE_FIM_VALID VARCHAR2(7),
    CONSTRAINT C7T_1030_CARGO_PK PRIMARY KEY (COD_CARGO)
  ) TABLESPACE ' || nome_table_space || '';

  --------------------------------------------------------
  --  DDL for Table C7T_1035_CARREIRA
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1035_CARREIRA ' );
  EXECUTE IMMEDIATE 
  'CREATE TABLE '|| usuario ||'.C7T_1035_CARREIRA (
    COD_CARREIRA VARCHAR2(20),
    INI_VALID VARCHAR2(7),
    FIM_VALID VARCHAR2(7),
    DSC_CARREIRA VARCHAR2(100),
    LEI_CARR VARCHAR2(100),
    DT_LEI_CARR DATE,
    SIT_CARR NUMBER(1,0),
    NOVA_VALIDADE_INI_VALID VARCHAR2(7),
    NOVA_VALIDADE_FIM_VALID VARCHAR2(7),
    CONSTRAINT C7T_1035_CARREIRA_PK PRIMARY KEY (COD_CARREIRA)
  ) TABLESPACE ' || nome_table_space || '';

  --------------------------------------------------------
  --  DDL for Table C7T_1040_FUNCAO
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1040_FUNCAO ' );
  EXECUTE IMMEDIATE 
  'CREATE TABLE '|| usuario ||'.C7T_1040_FUNCAO (
    COD_FUNCAO VARCHAR2(30),
    INI_VALID VARCHAR2(7),
    FIM_VALID VARCHAR2(7),
    DSC_FUNCAO VARCHAR2(100),
    COD_CBO VARCHAR2(6),
    NOVA_VALIDADE_INI_VALID VARCHAR2(7),
    NOVA_VALIDADE_FIM_VALID VARCHAR2(7),
    CONSTRAINT C7T_1040_FUNCAO_PK PRIMARY KEY (COD_FUNCAO)
  ) TABLESPACE ' || nome_table_space || '';
  
  --------------------------------------------------------
  --  DDL for Table C7T_1070_PROCESSO
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1070_PROCESSO ' );  
  
  EXECUTE IMMEDIATE 'CREATE TABLE '|| usuario ||'.C7T_1070_PROCESSO 
     (	TP_PROC NUMBER(1,0), 
	    NR_PROC VARCHAR2(21), 
	    INI_VALID VARCHAR2(7), 
	    FIM_VALID VARCHAR2(7), 
	    IND_AUTORIA NUMBER(1,0), 
	    IND_MAT_PROC NUMBER(2,0), 
	    OBSERVACAO VARCHAR2(255), 
	    UF_VARA CHAR(2), 
	    COD_MUNIC NUMBER(9,0), 
	    ID_VARA NUMBER(9,0), 
	    NOVA_VALIDADE_INI_VALID VARCHAR2(7), 
	    NOVA_VALIDADE_FIM_VALID VARCHAR2(7), 
	    CONSTRAINT C7T_1070_PROCESSO_PK PRIMARY KEY (TP_PROC, NR_PROC)
    )  TABLESPACE ' || nome_table_space || '';
    
  --------------------------------------------------------
  --  DDL for Table C7T_1070_PROCESSO_SUSPENSAO
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_1070_PROCESSO_SUSPENSAO ' );  
  EXECUTE IMMEDIATE 
  'CREATE TABLE '|| usuario ||'.C7T_1070_PROCESSO_SUSPENSAO 
   (  COD_SUSP NUMBER(14,0) NOT NULL ENABLE, 
	  TP_PROC NUMBER(1,0) NOT NULL ENABLE, 
      NR_PROC VARCHAR2(21) NOT NULL ENABLE, 
	  IND_SUSP VARCHAR2(2 BYTE) NOT NULL ENABLE, 
	  DT_DECISAO DATE NOT NULL ENABLE, 
	  IND_DEPOSITO VARCHAR2(1 BYTE) NOT NULL ENABLE, 
	  CONSTRAINT C7T_1070_PROCESSO_SUSPENSA_PK PRIMARY KEY (COD_SUSP),
      CONSTRAINT C7T_1070_PROCESSO_SUSPENS_FK1 FOREIGN KEY (TP_PROC, NR_PROC)  REFERENCES  '|| usuario ||'.C7T_1070_PROCESSO (TP_PROC, NR_PROC) ENABLE
 ) TABLESPACE ' || nome_table_space || '';

  --------------------------------------------------------
  --  DDL for Table C7T_2200_TRABALHADOR
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_2200_TRABALHADOR ' );
  EXECUTE IMMEDIATE 
  'CREATE TABLE '|| usuario ||'.C7T_2200_TRABALHADOR (
    ID_TRABALHADOR NUMBER(9,0),
    TP_INSC_EMPREGADOR NUMBER(1,0),
    NR_INSC_EMPREGADOR VARCHAR2(15),
    CPF_TRAB VARCHAR2(11),
    NIS_TRAB VARCHAR2(11),
    NM_TRAB VARCHAR2(70),
    SEXO CHAR(1),
    RACA_COR NUMBER(1,0),
    EST_CIV NUMBER(1,0),
    GRAU_INSTR CHAR(2),
    IND_PRI_EMPR CHAR(1),
    NM_SOC VARCHAR2(70),
    DT_NASCTO DATE,
    COD_MUNIC_NASCTO NUMBER(7,0),
    UF_NASCTO CHAR(2),
    PAIS_NASCTO CHAR(3),
    PAIS_NAC CHAR(3),
    NM_MAE VARCHAR2(70),
    NM_PAI VARCHAR2(70),
    NR_CTPS VARCHAR2(11),
    SERIE_CTPS VARCHAR2(5),
    UF_CTPS CHAR(2),
    NR_RIC VARCHAR2(14),
    ORGAO_EMISSOR_RIC VARCHAR2(20),
    DT_EXPED_RIC DATE,
    NR_RG VARCHAR2(14),
    ORGAO_EMISSOR_RG VARCHAR2(20),
    DT_EXPED_RG DATE,
    NR_RNE VARCHAR2(14),
    ORGAO_EMISSOR_RNE VARCHAR2(20),
    DT_EXPED_RNE DATE,
    NR_OC VARCHAR2(14),
    ORGAO_EMISSOR_OC VARCHAR2(20),
    DT_EXPED_OC DATE,
    DT_VALID_OC DATE,
    NR_REG_CNH VARCHAR2(12),
    DT_EXPED_CNH DATE,
    UF_CNH CHAR(2),
    DT_VALID_CNH DATE,
    DT_PRI_HAB_CNH DATE,
    CATEGORIA_CNH VARCHAR2(2),
    TP_LOGRAD_END_BRASIL VARCHAR2(4),
    DSC_LOGRAD_END_BRASIL VARCHAR2(80),
    NR_LOGRAD_END_BRASIL VARCHAR2(10),
    COMPLEMENTO_END_BRASIL VARCHAR2(30),
    BAIRRO_END_BRASIL VARCHAR2(60),
    CEP_END_BRASIL VARCHAR2(8),
    COD_MUNIC_END_BRASIL NUMBER(7,0),
    UF_END_BRASIL CHAR(2),
    PAIS_RESID CHAR(3),
    DSC_LOGRAD_END_EXTERIOR VARCHAR2(80),
    NR_LOGRAD_END_EXTERIOR VARCHAR2(10),
    COMPLEMENTO_END_EXTERIOR VARCHAR2(30),
    BAIRRO_END_EXTERIOR VARCHAR2(60),
    NM_CID_END_EXTERIOR VARCHAR2(50),
    COD_POSTAL_END_EXTERIOR VARCHAR2(12),
    DT_CHEGADA_TRAB_ESTRANG DATE,
    CLASS_TRAB_ESTRANG NUMBER(2,0),
    CASADO_BR_TRAB_ESTRANG CHAR(1),
    FILHOS_BR_TRAB_ESTRANG CHAR(1),
    DEF_FISICA CHAR(1),
    DEF_VISUAL CHAR(1),
    DEF_AUDITIVA CHAR(1),
    DEF_MENTAL CHAR(1),
    DEF_INTELECTUAL CHAR(1),
    REAB_READAP CHAR(1),
    INFO_COTA CHAR(1),
    OBSERVACAO_INFO_DEFICIENCIA VARCHAR2(255),
    TRAB_APOSENT CHAR(1),
    FONE_PRINC VARCHAR2(13),
    FONE_ALTERNAT VARCHAR2(13),
    EMAIL_PRINC VARCHAR2(60),
    EMAIL_ALTERNAT VARCHAR2(60),
    MATRICULA VARCHAR2(30),
    TP_REG_TRAB NUMBER(1,0),
    TP_REG_PREV NUMBER(1,0),
    NR_REC_INF_PRELIM VARCHAR2(40),
    CAD_INI CHAR(1),
    DT_ADM DATE,
    TP_ADMISSAO NUMBER(1,0),
    IND_ADMISSAO NUMBER(1,0),
    TP_REG_JOR NUMBER(1,0),
    NAT_ATIVIDADE NUMBER(1,0),
    DT_BASE NUMBER(2,0),
    CNPJ_SIND_CATEG_PROF VARCHAR2(14),
    OPC_FGTS NUMBER(1,0),
    DT_OPC_FGTS DATE,
    HIP_LEG NUMBER(1,0),
    JUST_CONTR VARCHAR2(999),
    TP_INCL_CONTR NUMBER(1,0),
    TP_INSC_TOMADOR_SERV NUMBER(1,0),
    NR_INSC_TOMADOR_SERV VARCHAR2(15),
    TP_INSC_ESTAB_VINC NUMBER(1,0),
    NR_INSC_ESTAB_VINC VARCHAR2(15),
    CPF_TRAB_SUBST VARCHAR2(11),
    TP_INSC_APREND NUMBER(1,0),
    NR_INSC_APREND VARCHAR2(15),
    IND_PROVIM NUMBER(1,0),
    TP_PROV NUMBER(2,0),
    DT_NOMEACAO DATE,
    DT_POSSE DATE,
    DT_EXERCICIO DATE,
    TP_PLAN_RP NUMBER(1,0),
    NR_PROC_JUD_INFO_DEC_JUD VARCHAR2(20),
    COD_CARGO VARCHAR2(30),
    COD_FUNCAO VARCHAR2(30),
    COD_CATEG NUMBER(3,0),
    COD_CARREIRA VARCHAR2(30),
    DT_INGR_CARR DATE,
    VR_SAL_FX NUMBER(14,2),
    UND_SAL_FIXO NUMBER(1,0),
    DSC_SAL_VAR VARCHAR2(255),
    TP_CONTR NUMBER(1,0),
    DT_TERM DATE,
    CLAU_ASSEG CHAR(1),
    TP_INSC_LOCAL_TRAB_GERAL NUMBER(1,0),
    NR_INSC_LOCAL_TRAB_GERAL VARCHAR2(15),
    DESC_COMP_LOCAL_TRAB_GERAL VARCHAR2(80),
    TP_LOGRAD_LOCAL_TRAB_DOM VARCHAR2(4),
    DSC_LOGRAD_LOCAL_TRAB_DOM VARCHAR2(80),
    NR_LOGRAD_LOCAL_TRAB_DOM VARCHAR2(10),
    COMPLEMENTO_LOCAL_TRAB_DOM VARCHAR2(30),
    BAIRRO_LOCAL_TRAB_DOM VARCHAR2(60),
    CEP_LOCAL_TRAB_DOM VARCHAR2(8),
    COD_MUNIC_LOCAL_TRAB_DOM NUMBER(7,0),
    UF_LOCAL_TRAB_DOM CHAR(2),
    QTD_HRS_SEM NUMBER(4,2),
    TP_JORNADA NUMBER(1,0),
    DSC_TP_JORN VARCHAR2(100),
    TMP_PARC NUMBER(1,0),
    CNPJ_SIND_TRAB VARCHAR2(14),
    NR_PROC_JUD_ALVARA_JUDICIAL VARCHAR2(20),
    OBSERVACAO_INFO_CONTRATO VARCHAR2(255),
    CNPJ_EMPREG_ANT VARCHAR2(14),
    MATRIC_ANT_SUCESSAO_VINC VARCHAR2(30),
    DT_TRANSF_SUCESSAO_VINC DATE,
    OBSERVACAO_SUCESSAO_VINC VARCHAR2(255),
    CPF_SUBSTITUIDO VARCHAR2(11),
    MATRIC_ANT_TRANSF_DOM VARCHAR2(30),
    DT_TRANSF_DOM DATE,
    DT_INI_AFAST DATE,
    COD_MOT_AFAST CHAR(2),
    DT_DESLIG DATE,
    COD_SERVIDOR NUMBER(6,0),
    NUM_SEQ_DIVISAO NUMBER(3,0),
    CONSTRAINT C7T_2200_TRABALHADOR_PK PRIMARY KEY (ID_TRABALHADOR)
  ) TABLESPACE ' || nome_table_space || '';

  --------------------------------------------------------
  --  DDL for Table C7T_2200_DEPENDENTE
  --------------------------------------------------------
  DBMS_OUTPUT.PUT_LINE('CRIANDO -> C7T_2200_DEPENDENTE ' );
  EXECUTE IMMEDIATE 
  'CREATE TABLE '|| usuario ||'.C7T_2200_DEPENDENTE (
    ID_DEPENDENTE NUMBER(9,0),
    ID_TRABALHADOR NUMBER(9,0),
    TP_DEP CHAR(2),
    NM_DEP VARCHAR2(70),
    DT_NASCTO DATE,
    CPF_DEP VARCHAR2(11),
    DEP_IRRF CHAR(1),
    DEP_SF CHAR(1),
    INC_TRAB CHAR(1),
    COD_SERVIDOR NUMBER(6,0),
    SEQ_DEPENDENTE NUMBER(3,0),
    CONSTRAINT C7T_2200_DEPENDENTE_PK PRIMARY KEY (ID_DEPENDENTE),
    CONSTRAINT C7T_2200_DEPENDENTE_FK01 FOREIGN KEY (ID_TRABALHADOR) REFERENCES C7.C7T_2200_TRABALHADOR(ID_TRABALHADOR)
  ) TABLESPACE ' || nome_table_space || '';
  
  --------------------------------------------------------
  --  INDICES, CONSTRAINTS E SEQUENCES
  --------------------------------------------------------

  DBMS_OUTPUT.PUT_LINE('');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  CRIANDO OS ÍNDICES  --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');

  EXECUTE IMMEDIATE 'CREATE INDEX C7T_2200_TRABALHADOR_IN01 ON C7.C7T_2200_TRABALHADOR (COD_SERVIDOR,NUM_SEQ_DIVISAO)';
  EXECUTE IMMEDIATE 'CREATE INDEX C7T_2200_TRABALHADOR_IN02 ON C7.C7T_2200_TRABALHADOR (CPF_TRAB)';
  EXECUTE IMMEDIATE 'CREATE INDEX C7T_2200_TRABALHADOR_IN03 ON C7.C7T_2200_TRABALHADOR (MATRICULA)';
  
  DBMS_OUTPUT.PUT_LINE('');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  CRIANDO AS  CONSTRAINTS --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  

  DBMS_OUTPUT.PUT_LINE('');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  CRIANDO SEQUENCES --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');

  EXECUTE IMMEDIATE 'CREATE SEQUENCE  '|| usuario ||'."C7S_ID_DEPENDENTE"  MINVALUE 1 MAXVALUE 9999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 ORDER  NOCYCLE' ;
  EXECUTE IMMEDIATE 'CREATE SEQUENCE  '|| usuario ||'."C7S_ID_TRABALHADOR"  MINVALUE 1 MAXVALUE 9999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 ORDER  NOCYCLE' ;
  
  
  
  DBMS_OUTPUT.PUT_LINE('');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE('--  CRIANDO TRIGGER PARA ALTERAR ESQUEMA AO CONECTAR --');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  
  EXECUTE IMMEDIATE 
  'CREATE OR REPLACE TRIGGER LOGON_TRG_'|| usuario_conector ||'
  AFTER logon ON '|| usuario_conector ||'.schema
  BEGIN
      execute immediate '' ALTER SESSION SET CURRENT_SCHEMA = '|| usuario ||' '';
  END;' ;

  DBMS_OUTPUT.PUT_LINE('');
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');
  DBMS_OUTPUT.PUT_LINE(LPAD(RPAD('FIM', 27, '*'),54,'*'));
  DBMS_OUTPUT.PUT_LINE('--------------------------------------------------------');

EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('');
    DBMS_OUTPUT.PUT_LINE('********************************************************');
    DBMS_OUTPUT.PUT_LINE('**                       ERRO                         **');
    DBMS_OUTPUT.PUT_LINE('********************************************************');
    DBMS_OUTPUT.PUT_LINE('');
    DBMS_OUTPUT.PUT_LINE (SQLCODE || ' ' || SQLERRM);
    DBMS_OUTPUT.PUT_LINE('');
    DBMS_OUTPUT.PUT_LINE('********************************************************');
  
    ROLLBACK;
    RAISE;
END;

/
