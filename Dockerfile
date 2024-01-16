FROM ubuntu:latest
LABEL authors="tsantana"

ENTRYPOINT ["top", "-b"]