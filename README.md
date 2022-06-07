# Tests_Uninaitres_JUnit
Découverte des tests unitaire avec JUnit
Lors de la réalisation d’un projet informatique, *les tests unitaires (« TU »)* vont permettre de garantir la qualité du résultat
Le test unitaire doit être vu comme un ***complément à la documentation***, permettant de comprendre le **fonctionnement** de l’application

1. Créer un projet

2. Importer la dépendance jUnit qui comporte 3 modules (Platform, Jupiter et Vintage) dans le fichier *pom.xml*

```	<dependency>
        	<groupId>org.junit.jupiter</groupId>
         	<artifactId>junit-jupiter-api</artifactId>
         	<version>5.6.0</version>
         	<scope>test</scope>
    	</dependency>
         
    	<dependency>
   		<groupId>org.junit.jupiter</groupId>
	    	<artifactId>junit-jupiter-params</artifactId>
	        <version>5.6.0</version>
	        <scope>test</scope>

        </dependency>
	        <groupId>org.junit.jupiter</groupId>
	        <artifactId>junit-jupiter-engine</artifactId>
	        <version>5.6.0</version>
	        <scope>test</scope>
         </dependency>
```
