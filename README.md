# Trabajo Práctico Integrador — Contacts API (Spring Boot)

Proyecto base: API de Contactos (Spring Boot Java 21) + Front estático.

## Integrantes
- Poccia Mario
- Ramella Sebastian
- Rios Pilar
- Sola Joaquin

## Objetivos del TP
- Configurar control de versiones en GitHub con Gitflow.
- Subir el código, ignorar archivos locales, hacer cambios y releases.
- Manejar bugfixes en producción (hotfix) y nuevas features (feature branches).
- Documentar con README y Pull Requests.


## Requisitos
- Java 21
- Maven Wrapper incluido (`demo/mvnw`), no requiere Maven instalado

## ¿Qué incluiría en el README?

#### Documentacion en GIT
En cada Pull Request (PR) o Merge Request (MR) se deberá incluir la información básica sobre el código subido, su estructura, el proceso para ejecutarlo y la forma en que se verificó su correcto funcionamiento.

#### Reglas Commits

Los commits deben llevar un prefijo que identifique el tipo de cambio realizado:
- feat: nueva funcionalidad.
- fix: correccion de error.
- rfe: mejora interna sin cambios funcionales.
- docs: documentacion.
- chore: tareas de mantenimiento.

El mensaje en el commit debe ser breve y descriptivo

#### Reglas pipeline para PR o MR (Herramienta que ofrece GitHub)
COnfigurar para todo PR/MR validaciones automáticas que garanticen el cumplimiento de las reglas mínimas de control de cambios:

- Mantener un CHANGELOG.md donde se registre si lo incorporado corresponde a un fix o un feature, junto con el nombre de la rama asociada.
- El PR/MR no debe presentar conflictos de merge
- Los commit respeten las reglas de commits.
- Nombre de las ramas sean correctos para features o hotfix.