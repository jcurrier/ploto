# --- !Ups
create table if not exists job (
  id               bigint not null,
  title            varchar(255),
  description      text,
  location         varchar(128),
  status           tinyint,
  posted           datetime,
  last_updated     timestamp,
  constraint pk_job primary key (id)
);

create table if not exists user (
  email            varchar(255),
  password         varchar(255),
  created_on       datetime,
  last_updated     timestamp,
  is_active        boolean,
  constraint pk_user primary key (email)
);

create table if not exists applicant (
  email            varchar(255) not null,
  resume_url       varchar(255) not null,
  is_active        boolean,
  last_updated     timestamp,
  constraint pk_applicant primary key (email)
);

create table if not exists job_applicantion (
  job_id              bigint not null,
  applicant_id        varchar(255) not null,
  recruiter           varchar(255) not null,
  hiring_mgr          varchar(255) not null,
  constraint pk_job_application primary key (job_id, applicant_id),
  foreign key (job_id) references job (id),
  foreign key (applicant_id) references applicant (email),
  foreign key (recruiter) references user(email),
  foreign key (hiring_mgr) references user(email)
);