TYPE=VIEW
query=select month(`t`.`date_heure`) AS `mois`,year(`t`.`date_heure`) AS `year`,`td`.`type` AS `type`,count(`d`.`quantite`) AS `quantite` from ((`recycl`.`TOURNEE` `t` join `recycl`.`DECHET_DEMANDE` `d` on((`d`.`tournee` = `t`.`id`))) join `recycl`.`TYPE_DECHET` `td` on((`td`.`id` = `d`.`type_dechet`))) group by month(`t`.`date_heure`),year(`t`.`date_heure`),`d`.`type_dechet`
md5=7207fcbb0755efe2798720780bbafde3
updatable=0
algorithm=0
definer_user=root
definer_host=%
suid=1
with_check_option=0
timestamp=2020-05-27 12:53:42
create-version=1
source=select month(`t`.`date_heure`) AS `mois`,year(`t`.`date_heure`) AS `year`,`td`.`type` AS `type`,count(`d`.`quantite`) AS `quantite` from ((`TOURNEE` `t` join `DECHET_DEMANDE` `d` on((`d`.`tournee` = `t`.`id`))) join `TYPE_DECHET` `td` on((`td`.`id` = `d`.`type_dechet`))) group by month(`t`.`date_heure`),year(`t`.`date_heure`),`d`.`type_dechet`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select month(`t`.`date_heure`) AS `mois`,year(`t`.`date_heure`) AS `year`,`td`.`type` AS `type`,count(`d`.`quantite`) AS `quantite` from ((`recycl`.`TOURNEE` `t` join `recycl`.`DECHET_DEMANDE` `d` on((`d`.`tournee` = `t`.`id`))) join `recycl`.`TYPE_DECHET` `td` on((`td`.`id` = `d`.`type_dechet`))) group by month(`t`.`date_heure`),year(`t`.`date_heure`),`d`.`type_dechet`
