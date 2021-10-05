/* 

Pseudo

citsete n numere a1,a2, ..., an
min ← a1
i ← 2

┌cat timp i <= n executa
│    ┌daca min > ai atunci min ← ai
│    └■
│    i ← i + 1
└■

scrie min

------------------------------

citeste n
citeste x
min ← x

i ← 1

┌cat timp i<=n executa
│    citeste x
│    ┌daca min > x atunci
│    │    min ← x
│    └■
│    i ← i + 1
└■

*/