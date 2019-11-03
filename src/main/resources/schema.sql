-- SEQUENCE: public."Employee_id_seq"
DROP TABLE IF EXISTS public."Employee";
DROP TABLE IF EXISTS public."Organization";
DROP SEQUENCE IF EXISTS public."Employee_id_seq";
DROP SEQUENCE IF EXISTS public."organization_id_seq";

CREATE SEQUENCE public."Employee_id_seq"
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public."Employee_id_seq"
    OWNER TO postgres;

-- SEQUENCE: public.organization_id_seq



CREATE SEQUENCE public.organization_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.organization_id_seq
    OWNER TO postgres;


-- Table: public."Organization"



CREATE TABLE public."Organization"
(
    id integer NOT NULL DEFAULT nextval('organization_id_seq'::regclass),
    organization_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    parent_organization integer,
    CONSTRAINT organization_pk PRIMARY KEY (id)
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public."Organization"
    OWNER to postgres;

-- Table: public."Employee"



CREATE TABLE public."Employee"
(
    id integer NOT NULL DEFAULT nextval('"Employee_id_seq"'::regclass),
    surname character varying(25) COLLATE pg_catalog."default" NOT NULL,
    name character varying(25) COLLATE pg_catalog."default" NOT NULL,
    patronymic character varying(25) COLLATE pg_catalog."default",
    organization_id integer NOT NULL,
    supervisor_id integer,
    CONSTRAINT employee_pk PRIMARY KEY (id),
    CONSTRAINT organization_fk FOREIGN KEY (organization_id)
        REFERENCES public."Organization" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public."Employee"
    OWNER to postgres;

INSERT INTO public."Organization" VALUES
(1, 'Organization #1', null),
(2, 'Suborg', 1);

INSERT INTO public."Employee" VALUES
(1, 'Oborin', 'Viktor', 'Pavlovich', 1, null);