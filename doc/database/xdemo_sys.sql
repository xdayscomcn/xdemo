drop table if exists admin;

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   id                   varchar(32) not null comment '主键',
   department           varchar(32) comment '部门',
   email                varchar(32) comment '邮箱',
   isAccountEnabled     varchar(32) comment '是否可用',
   isAccountExpired     varchar(32) comment '是否过期',
   isAccountLocked      varchar(32) comment '是否锁定',
   isCredentialsExpired varchar(32) comment '是否证书过期',
   lockedDate           varchar(32) comment '锁定日期',
   loginDate            varchar(32) comment '登录日期',
   loginFailureCount    varchar(32) comment '登录失败次数',
   loginIp              varchar(32) comment '登录IP',
   name                 varchar(32) comment '名称',
   password             varchar(32) comment '密码',
   username             varchar(32) comment '用户名',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table admin comment '管理员';

drop table if exists role;

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   varchar(32) not null comment '主键',
   description          varchar(32) comment '描述',
   isSystem             varchar(32) comment '是否系统角色',
   name                 varchar(32) comment '名称',
   value                varchar(32) comment '值',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table role comment '角色';

drop table if exists resource;

/*==============================================================*/
/* Table: resource                                              */
/*==============================================================*/
create table resource
(
   id                   varchar(32) not null comment '主键',
   description          text comment '描述',
   isSystem             varchar(32) comment '是否系统资源',
   name                 varchar(32) comment '名称',
   orderList            varchar(32) comment '排序',
   value                varchar(32) comment '值',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table resource comment '资源';
