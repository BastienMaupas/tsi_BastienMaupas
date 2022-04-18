create table if not exists 'Patient'(
    Pt_ID int not null primary key ,
    Pt_name varchar(30),
    Pt_email varchar(70)
);

create table if not exists 'Nurse'(
    Nr_ID int not null primary key,
    Nr_name varchar(30),
    Nr_email varchar(70),
    Foreign key (Pt_ID) references Patient(Pt_ID)
);

insert into Patient (Pt_ID, Pt_name, Pt_email) Values (1, 'lalala', 'lalalala@gmail.com')
insert into Nurse (Nr_ID, Nr_name, Nr_email, Pt_ID) Values (1, 'mamamamama', 'mamamama@gmail.com', 1)

