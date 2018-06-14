# Test for Data Engineer position

#Part 1

Tout d'abord, on itère sur la liste d'entiers, pour trouver le min et le max, et aussi construire une map des
entiers présents dans la liste d'input.

Ensuite on itère de (min + 1) à (max - 1) pour déterminer les valeurs non présentes dans la map, auquel
cas on les ajoute à la liste des valeurs manquantes.

Compléxite globale : O(N + MAX - MIN)


#Part 2

1) On convertit tout simplement la liste en un set, qui a la propriété de ne pas avoir de doublon, et on retourne
la taille du set.

Compléxité globale : O(N)

2) Alors, non on ne peut pas applique la solution 1. J'ai considéré qu'en input j'avais une liste de listes d'utilisateurs.
On convertit tout d'abord les listes en map (O(NB JOURS * N)) (N nombre d'utilisateurs max)

On combine les map en une seule map (O(NB JOURS * N))

On retourne le nombre de clé presente dans la map.

Compléxité globale : O(N)
