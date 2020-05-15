-- we don't know how to generate root <with-no-name> (class Root) :(
create table roles
(
    role_id int auto_increment
        primary key,
    roleName varchar(225) not null
);

create table schedule_conf
(
    sid int auto_increment
        primary key,
    cid int not null,
    title varchar(225) not null,
    description mediumtext null,
    start_date date null,
    end_date date null,
    archived tinyint(1) default 0 not null
);

create table tracks
(
    track_id int auto_increment
        primary key,
    sched_conf_id int not null,
    title varchar(255) not null,
    `desc` varchar(225) null,
    constraint tracks_ibfk_1
        foreign key (sched_conf_id) references schedule_conf (sid)
);

create table papers
(
    paper_id int auto_increment
        primary key,
    uid int not null,
    sched_conf_id int not null,
    track_id int not null,
    title varchar(255) not null,
    paper blob null,
    paper_type varchar(220) not null,
    date_submitted date not null,
    status varchar(255) null,
    current_stage varchar(225) not null,
    options mediumtext null,
    constraint sched_id_fk
        foreign key (sched_conf_id) references schedule_conf (sid)
            on update cascade on delete cascade,
    constraint track_id_fk
        foreign key (track_id) references tracks (track_id)
            on update cascade on delete cascade
);

create index sched_conf_id
    on tracks (sched_conf_id);

create table users
(
    uid int auto_increment
        primary key,
    email varchar(225) not null,
    username varchar(225) not null,
    fullName varchar(225) not null,
    pass varchar(225) not null,
    gender varchar(225) not null,
    country varchar(225) not null,
    account_type varchar(225) not null,
    options mediumtext null,
    constraint users_email_uindex
        unique (email),
    constraint users_username_uindex
        unique (username)
);

create table confrence
(
    cid int auto_increment
        primary key,
    uid int not null,
    title varchar(255) not null,
    `desc` varchar(255) null,
    options mediumtext null,
    constraint user_confrence_uid
        foreign key (uid) references users (uid)
            on update cascade on delete cascade
);

create table conf_roles
(
    cid int not null,
    uid int not null,
    role_id int not null,
    sched_id int null,
    primary key (cid, uid),
    constraint role_conf_cid
        foreign key (cid) references confrence (cid)
            on update cascade on delete cascade,
    constraint role_conf_rid
        foreign key (role_id) references roles (role_id)
            on update cascade on delete cascade,
    constraint role_conf_sid
        foreign key (sched_id) references schedule_conf (sid)
            on update cascade on delete cascade,
    constraint role_conf_uid
        foreign key (uid) references users (uid)
            on update cascade on delete cascade
);

create table review_assignments
(
    review_id int auto_increment
        primary key,
    paper_id int not null,
    reviewer_id int not null,
    recommendation mediumtext not null,
    date_assigned date not null,
    date_notified date not null,
    date_confirmed date not null,
    date_completed date not null,
    last_modified date not null,
    declined tinyint(1) not null,
    replaced tinyint(1) not null,
    cancelled tinyint(1) not null,
    stage varchar(255) not null,
    constraint review_assignments_ibfk_1
        foreign key (reviewer_id) references users (uid),
    constraint review_assignments_ibfk_2
        foreign key (paper_id) references papers (paper_id)
);

create index paper_id
    on review_assignments (paper_id);

create index reviewer_id
    on review_assignments (reviewer_id);

create index reviewer_id_2
    on review_assignments (reviewer_id);

