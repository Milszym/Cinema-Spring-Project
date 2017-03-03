
INSERT INTO użytkownicy(enabled, password, username) values(false, "kopytko", "mojNick");
INSERT INTO użytkownicy(enabled, password, username) values(false, "szeregowy", "szeregowyKrzych");
INSERT INTO użytkownicy(enabled, password, username) values(false, "oktet123", "lidutko");
INSERT INTO użytkownicy(enabled, password, username) values(false, "panimajon", "zoltodziob");
INSERT INTO użytkownicy(enabled, password, username) values(true, "admin123", "admin");

INSERT INTO role(roleName) values("ADMIN");
INSERT INTO role(roleName) values("USER");
DELETE FROM role WHERE roleId>2;
DELETE FROM usersandroles WHERE role_id>0;

INSERT INTO usersandroles(user_id, role_id) values(2, (SELECT roleId FROM role WHERE roleName="USER"));
INSERT INTO usersandroles(user_id, role_id) values(3, (SELECT roleId FROM role WHERE roleName="USER"));
INSERT INTO usersandroles(user_id, role_id) values(4, (SELECT roleId FROM role WHERE roleName="USER"));
INSERT INTO usersandroles(user_id, role_id) values(5, (SELECT roleId FROM role WHERE roleName="USER"));
INSERT INTO usersandroles(user_id, role_id) values(5, (SELECT roleId FROM role WHERE roleName="ADMIN"));


