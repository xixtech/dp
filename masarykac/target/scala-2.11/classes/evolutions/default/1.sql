# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table courses (
  id                            bigserial not null,
  semester                      varchar(255),
  course                        varchar(255),
  number_of_students            integer,
  subjects_id                   bigint,
  constraint pk_courses primary key (id)
);

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

create table criteria_lector (
  id                            bigserial not null,
  period                        varchar(255),
  identificator                 varchar(255),
  items_kpi                     varchar(255),
  value_lektor                  varchar(255),
  constraint pk_criteria_lector primary key (id)
);

create table current_semesters (
  id                            bigserial not null,
  field_of_study                varchar(255),
  semester_entry                varchar(255),
  semester                      varchar(255),
  constraint pk_current_semesters primary key (id)
);

create table current_semesters_until_the_end_of_study (
  id                            bigserial not null,
  field_of_study                varchar(255),
  semester_entry                varchar(255),
  semester                      varchar(255),
  constraint pk_current_semesters_until_the_end_of_study primary key (id)
);

create table days (
  id                            bigserial not null,
  day_p                         integer,
  day                           varchar(255),
  day_v                         varchar(255),
  constraint pk_days primary key (id)
);

create table employees (
  id                            bigserial not null,
  personal_number               integer,
  title_before                  varchar(255),
  surname                       varchar(255),
  first_name                    varchar(255),
  title_after                   varchar(255),
  constraint pk_employees primary key (id)
);

create table fields_of_study (
  id                            bigserial not null,
  field_of_study                varchar(255),
  field_of_study_v              varchar(255),
  study                         varchar(255),
  fields_of_study_language      varchar(255),
  form_of_teaching              varchar(255),
  constraint pk_fields_of_study primary key (id)
);

create table items_kpi (
  id                            bigserial not null,
  identificator                 varchar(255),
  description                   varchar(255),
  unit                          varchar(255),
  weight                        varchar(255),
  constraint pk_items_kpi primary key (id)
);

