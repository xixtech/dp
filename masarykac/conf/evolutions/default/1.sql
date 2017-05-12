# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table access_role (
  id                            bigserial not null,
  role                          varchar(255),
  description                   varchar(255),
  active                        boolean,
  constraint pk_access_role primary key (id)
);

create table classroom (
  id                            bigserial not null,
  capacity                      integer,
  classroom_name                varchar(255),
  active                        boolean,
  constraint pk_classroom primary key (id)
);

create table committee (
  id                            bigserial not null,
  date_of_committee             timestamp,
  semester_id                   bigint,
  active                        boolean,
  constraint pk_committee primary key (id)
);

create table committee_participants (
  id                            bigserial not null,
  role_in_committee             varchar(255),
  committee_id                  bigint,
  employees_id                  bigint,
  constraint pk_committee_participants primary key (id)
);

create table courses (
  id                            bigserial not null,
  semester_id                   bigint,
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
  semester_id                   bigint,
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
  access_role_id                bigint,
  member_id                     bigint,
  constraint uq_employees_member_id unique (member_id),
  constraint pk_employees primary key (id)
);

create table fields_of_study (
  id                            bigserial not null,
  field_of_study                varchar(255),
  field_of_study_v              varchar(255),
  study                         varchar(255),
  fields_of_study_language      varchar(255),
  form_of_teaching              varchar(255),
  active                        boolean,
  constraint pk_fields_of_study primary key (id)
);

create table final_works (
  id                            bigserial not null,
  final_works_name              varchar(255),
  names                         varchar(255),
  year                          timestamp,
  semester_id                   bigint,
  active                        boolean,
  constraint pk_final_works primary key (id)
);

create table final_works_participants (
  id                            bigserial not null,
  teachers_role                 varchar(255),
  final_works_id                bigint,
  employees_id                  bigint,
  constraint pk_final_works_participants primary key (id)
);

create table global_values (
  id                            bigserial not null,
  semester_id                   bigint,
  constraint pk_global_values primary key (id)
);

