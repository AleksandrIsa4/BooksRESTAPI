Для запуска приложения необходимо собрать jar файлы приложения командой в maven "mvn clean package spring-boot:repackage " После Docker Compose запустить проект с сервисами book-server, book-db командой docker compose up

При запуске book-server на адресе http://localhost:8080/swagger-ui/index.html# будет доступен swagger

Список всех книг и авторов фильтруется интерфейсом Pageable