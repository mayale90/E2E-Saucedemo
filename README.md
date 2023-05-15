# Testing E2E 

Proyecto de pruebas automatizadas E2E del flujo de compra de la página Flujo de compra página https://www.saucedemo.com/ . Usando la herramienta SerenityBDD con Screenplay 

Proyecto creado por: Mayra Romero


## Complementos
|**Intellij**|**Java**|**Gradle**| 
| :----: | :----: | :----: |
|[<img width="50" height="50" src="https://cdn.iconscout.com/icon/free/png-128/intellij-idea-569199.png">](https://www.jetbrains.com/es-es/idea/download/#section=windows)|[<img height="60" src="https://www.oracle.com/a/ocom/img/cb71-java-logo.png">](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)|[<img height="50" src="https://gradle.org/images/gradle-knowledge-graph-logo.png?20170228">](https://gradle.org/releases/)|

## Pre-requisitos

1. Descargar Gradle versión 7.3.3 y descomprimirlo. Agregar el path a la variable de entorno
2. IDE IntelliJ IDEA
3. Java 11

> **NOTA**: 
> * Una vez instalado Intellij, es necesario instalar los plugins de Gherkin y Cucumber. (*[Guia de instalación plugins en intellij](https://www.jetbrains.com/help/idea/managing-plugins.html)*) 
> * Para la ejecución de las pruebas se utilizó el navegador google chrome en la versión ( 113.0.5672.63 )

## Ejecución local

Para ejecutar el features por linea de comando

```bash 
gradle clean test 
```

## Reporte
Luego de realizar la ejecución podemos revisar el reporte  **index.html**  generado por serenity, que se encuentra en el siguiente path:
```bash
PurchaseFlowTest\target\site\serenity\scripts\index.html
```


> **NOTA**:
> * Para ejecutar el proyecto se necesita Java JDK 11 y Gradle con la versión 7.3.3 o superior.
> * Para poder instalar gradle en windows podemos seguir el siguiente tutorial https://www.geeksforgeeks.org/how-to-install-gradle-on-windows/.
> * Para las pruebas E2E, el reporte serenity se genera en la ruta **target/site/serenity/index.html



## Construido con

La automatización fue desarrollada con: 
* BDD - Estrategia de desarrollo
* Screenplay 
* Gradle - Manejador de dependencias
* Cucumber - Framework para automatizar pruebas BDD
* Serenity BDD - Biblioteca de código abierto para la generación de reportes
* Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

## Documentación

[Manual SerenityBDD](https://pichincha.atlassian.net/wiki/spaces/CS/pages/2440757667/Manual+Arquetipo+SerenityBDD+ScreenPlay)