create table lector (
  id                            bigserial not null,
  identificator                 varchar(255),
  items_kpi                     varchar(255),
  value_lektor                  varchar(255),
  constraint pk_lector primary key (id)
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
  value_current                 varchar(255),
  value_previous                varchar(255),
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

create table schedule (
  id                            bigserial not null,
  semester                      varchar(255),
  ident                         varchar(255),
  course                        varchar(255),
  schedule_day                  integer,
  schedule_from                 varchar(255),
  schedule_to                   varchar(255),
  class_room                    varchar(255),
  courses_id                    bigint,
  constraint pk_schedule primary key (id)
);

create table schedule_in_weeks (
  id                            bigserial not null,
  semester                      varchar(255),
  ident                         varchar(255),
  course                        varchar(255),
  schedule_day                  integer,
  schedule_from                 varchar(255),
  schedule_to                   varchar(255),
  class_room                    varchar(255),
  schedule_week                 integer,
  schedule_year                 integer,
  schedule_id                   bigint,
  semesters_id                  bigint,
  constraint pk_schedule_in_weeks primary key (id)
);

create table semesters (
  id                            bigserial not null,
  semester_value                varchar(255),
  semester_vk                   varchar(255),
  semester_vd                   varchar(255),
  semester_ar                   varchar(255),
  semester_from                 timestamp,
  semester_to                   timestamp,
  constraint pk_semesters primary key (id)
);

create table study_groups (
  id                            bigserial not null,
  study_group                   varchar(255),
  study_group_p                 integer,
  study_group_v                 varchar(255),
  study_groups_note             varchar(255),
  constraint pk_study_groups primary key (id)
);

create table study_groups1 (
  id                            bigserial not null,
  study_group                   varchar(255),
  study_group_p                 integer,
  study_group_v                 varchar(255),
  study_groups_note             varchar(255),
  constraint pk_study_groups1 primary key (id)
);

create table study_plans (
  id                            bigserial not null,
  subjects_id                   bigint,
  fields_of_study_id            bigint,
  semesters_id                  bigint,
  semester_value                integer,
  study_groups_id               bigint,
  study_groups1_id              bigint,
  constraint pk_study_plans primary key (id)
);

create table subjects (
  id                            bigserial not null,
  ident                         varchar(255),
  ident_old                     varchar(255),
  title_c                       varchar(255),
  title_a                       varchar(255),
  hours_p                       integer,
  hours_c                       integer,
  hours_semester                integer,
  credits                       integer,
  credit                        boolean,
  exam                          boolean,
  classified_credit             boolean,
  department                    varchar(255),
  form_presentation             boolean,
  form_combined                 boolean,
  constraint pk_subjects primary key (id)
);

create table teachers (
  id                            bigserial not null,
  courses_id                    bigint,
  employees_id                  bigint,
  scale                         integer,
  constraint pk_teachers primary key (id)
);

create table test (
  id                            bigserial not null,
  name                          varchar(255),
  value                         varchar(255),
  constraint pk_test primary key (id)
);

alter table courses add constraint fk_courses_subjects_id foreign key (subjects_id) references subjects (id) on delete restrict on update restrict;
create index ix_courses_subjects_id on courses (subjects_id);

alter table member add constraint fk_member_person_id foreign key (person_id) references person (id) on delete restrict on update restrict;

alter table member add constraint fk_member_profile_id foreign key (profile_id) references profile (id) on delete restrict on update restrict;

alter table person add constraint fk_person_member_id foreign key (member_id) references member (id) on delete restrict on update restrict;

alter table profile add constraint fk_profile_member_id foreign key (member_id) references member (id) on delete restrict on update restrict;

alter table schedule add constraint fk_schedule_courses_id foreign key (courses_id) references courses (id) on delete restrict on update restrict;
create index ix_schedule_courses_id on schedule (courses_id);

alter table schedule_in_weeks add constraint fk_schedule_in_weeks_schedule_id foreign key (schedule_id) references schedule (id) on delete restrict on update restrict;
create index ix_schedule_in_weeks_schedule_id on schedule_in_weeks (schedule_id);

alter table schedule_in_weeks add constraint fk_schedule_in_weeks_semesters_id foreign key (semesters_id) references semesters (id) on delete restrict on update restrict;
create index ix_schedule_in_weeks_semesters_id on schedule_in_weeks (semesters_id);

alter table study_plans add constraint fk_study_plans_subjects_id foreign key (subjects_id) references subjects (id) on delete restrict on update restrict;
create index ix_study_plans_subjects_id on study_plans (subjects_id);

alter table study_plans add constraint fk_study_plans_fields_of_study_id foreign key (fields_of_study_id) references fields_of_study (id) on delete restrict on update restrict;
create index ix_study_plans_fields_of_study_id on study_plans (fields_of_study_id);

alter table study_plans add constraint fk_study_plans_semesters_id foreign key (semesters_id) references semesters (id) on delete restrict on update restrict;
create index ix_study_plans_semesters_id on study_plans (semesters_id);

alter table study_plans add constraint fk_study_plans_study_groups_id foreign key (study_groups_id) references study_groups (id) on delete restrict on update restrict;
create index ix_study_plans_study_groups_id on study_plans (study_groups_id);

alter table study_plans add constraint fk_study_plans_study_groups1_id foreign key (study_groups1_id) references study_groups1 (id) on delete restrict on update restrict;
create index ix_study_plans_study_groups1_id on study_plans (study_groups1_id);

alter table teachers add constraint fk_teachers_courses_id foreign key (courses_id) references courses (id) on delete restrict on update restrict;
create index ix_teachers_courses_id on teachers (courses_id);

alter table teachers add constraint fk_teachers_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_teachers_employees_id on teachers (employees_id);


# --- !Downs

alter table if exists courses drop constraint if exists fk_courses_subjects_id;
drop index if exists ix_courses_subjects_id;

alter table if exists member drop constraint if exists fk_member_person_id;

alter table if exists member drop constraint if exists fk_member_profile_id;

alter table if exists person drop constraint if exists fk_person_member_id;

alter table if exists profile drop constraint if exists fk_profile_member_id;

alter table if exists schedule drop constraint if exists fk_schedule_courses_id;
drop index if exists ix_schedule_courses_id;

alter table if exists schedule_in_weeks drop constraint if exists fk_schedule_in_weeks_schedule_id;
drop index if exists ix_schedule_in_weeks_schedule_id;

alter table if exists schedule_in_weeks drop constraint if exists fk_schedule_in_weeks_semesters_id;
drop index if exists ix_schedule_in_weeks_semesters_id;

alter table if exists study_plans drop constraint if exists fk_study_plans_subjects_id;
drop index if exists ix_study_plans_subjects_id;

alter table if exists study_plans drop constraint if exists fk_study_plans_fields_of_study_id;
drop index if exists ix_study_plans_fields_of_study_id;

alter table if exists study_plans drop constraint if exists fk_study_plans_semesters_id;
drop index if exists ix_study_plans_semesters_id;

alter table if exists study_plans drop constraint if exists fk_study_plans_study_groups_id;
drop index if exists ix_study_plans_study_groups_id;

alter table if exists study_plans drop constraint if exists fk_study_plans_study_groups1_id;
drop index if exists ix_study_plans_study_groups1_id;

alter table if exists teachers drop constraint if exists fk_teachers_courses_id;
drop index if exists ix_teachers_courses_id;

alter table if exists teachers drop constraint if exists fk_teachers_employees_id;
drop index if exists ix_teachers_employees_id;

drop table if exists courses cascade;

drop table if exists criteria_kpi cascade;

drop table if exists criteria_lector cascade;

drop table if exists current_semesters cascade;

drop table if exists current_semesters_until_the_end_of_study cascade;

drop table if exists days cascade;

drop table if exists employees cascade;

drop table if exists fields_of_study cascade;

drop table if exists items_kpi cascade;

drop table if exists lector cascade;

drop table if exists member cascade;

drop table if exists methodics cascade;

drop table if exists person cascade;

drop table if exists person_salary cascade;

drop table if exists profile cascade;

drop table if exists roles cascade;

drop table if exists salary_scale cascade;

drop table if exists schedule cascade;

drop table if exists schedule_in_weeks cascade;

drop table if exists semesters cascade;

drop table if exists study_groups cascade;

drop table if exists study_groups1 cascade;

drop table if exists study_plans cascade;

drop table if exists subjects cascade;

drop table if exists teachers cascade;

drop table if exists test cascade;

