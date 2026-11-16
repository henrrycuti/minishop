# MiniShop REST API

[![CI](https://github.com/henrrycuti/minishop/actions/workflows/ci.yml/badge.svg)](https://github.com/henrrycuti/minishop/actions/workflows/ci.yml)

API de productos con Java 17 y Spring Boot. Laboratorio 13 de TECSUP.

## Verificación local

    mvn clean verify

Surefire ejecuta las pruebas unitarias. Failsafe ejecuta las pruebas de integración y verifica el paquete.

## GitHub Actions

El workflow se activa con pushes a main, Pull Requests a main y etiquetas v*. Contiene los jobs Build y pruebas y Publicar versión.

La rama main requiere el check Build y pruebas. La etiqueta v1.0.0 debe apuntar a main después de fusionar ambos Pull Requests.

