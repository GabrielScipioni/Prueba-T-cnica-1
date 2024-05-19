# Prueba-Tecnica-1
una prueba tecnica basada en que Magneto busca mutantes por su (array) de ADN
----

## CONSIGNA
magneto quiere reclutar la mayor cantidad de mutantes para poder luchar contra los X-Men.
Te ha contratado a ti para que desarrolles un proyecto que detecte si un humano es mutante, basandote en su ADN.
Para eso te ha pedido crear un programa con un metodo o funcion con la siguiente firma

```java
boolean isMutant(String[] dna)
```

En donde recibirás como parametro un **Array de String** que representa cada fila de una tabla de (NxN) con la secuencia del ADN.
Las letras de los String solo pueden ser: **(A,T,C,G)** las cuales representan cada base nitrogenada del ADN.


primer tipo de ADN

| A | T | G | C | G | A |
|---|---|---|---|---|---|
| C | A | G | T | G | C |
| T | T | A | T | T | T |
| A | G | A | C | G | G |
| G | C | G | T | C | A |
| T | C | A | C | T | G |

>Si se pasara este String[] como parametro recibiria **False**, ya que no cumple con los requerimientos
----

segundo tipo de ADN

| **A** | T     | G | C     | **G** | A |
|-------|-------|---|-------|-------|---|
| C     | **A** | G | T     | **G** | C |
| T     | T     | **A** | T | **G** | T |
| A     | G     | A | **A** | **G** | G |
| **C** | **C** | **C** | **C** | T | A |
| T     | C     | A | C     | T     | G |

>Si se pasara este Strig[] como parametro recibiria **True**, ya que cumple con los requerimientos
----
Se sabra si un humano es mutante si encuentras mas de una secuencia de cuatro letras iguales de forma **oblicua, horizontal o vertical**.

por ejemplo el segundo tipo de ADN String[] se veria algo asi
´´´ Java
String[] dna=   {"ATGCGA","CAGTGA","TTATGT","AGAAGG","CCCCTA","TCACTG"};
´´´
