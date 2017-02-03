# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table person (
  id                        bigint not null,
  salary                    double,
  job_title                 varchar(255),
  user_id                   bigint,
  constraint pk_person primary key (id))
;

create table profile (
  id                        bigint not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  phone_number              varchar(255),
  user_id                   bigint,
  constraint pk_profile primary key (id))
;

create table user (
  id                        bigint not null,
  active                    boolean,
  email                     varchar(255),
  password                  varchar(255),
  person_id                 bigint,
  profile_id                bigint,
  constraint pk_user primary key (id))
;

create sequence person_seq;

create sequence profile_seq;

create sequence user_seq;

alter table person add constraint fk_person_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_person_user_1 on person (user_id);
alter table profile add constraint fk_profile_user_2 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_profile_user_2 on profile (user_id);
alter table user add constraint fk_user_person_3 foreign key (person_id) references person (id) on delete restrict on update restrict;
create index ix_user_person_3 on user (person_id);
alter table user add constraint fk_user_profile_4 foreign key (profile_id) references profile (id) on delete restrict on update restrict;
create index ix_user_profile_4 on user (profile_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists person;

drop table if exists profile;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists person_seq;

drop sequence if exists profile_seq;

drop sequence if exists user_seq;

