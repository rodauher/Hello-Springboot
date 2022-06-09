# Hello-springrest

Proyecto de ejemplo de API REST con Spring boot.
Incluye un `Dockerfile` que ilustra el concepto de multi-stage builds.

## Instrucciones utilizando `Docker`

* Para contruir la imagen:

```shell
docker build -t hello-springrest:latest .
```
* Para lanzar el contenedor:
```shell
docker run -it --rm -p 8080:8080 hello-springrest
```

## Instrucciones utilizando `docker-compose`
* Para contruir:

```shell
docker-compose build
```
* Para ejecutar:
```shell
docker-compose up
```