use arivana;

create table Language (
ID				integer		primary key auto_increment,
SkillName		varchar(30)	not null,
SkillPointPer	integer,
IntelligenceMin	integer
);

create table Spell (
ID				integer		primary key auto_increment,
Name			varchar(30)	not null,
Description		varchar(255),
SkillPointPer	integer,
CastLvl			integer
);