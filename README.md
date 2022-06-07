# Tests_Uninaitres_JUnit
Découverte des tests unitaire avec JUnit
Lors de la réalisation d’un projet informatique, *les tests unitaires (« TU »)* vont permettre de garantir la qualité du résultat
Le test unitaire doit être vu comme un ***complément à la documentation***, permettant de comprendre le **fonctionnement** de l’application

1. Créer un projet

2. Importer la dépendance **jUnitJupiter** de JUnit 5 qui comporte 3 modules (Platform, Jupiter et Vintage) dans le fichier *pom.xml*
> **JUnit Jupiter** : API reposant sur des ***annotations*** pour écrire des tests unitaires JUnit 5 et un **TestEngine** pour exécuter les tests

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
- Ecriture de classes de tests avec des méthodes annotées (annotations JUnit5)
- Chaque test est défini dans une méthode comportant l’annotation *@test* dans le bloc de documentation de la méthode
- Dans une méthode de test, on utilise des **assertions** pour effectuer les vérifications (par exemple assertSame() pour vérifier qu’une valeur constatée correspond à une valeur attendue)

Exemple Test

```
import static org.junit.jupiter.api.Assertions.assertEquals;
import example.util.Calculator;
import org.junit.jupiter.api.Test;
class MyFirstJUnitJupiterTests {
      	private final Calculator calculator = new Calculator();      
	@Test     
	void addition() {
        assertEquals(2, calculator.add(1, 1));
     	}
}
```