create table ideas (
  id                            bigserial not null,
  idea                          varchar(255),
  date                          timestamp,
  employees_id                  bigint,
  constraint uq_ideas_employees_id unique (employees_id),
  constraint pk_ideas primary key (id)
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
  uid                           varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  employees_id                  bigint,
  person_id                     bigint,
  profile_id                    bigint,
  constraint uq_member_employees_id unique (employees_id),
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

create table organizational_units (
  id                            bigserial not null,
  organizational_unit_number    varchar(255),
  organizational_unit_number_parent varchar(255),
  title_czech                   varchar(255),
  title_english                 varchar(255),
  function_name_of_senior_employee varchar(255),
  function_name_of_senior_employee_appointment varchar(255),
  organizational_unit_responsible bigint,
  has_head_of_organization      boolean,
  has_deputy_head_of_organization boolean,
  active                        boolean,
  constraint pk_organizational_units primary key (id)
);

create table organizational_units_participants (
  id                            bigserial not null,
  function                      varchar(255),
  function_name                 varchar(255),
  employees_id                  bigint,
  organizational_units_id       bigint,
  constraint pk_organizational_units_participants primary key (id)
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

create table projects (
  id                            bigserial not null,
  project_name                  varchar(255),
  project_from                  timestamp,
  project_to                    timestamp,
  semester_id                   bigint,
  has_grant                     boolean,
  grant_value                   varchar(255),
  active                        boolean,
  constraint pk_projects primary key (id)
);

create table projects_participants (
  id                            bigserial not null,
  project_role                  varchar(255),
  employees_id                  bigint,
  projects_id                   bigint,
  constraint pk_projects_participants primary key (id)
);

create table publications (
  id                            bigserial not null,
  year_of_publication           varchar(255),
  semester_id                   bigint,
  type                          varchar(255),
  citation                      varchar(255),
  active                        boolean,
  constraint pk_publications primary key (id)
);

create table publications_participants (
  id                            bigserial not null,
  faculty                       varchar(255),
  order_in_publication          varchar(255),
  department                    varchar(255),
  share                         varchar(255),
  publications_id               bigint,
  employees_id                  bigint,
  constraint pk_publications_participants primary key (id)
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
  semester_id                   bigint,
  ident                         varchar(255),
  days_id                       bigint,
  schedule_from                 varchar(255),
  schedule_to                   varchar(255),
  class_room_id                 bigint,
  courses_id                    bigint,
  constraint pk_schedule primary key (id)
);

create table schedule_in_weeks (
  id                            bigserial not null,
  semester_id                   bigint,
  ident                         varchar(255),
  days_id                       bigint,
  schedule_from                 varchar(255),
  schedule_to                   varchar(255),
  class_room_id                 bigint,
  schedule_week                 integer,
  schedule_year                 integer,
  courses_id                    bigint,
  schedule_id                   bigint,
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
  active                        boolean,
  constraint pk_semesters primary key (id)
);

create table statement (
  id                            bigserial not null,
  date                          timestamp,
  state                         varchar(255),
  active                        boolean,
  semester_id                   bigint,
  employees_id                  bigint,
  manager_employee_id           bigint,
  constraint pk_statement primary key (id)
);

create table statement_committee_participants (
  id                            bigserial not null,
  date                          timestamp,
  state                         varchar(255),
  note                          varchar(255),
  semester_id                   bigint,
  committee_participants_id     bigint,
  statement_id                  bigint,
  constraint pk_statement_committee_participants primary key (id)
);

create table statement_final_works_participants (
  id                            bigserial not null,
  date                          timestamp,
  state                         varchar(255),
  note                          varchar(255),
  semester_id                   bigint,
  final_works_participants_id   bigint,
  statement_id                  bigint,
  constraint pk_statement_final_works_participants primary key (id)
);

create table statement_projects_participants (
  id                            bigserial not null,
  date                          timestamp,
  state                         varchar(255),
  note                          varchar(255),
  semester_id                   bigint,
  projects_participants_id      bigint,
  statement_id                  bigint,
  constraint pk_statement_projects_participants primary key (id)
);

create table statement_publications_participants (
  id                            bigserial not null,
  date                          timestamp,
  state                         varchar(255),
  note                          varchar(255),
  semester_id                   bigint,
  publications_participants_id  bigint,
  statement_id                  bigint,
  constraint pk_statement_publications_participants primary key (id)
);

create table statement_teachers_participants (
  id                            bigserial not null,
  date                          timestamp,
  state                         varchar(255),
  note                          varchar(255),
  semester_id                   bigint,
  teachers_id                   bigint,
  statement_id                  bigint,
  constraint pk_statement_teachers_participants primary key (id)
);

create table statement_visits_participants (
  id                            bigserial not null,
  date                          timestamp,
  state                         varchar(255),
  note                          varchar(255),
  semester_id                   bigint,
  visits_participants_id        bigint,
  statement_id                  bigint,
  constraint pk_statement_visits_participants primary key (id)
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
  active                        boolean,
  constraint pk_subjects primary key (id)
);

create table teachers (
  id                            bigserial not null,
  courses_id                    bigint,
  employees_id                  bigint,
  scale                         float,
  summary                       float,
  recounted_summary             float,
  teachers_role_id              bigint,
  constraint pk_teachers primary key (id)
);

create table teachers_in_weeks (
  id                            bigserial not null,
  teachers_id                   bigint,
  schedule_in_weeks_id          bigint,
  scale                         float,
  constraint pk_teachers_in_weeks primary key (id)
);

create table teachers_role (
  id                            bigserial not null,
  role                          varchar(255),
  active                        boolean,
  constraint pk_teachers_role primary key (id)
);

create table test (
  id                            bigserial not null,
  name                          varchar(255),
  value                         varchar(255),
  constraint pk_test primary key (id)
);

create table visits (
  id                            bigserial not null,
  purpose_of_visit              varchar(255),
  country                       varchar(255),
  event                         varchar(255),
  visit_from                    timestamp,
  visit_to                      timestamp,
  semester_id                   bigint,
  active                        boolean,
  constraint pk_visits primary key (id)
);

create table visits_participants (
  id                            bigserial not null,
  employees_id                  bigint,
  visits_id                     bigint,
  constraint pk_visits_participants primary key (id)
);

alter table committee add constraint fk_committee_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_committee_semester_id on committee (semester_id);

alter table committee_participants add constraint fk_committee_participants_committee_id foreign key (committee_id) references committee (id) on delete restrict on update restrict;
create index ix_committee_participants_committee_id on committee_participants (committee_id);

alter table committee_participants add constraint fk_committee_participants_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_committee_participants_employees_id on committee_participants (employees_id);

alter table courses add constraint fk_courses_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_courses_semester_id on courses (semester_id);

alter table courses add constraint fk_courses_subjects_id foreign key (subjects_id) references subjects (id) on delete restrict on update restrict;
create index ix_courses_subjects_id on courses (subjects_id);

alter table current_semesters_until_the_end_of_study add constraint fk_current_semesters_until_the_end_of_study_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_current_semesters_until_the_end_of_study_semester_id on current_semesters_until_the_end_of_study (semester_id);

alter table employees add constraint fk_employees_access_role_id foreign key (access_role_id) references access_role (id) on delete restrict on update restrict;
create index ix_employees_access_role_id on employees (access_role_id);

alter table employees add constraint fk_employees_member_id foreign key (member_id) references member (id) on delete restrict on update restrict;

alter table final_works add constraint fk_final_works_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_final_works_semester_id on final_works (semester_id);

alter table final_works_participants add constraint fk_final_works_participants_final_works_id foreign key (final_works_id) references final_works (id) on delete restrict on update restrict;
create index ix_final_works_participants_final_works_id on final_works_participants (final_works_id);

alter table final_works_participants add constraint fk_final_works_participants_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_final_works_participants_employees_id on final_works_participants (employees_id);

alter table ideas add constraint fk_ideas_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;

alter table member add constraint fk_member_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;

alter table member add constraint fk_member_person_id foreign key (person_id) references person (id) on delete restrict on update restrict;

alter table member add constraint fk_member_profile_id foreign key (profile_id) references profile (id) on delete restrict on update restrict;

alter table organizational_units_participants add constraint fk_organizational_units_participants_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_organizational_units_participants_employees_id on organizational_units_participants (employees_id);

alter table organizational_units_participants add constraint fk_organizational_units_participants_organizational_units_2 foreign key (organizational_units_id) references organizational_units (id) on delete restrict on update restrict;
create index ix_organizational_units_participants_organizational_units_2 on organizational_units_participants (organizational_units_id);

alter table person add constraint fk_person_member_id foreign key (member_id) references member (id) on delete restrict on update restrict;

alter table profile add constraint fk_profile_member_id foreign key (member_id) references member (id) on delete restrict on update restrict;

alter table projects add constraint fk_projects_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_projects_semester_id on projects (semester_id);

alter table projects_participants add constraint fk_projects_participants_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_projects_participants_employees_id on projects_participants (employees_id);

alter table projects_participants add constraint fk_projects_participants_projects_id foreign key (projects_id) references projects (id) on delete restrict on update restrict;
create index ix_projects_participants_projects_id on projects_participants (projects_id);

alter table publications add constraint fk_publications_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_publications_semester_id on publications (semester_id);

alter table publications_participants add constraint fk_publications_participants_publications_id foreign key (publications_id) references publications (id) on delete restrict on update restrict;
create index ix_publications_participants_publications_id on publications_participants (publications_id);

alter table publications_participants add constraint fk_publications_participants_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_publications_participants_employees_id on publications_participants (employees_id);

alter table schedule add constraint fk_schedule_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_schedule_semester_id on schedule (semester_id);

alter table schedule add constraint fk_schedule_days_id foreign key (days_id) references days (id) on delete restrict on update restrict;
create index ix_schedule_days_id on schedule (days_id);

alter table schedule add constraint fk_schedule_class_room_id foreign key (class_room_id) references classroom (id) on delete restrict on update restrict;
create index ix_schedule_class_room_id on schedule (class_room_id);

alter table schedule add constraint fk_schedule_courses_id foreign key (courses_id) references courses (id) on delete restrict on update restrict;
create index ix_schedule_courses_id on schedule (courses_id);

alter table schedule_in_weeks add constraint fk_schedule_in_weeks_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_schedule_in_weeks_semester_id on schedule_in_weeks (semester_id);

alter table schedule_in_weeks add constraint fk_schedule_in_weeks_days_id foreign key (days_id) references days (id) on delete restrict on update restrict;
create index ix_schedule_in_weeks_days_id on schedule_in_weeks (days_id);

alter table schedule_in_weeks add constraint fk_schedule_in_weeks_class_room_id foreign key (class_room_id) references classroom (id) on delete restrict on update restrict;
create index ix_schedule_in_weeks_class_room_id on schedule_in_weeks (class_room_id);

alter table schedule_in_weeks add constraint fk_schedule_in_weeks_courses_id foreign key (courses_id) references courses (id) on delete restrict on update restrict;
create index ix_schedule_in_weeks_courses_id on schedule_in_weeks (courses_id);

alter table schedule_in_weeks add constraint fk_schedule_in_weeks_schedule_id foreign key (schedule_id) references schedule (id) on delete restrict on update restrict;
create index ix_schedule_in_weeks_schedule_id on schedule_in_weeks (schedule_id);

alter table statement add constraint fk_statement_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_statement_semester_id on statement (semester_id);

alter table statement add constraint fk_statement_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_statement_employees_id on statement (employees_id);

alter table statement add constraint fk_statement_manager_employee_id foreign key (manager_employee_id) references employees (id) on delete restrict on update restrict;
create index ix_statement_manager_employee_id on statement (manager_employee_id);

alter table statement_committee_participants add constraint fk_statement_committee_participants_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_statement_committee_participants_semester_id on statement_committee_participants (semester_id);

alter table statement_committee_participants add constraint fk_statement_committee_participants_committee_participant_2 foreign key (committee_participants_id) references committee_participants (id) on delete restrict on update restrict;
create index ix_statement_committee_participants_committee_participant_2 on statement_committee_participants (committee_participants_id);

alter table statement_committee_participants add constraint fk_statement_committee_participants_statement_id foreign key (statement_id) references statement (id) on delete restrict on update restrict;
create index ix_statement_committee_participants_statement_id on statement_committee_participants (statement_id);

alter table statement_final_works_participants add constraint fk_statement_final_works_participants_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_statement_final_works_participants_semester_id on statement_final_works_participants (semester_id);

alter table statement_final_works_participants add constraint fk_statement_final_works_participants_final_works_partici_2 foreign key (final_works_participants_id) references final_works_participants (id) on delete restrict on update restrict;
create index ix_statement_final_works_participants_final_works_partici_2 on statement_final_works_participants (final_works_participants_id);

alter table statement_final_works_participants add constraint fk_statement_final_works_participants_statement_id foreign key (statement_id) references statement (id) on delete restrict on update restrict;
create index ix_statement_final_works_participants_statement_id on statement_final_works_participants (statement_id);

alter table statement_projects_participants add constraint fk_statement_projects_participants_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_statement_projects_participants_semester_id on statement_projects_participants (semester_id);

alter table statement_projects_participants add constraint fk_statement_projects_participants_projects_participants_id foreign key (projects_participants_id) references projects_participants (id) on delete restrict on update restrict;
create index ix_statement_projects_participants_projects_participants_id on statement_projects_participants (projects_participants_id);

alter table statement_projects_participants add constraint fk_statement_projects_participants_statement_id foreign key (statement_id) references statement (id) on delete restrict on update restrict;
create index ix_statement_projects_participants_statement_id on statement_projects_participants (statement_id);

alter table statement_publications_participants add constraint fk_statement_publications_participants_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_statement_publications_participants_semester_id on statement_publications_participants (semester_id);

alter table statement_publications_participants add constraint fk_statement_publications_participants_publications_parti_2 foreign key (publications_participants_id) references publications_participants (id) on delete restrict on update restrict;
create index ix_statement_publications_participants_publications_parti_2 on statement_publications_participants (publications_participants_id);

alter table statement_publications_participants add constraint fk_statement_publications_participants_statement_id foreign key (statement_id) references statement (id) on delete restrict on update restrict;
create index ix_statement_publications_participants_statement_id on statement_publications_participants (statement_id);

alter table statement_teachers_participants add constraint fk_statement_teachers_participants_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_statement_teachers_participants_semester_id on statement_teachers_participants (semester_id);

alter table statement_teachers_participants add constraint fk_statement_teachers_participants_teachers_id foreign key (teachers_id) references teachers (id) on delete restrict on update restrict;
create index ix_statement_teachers_participants_teachers_id on statement_teachers_participants (teachers_id);

alter table statement_teachers_participants add constraint fk_statement_teachers_participants_statement_id foreign key (statement_id) references statement (id) on delete restrict on update restrict;
create index ix_statement_teachers_participants_statement_id on statement_teachers_participants (statement_id);

alter table statement_visits_participants add constraint fk_statement_visits_participants_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_statement_visits_participants_semester_id on statement_visits_participants (semester_id);

alter table statement_visits_participants add constraint fk_statement_visits_participants_visits_participants_id foreign key (visits_participants_id) references visits_participants (id) on delete restrict on update restrict;
create index ix_statement_visits_participants_visits_participants_id on statement_visits_participants (visits_participants_id);

alter table statement_visits_participants add constraint fk_statement_visits_participants_statement_id foreign key (statement_id) references statement (id) on delete restrict on update restrict;
create index ix_statement_visits_participants_statement_id on statement_visits_participants (statement_id);

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

alter table teachers add constraint fk_teachers_teachers_role_id foreign key (teachers_role_id) references teachers_role (id) on delete restrict on update restrict;
create index ix_teachers_teachers_role_id on teachers (teachers_role_id);

alter table teachers_in_weeks add constraint fk_teachers_in_weeks_teachers_id foreign key (teachers_id) references teachers (id) on delete restrict on update restrict;
create index ix_teachers_in_weeks_teachers_id on teachers_in_weeks (teachers_id);

alter table teachers_in_weeks add constraint fk_teachers_in_weeks_schedule_in_weeks_id foreign key (schedule_in_weeks_id) references schedule_in_weeks (id) on delete restrict on update restrict;
create index ix_teachers_in_weeks_schedule_in_weeks_id on teachers_in_weeks (schedule_in_weeks_id);

alter table visits add constraint fk_visits_semester_id foreign key (semester_id) references semesters (id) on delete restrict on update restrict;
create index ix_visits_semester_id on visits (semester_id);

alter table visits_participants add constraint fk_visits_participants_employees_id foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_visits_participants_employees_id on visits_participants (employees_id);

alter table visits_participants add constraint fk_visits_participants_visits_id foreign key (visits_id) references visits (id) on delete restrict on update restrict;
create index ix_visits_participants_visits_id on visits_participants (visits_id);


# --- !Downs

alter table if exists committee drop constraint if exists fk_committee_semester_id;
drop index if exists ix_committee_semester_id;

alter table if exists committee_participants drop constraint if exists fk_committee_participants_committee_id;
drop index if exists ix_committee_participants_committee_id;

alter table if exists committee_participants drop constraint if exists fk_committee_participants_employees_id;
drop index if exists ix_committee_participants_employees_id;

alter table if exists courses drop constraint if exists fk_courses_semester_id;
drop index if exists ix_courses_semester_id;

alter table if exists courses drop constraint if exists fk_courses_subjects_id;
drop index if exists ix_courses_subjects_id;

alter table if exists current_semesters_until_the_end_of_study drop constraint if exists fk_current_semesters_until_the_end_of_study_semester_id;
drop index if exists ix_current_semesters_until_the_end_of_study_semester_id;

alter table if exists employees drop constraint if exists fk_employees_access_role_id;
drop index if exists ix_employees_access_role_id;

alter table if exists employees drop constraint if exists fk_employees_member_id;

alter table if exists final_works drop constraint if exists fk_final_works_semester_id;
drop index if exists ix_final_works_semester_id;

alter table if exists final_works_participants drop constraint if exists fk_final_works_participants_final_works_id;
drop index if exists ix_final_works_participants_final_works_id;

alter table if exists final_works_participants drop constraint if exists fk_final_works_participants_employees_id;
drop index if exists ix_final_works_participants_employees_id;

alter table if exists ideas drop constraint if exists fk_ideas_employees_id;

alter table if exists member drop constraint if exists fk_member_employees_id;

alter table if exists member drop constraint if exists fk_member_person_id;

alter table if exists member drop constraint if exists fk_member_profile_id;

alter table if exists organizational_units_participants drop constraint if exists fk_organizational_units_participants_employees_id;
drop index if exists ix_organizational_units_participants_employees_id;

alter table if exists organizational_units_participants drop constraint if exists fk_organizational_units_participants_organizational_units_2;
drop index if exists ix_organizational_units_participants_organizational_units_2;

alter table if exists person drop constraint if exists fk_person_member_id;

alter table if exists profile drop constraint if exists fk_profile_member_id;

alter table if exists projects drop constraint if exists fk_projects_semester_id;
drop index if exists ix_projects_semester_id;

alter table if exists projects_participants drop constraint if exists fk_projects_participants_employees_id;
drop index if exists ix_projects_participants_employees_id;

alter table if exists projects_participants drop constraint if exists fk_projects_participants_projects_id;
drop index if exists ix_projects_participants_projects_id;

alter table if exists publications drop constraint if exists fk_publications_semester_id;
drop index if exists ix_publications_semester_id;

alter table if exists publications_participants drop constraint if exists fk_publications_participants_publications_id;
drop index if exists ix_publications_participants_publications_id;

alter table if exists publications_participants drop constraint if exists fk_publications_participants_employees_id;
drop index if exists ix_publications_participants_employees_id;

alter table if exists schedule drop constraint if exists fk_schedule_semester_id;
drop index if exists ix_schedule_semester_id;

alter table if exists schedule drop constraint if exists fk_schedule_days_id;
drop index if exists ix_schedule_days_id;

alter table if exists schedule drop constraint if exists fk_schedule_class_room_id;
drop index if exists ix_schedule_class_room_id;

alter table if exists schedule drop constraint if exists fk_schedule_courses_id;
drop index if exists ix_schedule_courses_id;

alter table if exists schedule_in_weeks drop constraint if exists fk_schedule_in_weeks_semester_id;
drop index if exists ix_schedule_in_weeks_semester_id;

alter table if exists schedule_in_weeks drop constraint if exists fk_schedule_in_weeks_days_id;
drop index if exists ix_schedule_in_weeks_days_id;

alter table if exists schedule_in_weeks drop constraint if exists fk_schedule_in_weeks_class_room_id;
drop index if exists ix_schedule_in_weeks_class_room_id;

alter table if exists schedule_in_weeks drop constraint if exists fk_schedule_in_weeks_courses_id;
drop index if exists ix_schedule_in_weeks_courses_id;

alter table if exists schedule_in_weeks drop constraint if exists fk_schedule_in_weeks_schedule_id;
drop index if exists ix_schedule_in_weeks_schedule_id;

alter table if exists statement drop constraint if exists fk_statement_semester_id;
drop index if exists ix_statement_semester_id;

alter table if exists statement drop constraint if exists fk_statement_employees_id;
drop index if exists ix_statement_employees_id;

alter table if exists statement drop constraint if exists fk_statement_manager_employee_id;
drop index if exists ix_statement_manager_employee_id;

alter table if exists statement_committee_participants drop constraint if exists fk_statement_committee_participants_semester_id;
drop index if exists ix_statement_committee_participants_semester_id;

alter table if exists statement_committee_participants drop constraint if exists fk_statement_committee_participants_committee_participant_2;
drop index if exists ix_statement_committee_participants_committee_participant_2;

alter table if exists statement_committee_participants drop constraint if exists fk_statement_committee_participants_statement_id;
drop index if exists ix_statement_committee_participants_statement_id;

alter table if exists statement_final_works_participants drop constraint if exists fk_statement_final_works_participants_semester_id;
drop index if exists ix_statement_final_works_participants_semester_id;

alter table if exists statement_final_works_participants drop constraint if exists fk_statement_final_works_participants_final_works_partici_2;
drop index if exists ix_statement_final_works_participants_final_works_partici_2;

alter table if exists statement_final_works_participants drop constraint if exists fk_statement_final_works_participants_statement_id;
drop index if exists ix_statement_final_works_participants_statement_id;

alter table if exists statement_projects_participants drop constraint if exists fk_statement_projects_participants_semester_id;
drop index if exists ix_statement_projects_participants_semester_id;

alter table if exists statement_projects_participants drop constraint if exists fk_statement_projects_participants_projects_participants_id;
drop index if exists ix_statement_projects_participants_projects_participants_id;

alter table if exists statement_projects_participants drop constraint if exists fk_statement_projects_participants_statement_id;
drop index if exists ix_statement_projects_participants_statement_id;

alter table if exists statement_publications_participants drop constraint if exists fk_statement_publications_participants_semester_id;
drop index if exists ix_statement_publications_participants_semester_id;

alter table if exists statement_publications_participants drop constraint if exists fk_statement_publications_participants_publications_parti_2;
drop index if exists ix_statement_publications_participants_publications_parti_2;

alter table if exists statement_publications_participants drop constraint if exists fk_statement_publications_participants_statement_id;
drop index if exists ix_statement_publications_participants_statement_id;

alter table if exists statement_teachers_participants drop constraint if exists fk_statement_teachers_participants_semester_id;
drop index if exists ix_statement_teachers_participants_semester_id;

alter table if exists statement_teachers_participants drop constraint if exists fk_statement_teachers_participants_teachers_id;
drop index if exists ix_statement_teachers_participants_teachers_id;

alter table if exists statement_teachers_participants drop constraint if exists fk_statement_teachers_participants_statement_id;
drop index if exists ix_statement_teachers_participants_statement_id;

alter table if exists statement_visits_participants drop constraint if exists fk_statement_visits_participants_semester_id;
drop index if exists ix_statement_visits_participants_semester_id;

alter table if exists statement_visits_participants drop constraint if exists fk_statement_visits_participants_visits_participants_id;
drop index if exists ix_statement_visits_participants_visits_participants_id;

alter table if exists statement_visits_participants drop constraint if exists fk_statement_visits_participants_statement_id;
drop index if exists ix_statement_visits_participants_statement_id;

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

alter table if exists teachers drop constraint if exists fk_teachers_teachers_role_id;
drop index if exists ix_teachers_teachers_role_id;

alter table if exists teachers_in_weeks drop constraint if exists fk_teachers_in_weeks_teachers_id;
drop index if exists ix_teachers_in_weeks_teachers_id;

alter table if exists teachers_in_weeks drop constraint if exists fk_teachers_in_weeks_schedule_in_weeks_id;
drop index if exists ix_teachers_in_weeks_schedule_in_weeks_id;

alter table if exists visits drop constraint if exists fk_visits_semester_id;
drop index if exists ix_visits_semester_id;

alter table if exists visits_participants drop constraint if exists fk_visits_participants_employees_id;
drop index if exists ix_visits_participants_employees_id;

alter table if exists visits_participants drop constraint if exists fk_visits_participants_visits_id;
drop index if exists ix_visits_participants_visits_id;

drop table if exists access_role cascade;

drop table if exists classroom cascade;

drop table if exists committee cascade;

drop table if exists committee_participants cascade;

drop table if exists courses cascade;

drop table if exists criteria_kpi cascade;

drop table if exists criteria_lector cascade;

drop table if exists current_semesters cascade;

drop table if exists current_semesters_until_the_end_of_study cascade;

drop table if exists days cascade;

drop table if exists employees cascade;

drop table if exists fields_of_study cascade;

drop table if exists final_works cascade;

drop table if exists final_works_participants cascade;

drop table if exists global_values cascade;

drop table if exists ideas cascade;

drop table if exists items_kpi cascade;

drop table if exists lector cascade;

drop table if exists member cascade;

drop table if exists methodics cascade;

drop table if exists organizational_units cascade;

drop table if exists organizational_units_participants cascade;

drop table if exists person cascade;

drop table if exists person_salary cascade;

drop table if exists profile cascade;

drop table if exists projects cascade;

drop table if exists projects_participants cascade;

drop table if exists publications cascade;

drop table if exists publications_participants cascade;

drop table if exists roles cascade;

drop table if exists salary_scale cascade;

drop table if exists schedule cascade;

drop table if exists schedule_in_weeks cascade;

drop table if exists semesters cascade;

drop table if exists statement cascade;

drop table if exists statement_committee_participants cascade;

drop table if exists statement_final_works_participants cascade;

drop table if exists statement_projects_participants cascade;

drop table if exists statement_publications_participants cascade;

drop table if exists statement_teachers_participants cascade;

drop table if exists statement_visits_participants cascade;

drop table if exists study_groups cascade;

drop table if exists study_groups1 cascade;

drop table if exists study_plans cascade;

drop table if exists subjects cascade;

drop table if exists teachers cascade;

drop table if exists teachers_in_weeks cascade;

drop table if exists teachers_role cascade;

drop table if exists test cascade;

drop table if exists visits cascade;

drop table if exists visits_participants cascade;

