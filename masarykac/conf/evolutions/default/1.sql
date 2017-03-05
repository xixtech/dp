# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table criteria_kpi (
  id                            bigserial not null,
  identificator                 varchar(255),
  items_kpi                     varchar(255),
  value_docent                  varchar(255),
  value_odborny_asistent        varchar(255),
  value_asistent                varchar(255),
  value_lektor                  varchar(255),
  constraint pk_criteria_kpi primary key (id)
);

create table items_kpi (
  id                            bigserial not null,
  identificator                 varchar(255),
  description                   varchar(255),
  unit                          varchar(255),
  weight                        varchar(255),
  constraint pk_items_kpi primary key (id)
);

create table member (
  id                            bigserial not null,
  active                        boolean,
  email                         varchar(255),
  password                      varchar(255),
  person_id                     bigint,
  profile_id                    bigint,
  constraint uq_member_person_id unique (person_id),
  constraint uq_member_profile_id unique (profile_id),
  constraint pk_member primary key (id)
);

create table methodics (
  id                            bigserial not null,
  title                         varchar(255),
  coefficient                   varchar(255),
  constraint pk_methodics primary key (id)
);

create table person (
  id                            bigserial not null,
  salary                        float,
  job_title                     varchar(255),
  member_id                     bigint,
  role                          varchar(255),
  constraint uq_person_member_id unique (member_id),
  constraint pk_person primary key (id)
);

create table person_salary (
  id                            bigserial not null,
  obligation                    float,
  basic_salary                  float,
  personal_evaluation           float,
  personal_evaluation_pct       float,
  evaluation_participation      float,
  constraint pk_person_salary primary key (id)
);

create table profile (
  id                            bigserial not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  phone_number                  varchar(255),
  member_id                     bigint,
  constraint uq_profile_member_id unique (member_id),
  constraint pk_profile primary key (id)
);

create table roles (
  id                            bigserial not null,
  role_name                     varchar(255),
  constraint pk_roles primary key (id)
);

create table salary_scale (
  id                            bigserial not null,
  identificator                 varchar(255),
  description                   varchar(255),
  unit                          varchar(255),
  value_docent                  varchar(255),
  value_odborny_asistent        varchar(255),
  value_asistent                varchar(255),
  value_lektor                  varchar(255),
  constraint pk_salary_scale primary key (id)
);

alter table member add constraint fk_member_person_id foreign key (person_id) references person (id) on delete restrict on update restrict;

alter table member add constraint fk_member_profile_id foreign key (profile_id) references profile (id) on delete restrict on update restrict;

alter table person add constraint fk_person_member_id foreign key (member_id) references member (id) on delete restrict on update restrict;

alter table profile add constraint fk_profile_member_id foreign key (member_id) references member (id) on delete restrict on update restrict;


# --- !Downs

alter table if exists member drop constraint if exists fk_member_person_id;

alter table if exists member drop constraint if exists fk_member_profile_id;

alter table if exists person drop constraint if exists fk_person_member_id;

alter table if exists profile drop constraint if exists fk_profile_member_id;

drop table if exists criteria_kpi cascade;

drop table if exists items_kpi cascade;

drop table if exists member cascade;

drop table if exists methodics cascade;

drop table if exists person cascade;

drop table if exists person_salary cascade;

drop table if exists profile cascade;

drop table if exists roles cascade;

drop table if exists salary_scale cascade;

