create table user_role (
  id bigint auto_increment not null,
  user_id bigint not null,
  role_id bigint not null,
  primary key (id),
  unique key UK_USER_ROLE(user_id, role_id),
  foreign key (user_id) references user(id),
  foreign key (role_id) references role(id)
)
