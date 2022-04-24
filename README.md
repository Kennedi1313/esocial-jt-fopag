# esocial-jt-fopag

## Instruções:
Cada container é um projeto do esocial-jt para uma ciade específica, tem seu proprio banco de dados mas todas utilizam a mesma imagem do esocial-jt (que está na pasta esocial-jt).

### Para atualizar a imagem do projeto esocial-jt:
1 - Atualize a pasta com o código fonte através do git (git pull origin main)
2 - Pare todos os containers (docker stop $(docker ps -aq))
3 - Exclua todos os containers parados (docker rm $(docker ps -aq))
4 - Builde o projeto esocial-jt (mvn clean install)
5 - Builde uma imagem a partir de um dockerfile (docker build -t tstlabs/esocial-jt-service .)
6 - Suba todos os containers novamente (docker-compose up & [ em todas as pastas ])

