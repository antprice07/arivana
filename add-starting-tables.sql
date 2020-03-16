use arivana;

create table Race (
ID			integer		primary key auto_increment,
Name		varchar(20)	not null unique,
SubRace		varchar(20) not null unique,
Description varchar(255)not null
); 

create table CharClass (
Id			integer		primary key auto_increment,
Name		varchar(20)		not null unique
);

create table Characters (
ID				integer		primary key auto_increment,
Name			varchar(20)	not null,
XP				integer		default 0,
Level			integer		default 1,
RaceID			integer		not null,
CharClassID		integer		not null,
Intelligence	integer		not null default 5,
Strength		integer		not null default 5,
Perception		integer		not null default 5,
Charisma		integer		not null default 5,
Dexterity		integer		not null default 5,
Wisdom			integer		not null default 5,
Sturdiness		integer		not null default 5,
NatMagic		integer		not null default 5,
Endurance		integer		not null default 5,
Luck			integer		not null default 5,
Hp				integer,
Foreign Key (RaceID) references race(ID),
Foreign Key (CharClassID) references charClass(ID)
);

create table CurrencyType (
ID			integer		primary key auto_increment,
Name		varchar(10)	not null
);

create table Weapon (
ID			integer		primary key auto_increment,
Name		varchar(30)	not null unique,
Damage		integer		not null,
TypeOfDmg	varchar(10) not null,
MonetaryVal integer		not null,
MonetaryType integer	not null,
foreign key (MonetaryType) references currencytype(ID)
);

create table Armor (
ID			integer		primary key auto_increment,
Name		varchar(30) not null unique,
SlashProt	integer,
CrushProt	integer,
PierceProt	integer,
DexterBuff	integer,
MonetaryVal	integer		not null,
MonetaryType integer	not null,
foreign key (MonetaryType) references currencytype(ID)
);

create table Potion (
ID			integer		primary key auto_increment,
Name		varchar(30)	not null unique,
Description	varchar(255) not null,
MonetaryVal	integer		not null,
MonetaryType integer	not null,
foreign key (MonetaryType) references currencytype(ID)
);

create table SurvivalItem (
ID			integer		primary key auto_increment,
Name		varchar(30)	not null unique,
MonetaryVal	integer		not null,
MonetaryType integer	not null,
foreign key (MonetaryType) references currencytype(ID)
);

create table MiscItem (
ID			integer		primary key auto_increment,
Name		varchar(30)	not null unique,
MonetaryVal	integer		not null,
MonetaryType integer	not null,
foreign key (MonetaryType) references currencytype(ID)
);

create table CharWeaponInvententory (
ID				integer		primary key auto_increment,
CharId			integer		not null,
WeaponId		integer		not null,
Quantity		integer		not null,
foreign key (CharId) references characters(ID),
foreign key (WeaponId) references weapon(ID),
CONSTRAINT weapon_char unique (CharId, WeaponId)
);

create table CharArmorInvententory (
ID				integer		primary key auto_increment,
CharId			integer		not null,
ArmorId			integer		not null,
Quantity		integer		not null,
foreign key (CharId) references characters(ID),
foreign key (ArmorId) references armor(ID),
CONSTRAINT armor_char unique (CharId, ArmorId)
);

create table CharMiscInvententory (
ID				integer		primary key auto_increment,
CharId			integer		not null,
MiscItemId		integer		not null,
Quantity		integer		not null,
foreign key (CharId) references characters(ID),
foreign key (MiscItemId) references miscitem(ID),
CONSTRAINT misc_char unique (CharId, MiscItemId)
);

create table CharSurvivalInvententory (
ID				integer		primary key auto_increment,
CharId			integer		not null,
SurvivalItemId	integer		not null,
Quantity		integer		not null,
foreign key (CharId) references characters(ID),
foreign key (SurvivalItemId) references survivalitem(ID),
CONSTRAINT surv_char unique (CharId, SurvivalItemId)
);

create table Skill (
ID					integer		primary key auto_increment,
Name				varchar(20) not null,
SkillPointPerLvl	integer		not null
);

create table CombatSkill (
ID					integer		primary key auto_increment,
Name				varchar(20) not null,
SkillPointPerLvl	integer		not null
);

create table CharSkill (
ID			integer		primary key auto_increment,
CharId		integer		not null,
SkillId		integer		not null,
Level		integer		not null default 1,
foreign key (CharId) references characters(ID),
foreign key (SkillId) references skill(ID),
constraint char_skill unique (CharId, SkillId)
);

create table CharCombatSkill (
ID				integer 	primary key auto_increment,
CharId			integer		not null,
CombatSkillId	integer		not null,
Level			integer		not null default 1,
foreign key (CharId) references characters(ID),
foreign key (CombatSkillId) references CombatSkill(ID),
constraint char_combat_skill unique (CharId, CombatSkillId)
);



















