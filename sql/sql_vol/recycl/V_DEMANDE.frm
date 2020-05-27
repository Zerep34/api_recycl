TYPE=VIEW
query=select `d`.`nodemande` AS `nodemande`,`d`.`date` AS `date`,`dechet`.`tournee` AS `tournee`,`e`.`nom` AS `nom`,`typ`.`type` AS `type`,`dechet`.`quantite` AS `quantite` from (((`recycl`.`DEMANDE` `d` join `recycl`.`ENTREPRISE` `e` on((`e`.`siret` = `d`.`siret`))) join `recycl`.`DECHET_DEMANDE` `dechet` on((`d`.`nodemande` = `dechet`.`nodemande`))) join `recycl`.`TYPE_DECHET` `typ` on((`typ`.`id` = `dechet`.`type_dechet`)))
md5=abe140cb54630a6d4eaddef5cab66d44
updatable=1
algorithm=0
definer_user=root
definer_host=%
suid=1
with_check_option=0
timestamp=2020-05-27 12:53:42
create-version=1
source=select `d`.`nodemande` AS `nodemande`,`d`.`date` AS `date`,`dechet`.`tournee` AS `tournee`,`e`.`nom` AS `nom`,`typ`.`type` AS `type`,`dechet`.`quantite` AS `quantite` from (((`DEMANDE` `d` join `ENTREPRISE` `e` on((`e`.`siret` = `d`.`siret`))) join `DECHET_DEMANDE` `dechet` on((`d`.`nodemande` = `dechet`.`nodemande`))) join `TYPE_DECHET` `typ` on((`typ`.`id` = `dechet`.`type_dechet`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `d`.`nodemande` AS `nodemande`,`d`.`date` AS `date`,`dechet`.`tournee` AS `tournee`,`e`.`nom` AS `nom`,`typ`.`type` AS `type`,`dechet`.`quantite` AS `quantite` from (((`recycl`.`DEMANDE` `d` join `recycl`.`ENTREPRISE` `e` on((`e`.`siret` = `d`.`siret`))) join `recycl`.`DECHET_DEMANDE` `dechet` on((`d`.`nodemande` = `dechet`.`nodemande`))) join `recycl`.`TYPE_DECHET` `typ` on((`typ`.`id` = `dechet`.`type_dechet`)))
